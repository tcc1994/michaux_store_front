package com.tcc.main;

/**
 * @Description 描述
 * @Author Tu chengcheng
 * @Date 2018年6月27日下午3:45:13
 */
public class Testt {

    public static void main(String[] args) {
        String s = "sPring";
        char[] cs1 = s.toCharArray();
        char[] cs2 = s.toCharArray();
        char[] cs3 = s.toCharArray();
        int a = 0;
//        name1(cs1);
        name2(cs2, a);
        name3(cs3,a);
    }
    public static void name1(char[] cs) {
        for (char c : cs) {
            System.out.print(c + ",");
        }
    }
    
    /**
     * for循环
     * 对数值进行了加减运算
     * 有赋值给原来的cs数组
     * (加减--更改的都是原来的数组)
     */
    public static void name2(char[] cs,int a) {    
        for (int i = 0; i < cs.length - 1; i++) {
            System.out.println(cs[i]+"//-----name2");
            if (cs[i] >= 97 && cs[i] <= 122) {
                cs[i] -= 32;
                a++;
                System.out.println(cs[i]+"//-----name2======");
            }
            if (a == 2) {
                break;
            }
        }
        for (char c : cs) {
            System.out.print(c + ",");
        }

    }
    /**
     * foreach循环
     * 虽然对数值进行了加减运算
     * 但是没有赋值给原来的cs数组
     */
    public static void name3(char[] cs,int a) {   
        for (char b : cs) {
            System.out.println(b+"//-----name3");
            if (b >= 97 && b <= 122) {
                b -= 32;
                a++;
                System.out.println(b+"//-----name3=====");
            }
            if (a == 2) {
                break;
            }
        }
        for (char c : cs) {
            System.out.print(c + ",");
        }
    }
   
}
