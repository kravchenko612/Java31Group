package Lesson14.HomeWork;

import java.util.Scanner;

public class DiapazonCalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Напишіть к-сть діапазонів (n) - ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n ; i++) {
            System.out.println("Напишіть початок діапазону " + i + "- ");
            int start = sc.nextInt();
            sc.nextLine();

            System.out.println("Напишіть кінець діапазону " + i + "- ");
            int end = sc.nextInt();
            sc.nextLine();

            Diapazon diapazon = new Diapazon(start, end);
            if (diapazon.isValid()) {
                System.out.println("Довжина діапазону " + i + diapazon.getLength());
            }else{
                System.out.println("Помилка - початок діапазону більше ніж кінець діапазону");
            }


        }
        sc.close();
    }
}
