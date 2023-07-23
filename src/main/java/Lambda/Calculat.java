package Lambda;

public interface Calculat {
    Integer test(int a, int b);
}
class LamTestCal {
    public static void main(String[] args) {
        Calculat c = (int a, int b) -> a + b;

        LamTestCal lm = new LamTestCal();
        int result = c.test(5, 8);
        System.out.println("VAlue is "+result);
    }
}

