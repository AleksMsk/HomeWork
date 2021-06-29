public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumber();
    }
    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    private static void checkSumSign() {
        int a = 5;
        int b = 8;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    private static void printColor() {
        int value = 101;
        if (0 >= value) {
            System.out.println("Красный");
        } else if (100 >= value) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    private static void compareNumber() {
        int a = 18;
        int b = 26;
        boolean result = (a>=b);
        if (result) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
