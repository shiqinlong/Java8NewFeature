package com.shiqla.java8;

import java.util.ArrayList;
import java.util.List;

/**
 * Desc
 * Auth c5285333
 * Date 2020-05-15
 */
public class Demo1Class
{

    public static void main (String[] args)
    {
        System.out.println("test");

        List list = new ArrayList();

        list.add(22);
        list.add(23);
        list.add(12);
        list.add(25);
        list.add(27);
        list.add(12);
        list.add(32);
        list.add(41);

        list.stream().forEach(num->{
            System.out.println(num + " ");
        });


    }
}
