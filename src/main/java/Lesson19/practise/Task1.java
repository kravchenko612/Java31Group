package Lesson19.practise;

public class Task1 {
    //Завдання 1
    //Напишіть шаблонний метод який повертає максимум
    //з трьох переданих параметрів
    public static void main(String[] args) {
        System.out.println(method(12,25,36));
        System.out.println(method( 12.7F, 25.6F, 50));
    }

    public static <T extends Number> T method(T num1, T num2, T num3) {
        T max;
        if (num1.doubleValue() > num2.doubleValue()) {
            return max = num1;
        } else if (num2.doubleValue() > num3.doubleValue()) {
            return max = num2;
        } else {
            return max = num3;

        }
    }
}
