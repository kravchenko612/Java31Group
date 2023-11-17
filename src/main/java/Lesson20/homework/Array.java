package Lesson20.homework;
//Завдання 1: Створіть шаблонний клас Array,
// який являє собою масив,
// в якому зберігаються об'єкти заданого типу.
// Реалізуйте:
// 1 заповнення масиву з клавіатури;
// 2 заповнення масиву випадковими числами;
// 3 відображення масиву;
// 4 пошук максимального значення;
// 5 пошук мінімального значення;
// 6 підрахунок середнього арифметичного значення.
// 7* сортування масиву за зростанням;
// 8* сортування масиву за спаданням;
// 9* пошук значення в масиві, використовуючи бінарний пошук;
// 10* заміну значення в масиві на нове значення.
//
//Виконати пункти з 3-6.
    public class Array<T extends Comparable<T>> {
        private T[] elements;

        // Конструктор для ініціалізації масиву
        public Array(T[] elements) {
            this.elements = elements;
        }

        // Метод для виведення елементів масиву
        public void display() {
            System.out.print("Array: ");
            for (T element : elements) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        // Метод для пошуку максимального значення
        public T findMax() {
            T max = elements[0];
            for (T element : elements) {
                if (element.compareTo(max) > 0) {
                    max = element;
                }
            }
            return max;
        }

        // Метод для пошуку мінімального значення
        public T findMin() {
            T min = elements[0];
            for (T element : elements) {
                if (element.compareTo(min) < 0) {
                    min = element;
                }
            }
            return min;
        }

        // Метод для підрахунку середнього арифметичного значення
        public double calculateAverage() {
            double sum = 0.0;
            for (T element : elements) {
                sum += Double.valueOf(element.toString());
            }
            return sum / elements.length;
        }

        public static void main(String[] args) {
            // Приклад використання
            Integer[] intArray = {1, 2, 3, 4, 5};
            Array<Integer> integerArray = new Array<>(intArray);

            // Відображення масиву
            integerArray.display();

            // Пошук максимального та мінімального значення
            System.out.println("Max Value: " + integerArray.findMax());
            System.out.println("Min Value: " + integerArray.findMin());

            // Підрахунок середнього арифметичного
            System.out.println("Average: " + integerArray.calculateAverage());
        }
    }

