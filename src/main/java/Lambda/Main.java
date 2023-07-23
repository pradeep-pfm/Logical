package Lambda;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Systems started ");
//        Runnable r=()->{};
//        new Thread(r).start();

        Predicate<Integer> pr=i->(i>18);
            System.out.println(pr.test(19));
    }
}
