package com.training.org;

public class MainClass {
    public static void main(String[] args){
        XYZBank x1 = new XYZBank();
        System.out.println(x1);

        XYZBank x2 = new XYZBank("MyBank","Bangalore",10000);
        System.out.println(x2);
    }
}
