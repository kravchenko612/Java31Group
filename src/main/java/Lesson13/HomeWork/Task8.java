package Lesson13.HomeWork;
import java.util.Scanner;
//Завдання 8
//Заповніть n-мірний квадратний масив числами, які
//збільшуються на 1 по спіралі (число n задається з клавіатури).
//Виведіть результат на екран дотримуючись ширини стовпців.
//Наприклад, масив 4х4 має відповідати прикладу, зображеному
//нижче.
//ДОМАШНЄ ЗАВДАННЯ
//3
//Приклад:
//1 2 3 4
//12 13 14 5
//11 16 15 6
//10 9 8 7
    public class Task8 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введіть розмірність масиву (n): ");
            int n = scanner.nextInt();

            int[][] array = new int[n][n];

            int num = 1;
            int startRow = 0, endRow = n - 1;
            int startCol = 0, endCol = n - 1;

            while (num <= n * n) {
                // Заповнюємо верхній рядок зліва направо
                for (int i = startCol; i <= endCol; i++) {
                    array[startRow][i] = num++;
                }
                startRow++;

                // Заповнюємо правий стовпець зверху вниз
                for (int i = startRow; i <= endRow; i++) {
                    array[i][endCol] = num++;
                }
                endCol--;

                // Заповнюємо нижній рядок справа наліво
                for (int i = endCol; i >= startCol; i--) {
                    array[endRow][i] = num++;
                }
                endRow--;

                // Заповнюємо лівий стовпець знизу вгору
                for (int i = endRow; i >= startRow; i--) {
                    array[i][startCol] = num++;
                }
                startCol++;
            }

            // Знайдіть, яка максимальна ширина стовпця потрібна для виведення чисел
            int maxDigits = String.valueOf(n * n).length();

            // Виводимо масив на екран з відповідною шириною стовпців
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("%" + maxDigits + "d ", array[i][j]);
                }
                System.out.println();
            }
        }
    }

