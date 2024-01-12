package Lesson31.HomeWork;

public class Task02 {
        public static void main(String[] args) {
            // Задана кількість секунд до Нового року
            int remainingSeconds = 121212;

            // Розрахунок кількості днів, годин, хвилин і секунд
            int days = remainingSeconds / (24 * 60 * 60);
            int hours = (remainingSeconds % (24 * 60 * 60)) / (60 * 60);
            int minutes = ((remainingSeconds % (24 * 60 * 60)) % (60 * 60)) / 60;
            int seconds = ((remainingSeconds % (24 * 60 * 60)) % (60 * 60)) % 60;

            // Виведення результату в консоль
            System.out.println(days + " днів, " + hours + " годин, " + minutes + " хвилин і " + seconds + " секунд");
        }
    }

