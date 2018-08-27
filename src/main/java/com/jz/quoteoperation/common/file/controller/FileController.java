package com.jz.quoteoperation.common.file.controller;


import com.jz.quoteoperation.common.constant.CommonConstants;
import com.jz.quoteoperation.common.exception.BizException;
import com.jz.quoteoperation.common.file.service.FileService;
import com.jz.quoteoperation.user.bo.UserInfoBO;
import com.jz.quoteoperation.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLDecoder;
import java.util.*;


/**
 * 　　 ┏┓   ┏┓
 * 　　┏┛┻━━━┛┻┓
 * 　　┃       ┃
 * 　　┃   ━   ┃
 * 　　┃ ┳┛ ┗┳ ┃
 * 　　┃       ┃
 * 　　┃   ┻   ┃
 * 　　┃       ┃
 * 　　┗━┓   ┏━┛
 * 　　  ┃   ┃
 * 　　  ┃   ┃
 * 　　  ┃   ┗━━━┓
 * 　　  ┃       ┣┓
 * 　　  ┃       ┏┛
 * 　　  ┗┓┓┏━┳┓┏┛
 * 　　   ┃┫┫ ┃┫┫
 * 　　   ┗┻┛ ┗┻┛
 *
 * @author 张成
 * @date 2018/8/14
 */


@Controller
@RequestMapping(value = "/file")
public class FileController {

    private static final Logger logger = LoggerFactory.getLogger(FileController.class);

    @Autowired
    private FileService fileService;
    @Autowired
    UserService userService;

    @RequestMapping(value = "/index")
    public String indextest() {
        return "file";
    }

    @RequestMapping(value = "/upload")
    @ResponseBody
    public Map upload(String username, MultipartFile[] files, Long maxSize, Integer width, Integer height,
                      HttpServletRequest request) throws Exception {
        Map result = new HashMap();
        List<UserInfoBO> UserInfoBO = userService.queryUserAuth(username);

        int i = 0;
        for (MultipartFile file : files) {
            i = i + 1;
            File directory = new File(CommonConstants.UPIMG_Path);//参数为空
            String basePath = directory.getCanonicalPath();//标准的路径
            Calendar a = Calendar.getInstance();
            String ripath= a.get(Calendar.YEAR) + "-" + (a.get(Calendar.MONTH) + 1) + "-" + a.get(Calendar.DATE);
            String usrpath=UserInfoBO.get(0).getLgcSn().toString();
            String filepath = basePath + "/" +ripath + "/" + usrpath;
            if (maxSize != null && file.getSize() > maxSize) {
                throw new BizException(String.format("文件大小不能超过%d字节", maxSize));
            }
            String fileExtension = file.getOriginalFilename();
            if (fileExtension != null) {
                fileExtension.toLowerCase();
            }
            Map data = new HashMap();

            try {
                InputStream inputStream = null;
//            if (width != null && height != null) {
//                String targetFile = processImage(file, width, height);
//                inputStream = new FileInputStream(targetFile);
//            } else {
                inputStream = file.getInputStream();
//            }
                fileService.storeToTemp(inputStream, fileExtension, filepath);
                String originalFileName = URLDecoder.decode(file.getOriginalFilename(), "UTF-8");
                String imgpath=CommonConstants.UPIMG_Path.substring(CommonConstants.UPIMG_Path.lastIndexOf("/")+1) ;
                data.put("filePath", imgpath+"/"+ripath+ "/" + usrpath + "/" + fileExtension);
                data.put("fileName", originalFileName);
                result.put(i, data);
            } catch (Throwable e) {
                throw new BizException(String.format("文件上传出错!"));

            }
        }
        return result;
    }

//    private String processImage(MultipartFile file, Integer width, Integer height) {
//        try {
//            String dir = config.getTmpDir();
//            String srcFilePath = dir + "/" + UUID.randomUUID().toString();
//            file.transferTo(new File(srcFilePath));
//            String targetFilePath = dir + "/" + UUID.randomUUID().toString();
//            ImageUtil.alterImgSize(srcFilePath, targetFilePath, width, height);
//            (new File(srcFilePath)).delete();
//            return targetFilePath;
//        } catch (Throwable e) {
//            logger.error("Processing uploaded image failed", e);
//            throw new BizException("处理图片失败!");
//        }
//    }

    @RequestMapping(value = "/down")
    @ResponseBody
    public HttpServletResponse downloadFile(HttpServletResponse response, HttpServletRequest request,
                                            String pathUrl, String name) {
        try {
            //这里获取一个 response 对象，如果不知道怎么获取的话，那么你也可以把   HttpServletResponse response 当做一个参数传递到这个方法中，直接使用即可
//            HttpServletResponse response = getResponse();
            String pathurlDecode = URLDecoder.decode(pathUrl, "utf-8");

            File file = new File(pathurlDecode);

            //这里获取服务器的绝对路径。如果不会用的话，用下面注释掉的方法就可以
//            String filePath = getServletContext().getRealPath("/");
            //用下面的方法前，需要把HttpServletRequest request当做一个参数传递到本方法中，直接使用即可
            String filePath = request.getSession().getServletContext().getRealPath("/");

            InputStream fis = new BufferedInputStream(new FileInputStream(pathurlDecode));

            byte[] buffer = new byte[fis.available()];

            fis.read(buffer);

            fis.close();

            response.reset();

            OutputStream toClient = new BufferedOutputStream(response.getOutputStream());

            response.addHeader("Content-Disposition", "attachment;filename=" + new String(name.getBytes(), "utf-8"));

            toClient.write(buffer);

            toClient.flush();

            toClient.close();

            response.setContentType("application/octet-stream");
            //这里的addHeader方法，如果报错，请使用下方注释掉的方法。
//            response.addHeader("Content-Length", file.length());
            //把第二个参数更改为String 类型即可
            response.addHeader("Content-Length", String.valueOf(file.length()));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return null;
    }
}
