package Lesson13.HomeWork;
import java.util.Scanner;
//Завдання 7
//Заповніть n-мірний квадратний масив числами за зростанням
//— змійкою. Виведіть результат на екран дотримуючись ширини
//стовпців.
//Приклад:
//1 2 3 4
//8 7 6 5
//9 10 11 12
//16 15 14 13
public class Task7 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введіть розмірність масиву (n): ");
            int n = scanner.nextInt();

            int[][] array = new int[n][n];

            int counter = 1;

            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < n; j++) {
                        array[i][j] = counter++;
                    }
                } else {
                    for (int j = n - 1; j >= 0; j--) {
                        array[i][j] = counter++;
                    }
                }
            }


            int maxDigits = String.valueOf(n * n).length();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("%" + maxDigits + "d ", array[i][j]);
                }
                System.out.println();
            }
        }
    }


