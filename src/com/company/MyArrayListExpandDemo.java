package com.company;

public class MyArrayListExpandDemo {

    public static void main(String[] args) {
        MyArrayListExpand<String> myArrayListExpand = new MyArrayListExpand<>();
        myArrayListExpand.add("1");
        myArrayListExpand.add("2");
        myArrayListExpand.add("3");
        myArrayListExpand.add("4");
        myArrayListExpand.add(3, "10");
        myArrayListExpand.add("5");
        myArrayListExpand.add("6");

        for (int i = 0; i < myArrayListExpand.size(); i++) {
            System.out.println(myArrayListExpand.get(i));
        }

        myArrayListExpand.remove(2);
        for (int i = 0; i < myArrayListExpand.size(); i++) {
            System.out.println(myArrayListExpand.get(i));
        }
    }
}
