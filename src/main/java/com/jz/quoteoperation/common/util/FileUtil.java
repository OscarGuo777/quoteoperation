package com.jz.quoteoperation.common.util;

import org.apache.commons.io.FileUtils;
import org.springframework.util.StringUtils;

import java.io.*;

/**
 * Created by Administrator on 2016/4/6.
 */
public class FileUtil {

    /**
     * 描述: 文件复制缓冲区大小
     */
    private static int BUFFER_SIZE = 1024*1024*5;

    /**
     * 描述: 判断文件或目录是否存在
     *
     * @param filePath 文件或目录路径
     * @return 存在返回true, 不存在返回false
     */
    public static boolean isFileExist(String filePath) {
        return (new File(filePath)).exists();
    }


    /**
     * 新建目录
     *
     * @param folderPath String 如 c:/fqf
     * @return boolean 创建成功返回true,失败返回false
     */
    public static boolean newFolder(String folderPath) {
        try {
            String filePath = folderPath;
            filePath = filePath.toString();
            File myFilePath = new File(filePath);
            if (!myFilePath.exists()) {
                return myFilePath.mkdirs();
            }
            return true;
        } catch (Exception e) {
            System.out.println("create folder failed!");
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 复制单个文件
     *
     * @param oldPath String 原文件路径 如：c:/fqf.txt
     * @param newPath String 复制后路径 如：f:/fqf.txt
     * @return boolean 复制成功返回true,失败返回false
     */
    public static boolean copyFile(String oldPath, String newPath) {
        try {
            // int bytesum = 0;
            int byteread = 0;
            File oldfile = new File(oldPath);
            if (oldfile.exists()) { // 文件存在时
                InputStream inStream = new FileInputStream(oldPath); // 读入原文件
                FileOutputStream fs = new FileOutputStream(newPath);
                byte[] buffer = new byte[BUFFER_SIZE];
                while ((byteread = inStream.read(buffer)) != -1) {
                    fs.write(buffer, 0, byteread);
                }
                inStream.close();
                fs.flush();
                fs.close();
            }
            return true;
        } catch (Exception e) {
            System.out.println("copy file failed!");
            e.printStackTrace();
            return false;
        }
    }

    /**
     *
     * Illustrate:write content into file
     *
     * @return boolean
     *
     */
    public static void writeFile(InputStream inputStream, String pathAndFileName) {
        try {
            File file=new File(pathAndFileName);
            if(!file.exists()){
                file.createNewFile();
            }
            FileOutputStream os=new FileOutputStream(file,true);
            int bytesRead = 0;
            byte[] buffer = new byte[8192];
            while ((bytesRead = inputStream.read(buffer, 0, 8192)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
            os.close();
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public static boolean moveFile(String oriPath, String newPath) throws Exception {
//        String newDir = newPath.substring(0, newPath.lastIndexOf("/"));
//        // 判断新目录是否存在，不存在就创建
//        if (!FileUtil.isFileExist(newDir)) {
//            FileUtil.newFolder(newDir);
//        }
//        File oriFile = new File(oriPath);
//        // Destination directory
//        File newFile = new File(newPath);
//        // Move file to new directory
//        FileUtils.moveFile(oriFile, newFile);
//        return true;
//    }

    public static void deleteFile(String filepath) throws IOException {
        File f = new File(filepath);//定义文件路径
        if (f.exists() && f.isDirectory()) {//判断是文件还是目录
            if (f.listFiles().length == 0) {//若目录下没有文件则直接删除
                f.delete();
            } else {//若有则把文件放进数组，并判断是否有下级目录
                File delFile[] = f.listFiles();
                int i = f.listFiles().length;
                for (int j = 0; j < i; j++) {
                    if (delFile[j].isDirectory()) {
                        deleteFile(delFile[j].getAbsolutePath());//递归调用del方法并取得子目录路径
                    }
                    delFile[j].delete();//删除文件
                }
            }
        }
    }
}
