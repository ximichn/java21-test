package com.su;

/**
 * switch模式：允许在case中使用模式匹配
 */
public class JEP441Test {

    public static void main(String[] args) {
        Object obj = 123456789L;
        switch (obj) {
            case Integer i -> System.out.println("Integer is " + i);
            case Long l -> System.out.println("Long is " + l);
            case Double d -> System.out.println("Double is " + d);
            default -> obj.toString();
        }
    }

}
