package Lesson12.HomeWork;
import java.util.Scanner;
//Завдання 4. Цифри числа справа наліво
//Дано натуральне число N. Виведіть всі його цифри по одній у
//зворотному порядку через пробіл. Дозволена тільки рекурсія і
//цілочислова арифметика.
//Введення: 179
//Виведення: 9 7 1
public class Task4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введення: ");
            int n = scanner.nextInt();
            System.out.print("Виведення: ");
            printReverseDigits(n);
        }

        public static void printReverseDigits(int n) {
            if (n > 0) {
                int lastDigit = n % 10; //
                System.out.print(lastDigit + " ");
                printReverseDigits(n / 10);
            }
        }
    }

