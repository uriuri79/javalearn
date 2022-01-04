package lesson1_2;

public class HomeWorkLesson1_2 {
    public static void main(String[] args) {
        checkSum(2, 16);
        isPositive(13);
        checkPositive(26);
        printString("I study Java", 5);
        isLeapYear(2020);
    }

    public static void checkSum(int numberOne, int numberTwo) {
        int summ = numberOne + numberTwo;
        if (summ > 10 && summ <= 20) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void isPositive(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static void checkPositive(int number) {
        if (number <= 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void printString (String str, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(str);
        }
    }

    public static void isLeapYear (int year) {
        int res = year % 4;
        int res1 = year % 100;
        int res2 = year % 400;
        if ((res == 0 && res1 == 0 && res2 == 0) || (res == 0 && res1 != 0)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
