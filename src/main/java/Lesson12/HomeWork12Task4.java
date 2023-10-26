package Lesson12;
//Завдання 4. Цифри числа справа наліво
//Дано натуральне число N. Виведіть всі його цифри по одній у
//зворотному порядку через пробіл. Дозволена тільки рекурсія і
//цілочислова арифметика.
//Введення: 179
//Виведення: 9 7 1
import java.util.Scanner;

public class HomeWork12Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введення: ");
        int N = scanner.nextInt();
        вивестиЦифриЗворотньо(N);
    }

    public static void вивестиЦифриЗворотньо(int N) {
        if (N == 0) {
            return;
        } else {
            int останняЦифра = N % 10;
            System.out.print(останняЦифра + " ");
            вивестиЦифриЗворотньо(N / 10);
        }
    }
}

