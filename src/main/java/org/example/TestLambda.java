package org.example;

import Lambda.Interf1;

public class TestLambda implements Interf1 {
    public static void main(String[] args) {


        Interf1 ii1=()->{
            System.out.println("Normal method implemented");
        };
        ii1.test();
    }
    public void test(){

    }



}
