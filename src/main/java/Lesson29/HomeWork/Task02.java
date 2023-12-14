package Lesson29.HomeWork;

import java.util.Scanner;

public class Task02 {
    //Завдання 2: Користувач з клавіатури вводить
    // значення масив, після чого запускаються два потоки.
    // Перший потік знаходить суму елементів в масиві.
    // Другий потік знаходить середнє арифметичне в масиві.
    // Результати обчислень повертаються у метод main.

    static class ArrSum extends Thread {
        int[] arr;

        public ArrSum(int[] arr) {
            this.arr = arr;
        }

        @Override
        public void run() {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            System.out.println("sum = " + sum);
        }
    }

    static class ArrAvarege extends Thread {
        int[] arr;

        public ArrAvarege(int[] arr) {
            this.arr = arr;
        }

        @Override
        public void run() {
            int sum = 0;
            double avarege = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
                avarege = (double) sum / arr.length;
            }
            System.out.println("avarege = " + avarege);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array lenght = ");
        int length =sc.nextInt();
        System.out.println("Enter values = ");
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        ArrSum arrSum = new ArrSum(arr);
        ArrAvarege arrAvarege = new ArrAvarege(arr);

        arrSum.start();
        arrAvarege.start();

        try {
            arrSum.join();
            arrAvarege.join();
        } catch (InterruptedException ex) {
        }
    }
}