package com.epam;


/**
 * Created by Hrinchenko on 12.03.2016.
 */
public class Main {

    public static Long compute(Byte a,Integer b){
Long c = new Long((long) a+b);
        return c;
    }
    public static void main(String[] args) {

        System.out.println(Main.compute(new Byte("120"),new Integer(140)));

    }
}
