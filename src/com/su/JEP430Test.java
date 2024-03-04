package com.su;

import static java.lang.StringTemplate.RAW;
import static java.lang.StringTemplate.STR;
import static java.util.FormatProcessor.FMT;

/**
 * 字符串模板（预览）
 */
public class JEP430Test {

    private static final String NAME = "ZhangSan";

    public static void main(String[] args) {
        String name = "小明";

        //模板处理器一：STR。\｛｝表达式
        String message1 = STR."Hello \{name}!";
        System.out.println("message1=" + message1);
        //模板处理器二：FMT。和STR类似，可以接受格式说明符，位于表达式左边，用于控制输出的样式
        String message2 = FMT."Hello \n\{name}!";
        System.out.println("message2=" + message2);
        //模板处理器三：RAW。返回一个 StringTemplate 对象
        StringTemplate st = RAW."Hello \{name}";
        String message3 = STR.process(st);
        System.out.println("message3=" + message3 + "   st=" + st.toString());

        //支持局部变量、静态变量、方法
        String message4 = STR."Hello \{NAME}";
        String message5 = STR."Hello \{getName()}";
        System.out.println("message4=" + message4 + ",  message5=" + message5);

        //计算表达式
        int a = 10, b = 20;
        String result1 = STR."\{a}+ \{b}"; // 10+ 20
        String result2 = STR."\{a + b}"; // 30
        String result3 = STR."\{a} + \{b} = \{a + b}"; // 10 + 20 = 30
        System.out.println("result1 = " + result1 + ",  result2=" + result2 + ",  result3=" + result3);
    }

    public static String getName() {
        return "LiSi";
    }

}
