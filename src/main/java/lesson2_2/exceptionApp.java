package lesson2_2;

public class exceptionApp {
    public static void main(String[] args) {
        String[][] right = {
                {"13", "23", "12", "45"},
                {"23", "45", "78", "21"},
                {"11", "44", "22", "44"},
                {"99", "78", "67", "56"}
        };

        String[][] wrongFirst = {
                {"13", "23", "12", "45"},
                {"23", "45", "78"},
                {"11", "44", "22", "44"},
                {"99", "78", "67", "56"}
        };

        String[][] wrongSecond = {
                {"13", "23", "12", "45"},
                {"23", "45", "78", "21"},
                {"11", "44", "22", "44"}
        };

        String[][] wrongThird = {
                {"13", "23", "12", "45"},
                {"df", "45", "78", "21"},
                {"11", "44", "22", "44"},
                {"99", "78", "67", "56"}
        };

        try {
            TestException(right);
            //TestException(wrongFirst);
            //TestException(wrongSecond);
            TestException(wrongThird);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }



public static void TestException (String[][] arr) throws MyArraySizeException, MyArrayDataException {
    if (arr.length != 4) throw new MyArraySizeException("Количество строк не соответствует");
    int summ = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i].length != 4) throw new MyArraySizeException("Количество столбцов в одной из строк не соответствует");
        for (int j = 0; j < arr[i].length; j++) {
            if (!isNumber(arr[i][j])) throw new MyArrayDataException("Один из элементов массива не является числом");
            summ += Integer.parseInt(arr[i][j]);
        }
    }
    System.out.println("Сумма всех элементов массива = " + summ);
}

public static boolean isNumber (String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
}

}
