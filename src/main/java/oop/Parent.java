package oop;

public class Parent {
    public  void m1(){
        System.out.println("Parent m1 method");
    }
}
class Child extends Parent{
    public  void m1(){
        System.out.println("Child m1 method");
    }
}
class Main{
    public static void main(String[] args) {
        Parent ch=new Child();
        ch.m1();
        Child ch2=new Child();
        ch2.m1();

        Parent ch1=new Parent();
        ch1.m1();
    }
}
