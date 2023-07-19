package Lambda;

public class SAMTest{
    public static void main(String[] args) {

    MyInterface i=()->{
        System.out.println("Fisrt Lambda Expersion");
    };
    i.sayHello();
    }
}

