package Home;

public class HomeWorkApp {

    public static void main(String[] arar) {
        System.out.println("Hellow teacher");
        //.........
        printThreeWords();
        checkSumSign();
        printColor(101);
        compareNumbers();

    }
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

        }
public static void  checkSumSign(){
        int a = 20;
        int b = 20;
        System.out.println(a-b);
        if (a-b >= 0) {
            System.out.println("Sum is positive");
        }
        else {
            System.out.println("Sum is negative");

        }
}
public static void printColor(int value){
        System.out.println(value);

        if (value <= 0){
            System.out.println("Red");
        } else if (value > 0 && value <= 100){
            System.out.println("Yellow");
        } else if (value > 100){
        System.out.println("Green");
    }

    }
    public static void compareNumbers(){
        int a = 12;
        int b = 11;
        if (a>=b){
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");

        }


    }


}


