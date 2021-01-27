package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(22);
        arrayList.add(133);
        arrayList.add(11111);

        Integer x = arrayList.indexOf(22);
        System.out.println(x);

        arrayList.add(3, x);
        System.out.println(arrayList);

        arrayList.remove(x);
        System.out.println(arrayList);

        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(3);
        arrayList1.addAll(1,arrayList);
        System.out.println(arrayList1);

    }
}
