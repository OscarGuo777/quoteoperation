package com.jz.quoteoperation.common.file.service.impl;

import com.jz.quoteoperation.common.config.ApplicationConfig;
import com.jz.quoteoperation.common.exception.BizException;
import com.jz.quoteoperation.common.file.service.FileService;
import com.jz.quoteoperation.common.util.FileUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;


/**
 *
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
 * @author 张成
 * @date    2018/8/14
 */


@Service(value = "FileService")
public class FileServiceImpl  implements FileService {

    private static final Logger logger = LoggerFactory.getLogger(FileServiceImpl.class);

    @Autowired
    private ApplicationConfig config;

    @Override
    public String storeToTemp(InputStream inputStream, String fileName,String path) {
        return this.store(inputStream, fileName, path, false);
    }

    /**
     *
     * @param inputStream
     * @param fileName
     * @param filePath  相对路径--相对temDir
     * @param cover 同名文件是否覆盖
     * @return
     */
    private String store(InputStream inputStream, String fileName, String filePath, boolean cover) {
        String tmpDir = config.getTmpDir();
        if(tmpDir!=null){
            if(!tmpDir.equals("")){
                FileUtil.newFolder(tmpDir);
            }
        }else if(filePath!=null || !filePath.equals("")) {
            if(!filePath.equals("")){
                FileUtil.newFolder(filePath);

            }
        }
        try {
            File file;
            if(filePath == null || "".equals(filePath)){
                file = new File(tmpDir + File.separator + fileName);
            }else if( tmpDir == null || "".equals(tmpDir)){
                file = new File(File.separator + filePath + File.separator + fileName);
            }else {
                file = new File(tmpDir + File.separator + filePath + File.separator + fileName);
            }
            if (!file.exists()) {
                file.createNewFile();
            }else{
                if(cover){
                    file.delete();
                    file.createNewFile();
                }
            }
            FileOutputStream os = new FileOutputStream(file, true);
            int bytesRead = 0;
            byte[] buffer = new byte[8192];
            while ((bytesRead = inputStream.read(buffer, 0, 8192)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
            os.close();
            inputStream.close();
        } catch (Exception e) {
            throw new BizException("文件存储失败!");
        }
        return tmpDir + File.separator + filePath + File.separator + fileName;
    }



    @Override
    public File getFromTemp(String fileName) {
        String tmpDir = config.getTmpDir();
        return new File(tmpDir + File.separator + fileName);
    }

    @Override
    public void deleteTempFile(String fileName) {
        String tmpDir = config.getTmpDir();
        File file = new File(tmpDir + File.separator + fileName);
        if (file.exists() && !file.isDirectory()) {
            file.delete();
        }
    }
}
