package com.tcc.main;

import java.text.DecimalFormat;

/**
 * @Description 描述
 * @Company <a href="http://www.adatech.cn">www.adatech.cn</a>
 * @Author Tu chengcheng
 * @Date 2018年9月30日下午4:25:06
 */
public class DoubleTest {

    public static void main(String[] args) {
//        DecimalFormat dec = new DecimalFormat("0.0000");
//        String format = dec.format("0.0099");
//        
        Float valueOf = Float.valueOf("0.0099");
        System.out.println(valueOf*100);
        double parseDouble = Double.parseDouble("0.0099");
        System.out.println(parseDouble);
        long longValue = new Double(Double.parseDouble("0.0099") * 10000).longValue();
        System.out.println(longValue);
    }
}
