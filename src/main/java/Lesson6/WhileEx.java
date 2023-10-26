package Lesson6;

public class WhileEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        while (a++ < --b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}