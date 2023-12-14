package Lesson28.HomeWork;

import java.io.*;
import java.util.Scanner;

public class Task04 {
//    Завдання 4:
//Користувач вводить з клавіатури шлях до файлу, Після роботи
//програми на екрані відображається кількість літер, чисел і
//розділових знаків у файлі.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть назву файлу");
        String fileName = scanner.nextLine();
        String file = task04(fileName);
        int letterCount = 0;
        int digitCount = 0;
        int punctuationCount = 0;

        for (char ch : file.toCharArray()) {
            if (Character.isLetter(ch)) {
                letterCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else if (Character.isWhitespace(ch)) {
            } else {
                punctuationCount++;
            }
        }
        System.out.println("Кількість літер у файлі =" + letterCount );
        System.out.println("Кількість цифр у файлі =" + digitCount );
        System.out.println("Кількість розділових знаків у файлі =" + punctuationCount );
    }
    private static String task04(String fileName) {
        try (Reader reader = new FileReader(fileName)) {
            int length = 1024;
            char[] buf = new char[length];
            int charRead = reader.read(buf, 0, length);
            if (charRead != -1) {
                return new String(buf, 0, charRead);
            } else {
                return "";
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
