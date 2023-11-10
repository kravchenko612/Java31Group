package Lesson17.HomeWork;
public class Flashlight {
    private boolean light; // Поле, що зберігає поточний стан ліхтарика

    // Конструктор класу
    public Flashlight() {
        this.light = false; // Ліхтарик спочатку вимкнений
    }

    // Метод для ввімкнення ліхтарика
    public void on() {
        light = true;
        System.out.println("Ліхтарик увімкнено.");
    }

    // Метод для вимкнення ліхтарика
    public void off() {
        light = false;
        System.out.println("Ліхтарик вимкнено.");
    }

    // Метод, що перевіряє стан ліхтарика
    public boolean isLight() {
        return light;
    }
}

