package Lesson13.HomeWork;

import java.util.Random;
import java.util.Scanner;

//Завдання 6
//Створіть квадратний масив розмірності n заповнений
//випадковими числами. Виведіть масив на екран у вигляді
//таблиці. Знайдіть найменший і найбільший елементи масивуі
//виведіть їх на екран (якщо знайдено кілька однакових елементів
//— виведіть індекси рядка та стовпця, де є повторення). Виведіть
//на екран час виконання пошуку в мілісекундах. Розмірність
//масиву має задаватися з клавіатури.
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть розмірність масиву (n) - ");
        int n = sc.nextInt ();
        int [][] arr = new int[n][n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr [i] [j] = random.nextInt();

            }

        }
        System.out.println("Масив - ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", arr [i][j]);
            }
            System.out.println();
        }
        int min = arr [0] [0];
        int max = arr [0] [0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr [i] [j] < min){
                    min = arr [i] [j];
                }
                if (arr [i] [j] > max){
                    max = arr [i] [j];
                }
            }

        }
        System.out.println("Найменший елемент - " + min);
        System.out.println("Найбільший елемент - " + max);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr [i] [j] == min){
                    System.out.println("Повторення найменшого елемента -" + i + " та стовпці " + j);
                }
                if (arr [i] [j] == max){
                    System.out.println("Повторення найбільшого елемента -" + i + " та стовпці " + j);
                }
            }

        }
        long startTime = System.currentTimeMillis();
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Час виконання пошуку (мс) - " + executionTime);

    }

}