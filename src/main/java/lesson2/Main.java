package lesson2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n--- Задание 1 ---");
        printThreeWords();
        System.out.println("\n--- Задание 2 ---");
        checkSumSign();
        System.out.println("\n--- Задание 3 ---");
        printColor();
        System.out.println("\n--- Задание 4 ---");
        compareNumbers();
        System.out.println("\n--- Задание 5 ---");
        checkSum(5, 10);
        System.out.println("\n--- Задание 6 ---");
        checkNumber(9);
        System.out.println("\n--- Задание 7 ---");
        isNegative(-6);
        System.out.println("\n--- Задание 8 ---");
        printString("Hello Java", 4);
        System.out.println("\n--- Задание 9 ---");
        isLeapYear(2026);
        System.out.println("\n--- Задание 10 ---");
        changeArray();
        System.out.println("\n--- Задание 11 ---");
        fillArray();
        System.out.println("\n--- Задание 12 ---");
        transformArray();
        System.out.println("\n--- Задание 13 ---");
        fillMatrix();
        System.out.println("\n--- Задание 14 ---");
        initArray(6, 4);
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 12;
        int b = -10;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 6;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 17;
        int b = 15;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean checkSum(int a, int b) {
        int sum = a + b;
        boolean result = sum >= 10 && sum <= 20;
        System.out.println(result);
        return result;
    }

    public static void checkNumber(int number){
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isNegative(int number) {
        boolean result = number < 0;
        System.out.println(result);
        return result;
    }

    public static void printString(String text, int count){
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }
    public static boolean  isLeapYear(int year){
        if (year % 400 == 0) {
            System.out.println(true);
            return true;
        } else if (year % 100 == 0) {
            System.out.println(false);
            return false;
        } else if (year % 4 == 0) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }
    public static void changeArray() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Исходный массив: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        System.out.println("Измененный массив: " + Arrays.toString(array));
    }
    public static void fillArray(){
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++){
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void transformArray(){
        int[] array = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Исходный массив: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++){
            if (array[i] < 6){
                array[i] = array[i] * 2;
            }
        }
        System.out.println("Измененный массив: " + Arrays.toString(array));
    }

    public static void fillMatrix(){
        int[][] matrix = new int[10][10];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if (i == j || j == matrix[0].length - i - 1) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public static void initArray(int len, int initialValue){
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++){
            array[i] = initialValue;
        }
        System.out.println(Arrays.toString(array));

    }
}


