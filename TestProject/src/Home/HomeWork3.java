package Home;

import java.util.Random;

public class HomeWork3 {
    public static Random random = new Random();

    public static void main(String[] args) {
        work1();
        System.out.println();
        work2();
        System.out.println();
        work3();
        System.out.println();
        work4();
        System.out.println();
        work5(10, 8);
        System.out.println();
    }


    public static void work1() {
        System.out.println("Work1");
        int[] MyArr1 = {1, 0, 1, 0, 0, 0, 1, 1};
        for (int i = 0; i < MyArr1.length; i++) {
            System.out.print(MyArr1[i] + " | ");
        }
        System.out.println();
        for (int i = 0; i < MyArr1.length; i++) {
            if (MyArr1[i] == 1) {
                MyArr1[i] = 0;
            } else if (MyArr1[i] == 0) {
                MyArr1[i] = 1;
            }
            System.out.print(MyArr1[i] + " | ");
        }
    }

    public static void work2() {
        System.out.println("Work2");
        int[] MyArr2 = new int[100];
        for (int i = 0; i < 100; i++) {
            MyArr2[i] = i + 1;
            System.out.print(MyArr2[i] + " | ");
        }
    }

    public static void work3() {
        System.out.println("Work3");
        int[] MyArr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < MyArr3.length; i++) {
            System.out.print(MyArr3[i] + " | ");
        }
        System.out.println();
        for (int i = 0; i < MyArr3.length; i++) {
            if (MyArr3[i] < 6) {
                MyArr3[i] = MyArr3[i] * 2;
            }
            System.out.print(MyArr3[i] + " | ");
        }
    }

    public static void work4() {
        System.out.println("Work4");
        int[][] MyArr4 = new int[6][6];
        for (int i = 0; i < MyArr4.length; i++) {
            for (int j = 0, x = MyArr4[i].length - 1; j < MyArr4[i].length; j++, x--) {
                if (i == j || i == x) MyArr4[i][j] = 1;
                else MyArr4[i][j] = 0;
                System.out.print(MyArr4[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void work5(int len, int InitialValue) {
        System.out.println("Work5");
        int[] MyArr5 = new int[len];
        for (int i = 0; i < MyArr5.length; i++) {
            MyArr5[i] = InitialValue;
            System.out.print(MyArr5[i] + " | ");
        }
    }
}
