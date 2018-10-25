package com.tcc.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 * @Description 描述
 * @Author Tu chengcheng
 * @Date 2018年6月4日下午4:41:17
 */
public class Test {

    public static void main(String[] args) {
        String path = "src/config/pro/activity.properties";
        try {
            FileInputStream inputStream = new FileInputStream(path);
            Properties prop = new Properties();
            prop.load(inputStream);
            prop.setProperty("ada.activity", "122555529");
            FileOutputStream outputStream = new FileOutputStream(path);
            prop.store(outputStream, "update message");
            outputStream.close();
            inputStream.close();
            System.out.println("success");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
