interface  TestInter {
    void test(int a);

    class TestInterface {
        public static void main(String[] args) {
       // TestInter t=new TestInter();
            TestInter t= (int a)-> System.out.println(a*a);
              t.test(10);
        }
    }
}

