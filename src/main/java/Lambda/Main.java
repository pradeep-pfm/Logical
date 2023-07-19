package Lambda;

public class Main {
    public static void main(String[] args) {
        System.out.println("Systems started ");
        Runnable r=()->{
        };
        new Thread(r).start();
    }
}
