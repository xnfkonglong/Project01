package com.atguigu.bean;

import java.util.ArrayList;

/**
 * @create 2020 05 22 上午 11:46
 * 1、IDEA中代码模板所处的位置：settings - Editor - Live Templates / Postfix Completion
 * 2、常用的模板
 */

public class TempLatesTest{
    //模板六: prsf: 可生成private static final
    private static final Customer CUST = new Customer();
    //变形
    public static final int NUM = 1;
    //变形
    public static final int NUM2 =2;
    //变形psfs
    public static final String NATION ="china";

    //模板一：psvm
    public static void main(String[] args) {

        //模板二：sout
        System.out.println("Hello!");
        //变形：soutp / soutm /soutv / xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TempLatesTest.main");

        int num1 = 10;
        System.out.println("num1 = " + num1);
        int num2 = 20;
        System.out.println(num2);

        //模板三: fori
        String[] arr = new String[]{"a","b","c"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        //变形:iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模板四：list.for
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        for (Object o : list) {
            System.out.println(o);

        }
        //变形: list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }
        //变形：list.forr
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }

        //模板五： ifn
        if (list == null) {

        }
        //变形:inn
        if (list != null) {

        }
        //变形: xxx.nn / xxx.null
        if (list != null) {

        }
        if (list == null) {

        }


    }

}
