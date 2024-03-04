package com.su;

import java.util.ArrayList;
import java.util.List;

/**
 * 有序集合 SequencedCollection
 * 无论遍历多少遍，元素的顺序始终是固定的
 */
public class JEP431Test {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.addFirst(0);
        list.addLast(2);
        System.out.println("list=" + list);
        System.out.println("first=" + list.getFirst());
        System.out.println("last=" + list.getLast());
        System.out.println("reverseList=" + list.reversed());
    }

}
