package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        String[] strArr = {"aaa", "bbb", "ccc", "ddd", "eee"};
        Integer[] intArr = {1, 2, 3, 4, 5};

        System.out.println("Task 1 ---------------------------------------");
        System.out.println(Arrays.toString(strArr));
        arrToSwap(strArr, 0,3);
        System.out.println(Arrays.toString(strArr));

        /*System.out.println(Arrays.toString(intArr));
        arrToSwap(intArr, 2, 0);
        System.out.println(Arrays.toString(intArr));*/

        System.out.println("Task 2 ------------------------------------------");
        ArrayList<Integer> list1 = arrToList(intArr);
        System.out.println(list1);

        /*ArrayList<String> list2 = arrToList(strArr);
        System.out.println(list2);*/

        System.out.println("Task 3 ----------------------------------------------");
        task3();




    }

    private static <T> void arrToSwap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static <T> ArrayList<T> arrToList(T[] array) {
        ArrayList<T> arrList = new ArrayList<>(Arrays.stream(array).toList());
        return arrList;
    }


    private static void task3() {
        Apple apple = new Apple();
        Orange orange = new Orange();
        Box<Orange> orangeBox1 = new Box();
        Box<Orange> orangeBox2 = new Box();
        Box<Apple> appleBox1 = new Box();

        for (int i = 0; i < 3; i++) {
            orangeBox1.add(new Orange());
        }

        for (int i = 0; i < 4; i++) {
            orangeBox2.add((new Orange()));
        }
        for (int i = 0; i < 6; i++) {
            appleBox1.add(new Apple());
        }

        orangeBox1.info();
        orangeBox2.info();
        appleBox1.info();

        Float orange1Weight = orangeBox1.getWeight();
        Float orange2Weight = orangeBox2.getWeight();
        Float apple1Weight = appleBox1.getWeight();
        System.out.println("Вес коробки 1 с апельсинами: " + orange1Weight);
        System.out.println("Вес коробки 2 с апельсинами: " + orange2Weight);
        System.out.println("Вес коробки 1 с яблоками: " + apple1Weight);

        System.out.println("Сравнить вес orangeBox1 и appleBox: " + orangeBox1.compare(appleBox1));
        System.out.println("Сравнить вес orangeBox2 и appleBox: " + orangeBox2.compare(appleBox1));

        orangeBox1.moveAt(orangeBox2);

        orangeBox1.info();
        orangeBox2.info();
        appleBox1.info();
    }


}

