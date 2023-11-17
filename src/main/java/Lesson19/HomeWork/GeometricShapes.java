package Lesson19.HomeWork;

public class GeometricShapes {
    private static int calculationCount = 0;

    // Статичний метод для отримання кількості підрахунків
    public static int getCalculationCount() {
        return calculationCount;
    }

    // Статичний метод для розрахунку площі трикутника за формулою Герона
    public static double calculateTriangleArea(double a, double b, double c) {
        calculationCount++;
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    // Статичний метод для розрахунку площі прямокутника
    public static double calculateRectangleArea(double length, double width) {
        calculationCount++;
        return length * width;
    }

    // Статичний метод для розрахунку площі квадрата
    public static double calculateSquareArea(double side) {
        calculationCount++;
        return side * side;
    }

    // Статичний метод для розрахунку площі ромба
    public static double calculateRhombusArea(double diagonal1, double diagonal2) {
        calculationCount++;
        return (diagonal1 * diagonal2) / 2;
    }


}
