package Lesson17.HomeWork;
//Завдання 2
//Створіть клас ліхтарика (Flashlight).
//Додайте в клас ліхтарика:
//  методи ввімкнення void on() та void off()для вимкнення ліхтарика;
//  метод, що перевіряє стан ліхтарика boolean isLight();
//  поле класу private boolean light, що зберігає поточний стан ліхтарика;
//  реалізувати алгоритм ввімкнення і вимкнення ліхтарика.


public class Main {
    public static void main(String[] args) {
        // Створюємо об'єкт ліхтарика
        Flashlight flashlight = new Flashlight();

        // Перевіряємо початковий стан ліхтарика
        System.out.println("Початковий стан ліхтарика: " + flashlight.isLight());

        // Увімкнемо ліхтарик
        flashlight.on();

        // Перевіряємо стан ліхтарика після увімкнення
        System.out.println("Стан ліхтарика після увімкнення: " + flashlight.isLight());

        // Вимкнемо ліхтарик
        flashlight.off();

        // Перевіряємо стан ліхтарика після вимкнення
        System.out.println("Стан ліхтарика після вимкнення: " + flashlight.isLight());
    }
}