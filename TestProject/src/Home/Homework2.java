package Home;

public class Homework2 {
    public static void main(String[] args) {

        method1();
        System.out.println("********");
        method2();
        System.out.println("********");
        method3();
        System.out.println("********");
        method4("help", 5);

    }

    public static void method1() {

        System.out.println("method 1");
        int a = 5;
        int b = 6;
        int c = a + b;
        if (c > 10 && c < 20) {
            System.out.println("true");
        } else if (c < 10 && c > 20) {
            System.out.println("false");
        }

    }

    public static void method2() {
        System.out.println("method 2");
        int a = -1;
        if (a < 0) {
            System.out.println("negative");
        } else if (a >= 0) {
            System.out.println("positive");
        }

    }

    public static void method3() {
        System.out.println("method 3");
        int a = -1;
        if (a < 0) {
            System.out.println("true");
        } else if (a >= 0) {
            System.out.println("false");
        }
    }
    public static void method4(String str, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("[" + i + "]" + " " + str);
        }
    }
}









