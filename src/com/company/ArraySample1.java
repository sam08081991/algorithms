package com.company;

public class ArraySample1 {

    public static void main(String[] args) {
        char[] copyFrom = {
                'w', 'e', 'c', 'o', 'm', 'e',
                't', 'o',
                'g', 'p', 'c', 'o', 'd', 'e', 'r'
        };
        char[] copyTo = new char[7];

        System.arraycopy(copyFrom, 8, copyTo, 0, 7);
        System.out.println(new String(copyTo));
    }

}
