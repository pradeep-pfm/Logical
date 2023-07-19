package Lambda;

public interface Interf1 {
    void test();
    default void testDefault(){
        System.out.println("Defalut method in java 8");
    }
    static void testStatic(){   //these methods cannot be overridden or changed in the implementation class
        System.out.println("Static method in java 8");
    }
}

class Test{
    public static void main(String[] args) {
        Interf1  i=()-> System.out.println("Inetrface implemented with LAmbda");
        i.test(); //Normal interface method
        i.testDefault();//Default interface method

        Test t= new Test(); // calling static method with class name and interface name
        Interf1.testStatic();  //static method in interface
        //these methods cannot be overridden or changed in the implementation class
    }
}
// output is
