package com.wuhaitao.java.eight.basedata;

/**
 * @author wuhaitao
 * @Classname BaseData
 * @Description TODO
 * @Date 2021/6/23 16:55
 * @Created by wuhaitao
 */
public class BaseData {

    public static void main(String[] args) {
        /*---------数值类型---------*/

        //1字节  -128 ~ 127  变量初始化时默认值是0
        byte byteData = 123;
        System.out.println(byteData);

        //2字节 -32,768 ~ 32,767 变量初始化时默认值是0
        short shortData = 123;
        System.out.println(shortData);

        //4字节 -2,147,483,648 ~ 2,147,483,647 变量初始化时默认值是0
        int intData = 123;
        System.out.println(intData);

        //8字节 -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 变量初始化时默认值是0L
        long longData = 123L;
        System.out.println(longData);

        //4字节 3.4e-45 ~ 1.4e38  变量初始化时默认值0.0f  float类型数据必须要加 f 或者 F
        float floatData = 123F;
        System.out.println(floatData);

        //8字节 4.9e-324 ~ 1.8e308 变量初始化时默认值0.0d  double类型数据可以加 d 或 D 也可以不加
        double doubleData = 123D;
        System.out.println(doubleData);

        /*---------布尔类型---------*/
        //只有true false两个值 默认值false
        boolean booleanData = true;
        System.out.println(booleanData);

        /*---------字符类型---------*/
        //存储 Unicode 码，用单引号赋值 默认值是null'\u0000' (null)
        char charData = 'a';
        System.out.println(charData);
    }
}
