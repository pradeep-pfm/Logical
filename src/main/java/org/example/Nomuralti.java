package org.example;

import java.io.IOException;

//public class Nomuralti {
//}
class A {
    void print() {
        System.out.println("A");
    }
}

class B extends A {
    void print() {
        System.out.println("B");
    }
}

class C extends B {
    void print(){
        System.out.println("C");
    }
}

class Nomuralti {
    public static void main(String[] args) {
        A c = new C();
        c.print();
    }
}

