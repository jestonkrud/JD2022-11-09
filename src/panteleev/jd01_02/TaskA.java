package panteleev.jd01_02;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        step1(arr);
        step2(arr);
        step3(arr);
    }

    private static void step1(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int value : arr) {
            if (min > value){
                min = value;
            }
            if (max < value){
                max = value;
            }
        }
        System.out.println(min + " " + max);
    }

    private static void step2(int[] arr) {
        double sum = 0;
        for (int numbers : arr) {
            sum = sum + numbers;
        }
        double avg = sum/arr.length;
        for (int number : arr) {
            if (number<avg){
                System.out.print(number+" ");
            }
        }
        System.out.println();
    }

    private static void step3(int[] arr) {
        int min = arr[0];
        for (int elements : arr) {
            if (min>elements){
                min = elements;
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i]==min){
                System.out.print(i + " ");
            }
        }
    }
}
