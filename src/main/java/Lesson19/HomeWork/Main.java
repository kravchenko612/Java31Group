package Lesson19.HomeWork;

public class Main {
    //Завдання 2:
    //Створіть клас для розрахунку площі геометричних фігур. Клас
    //має надавати функціональність для підрахунку площі трикутника
    //за різними формулами, площі прямокутника, площі квадрата,
    //площі ромба. Методи класу для підрахунку площі реалізуйте за
    //допомогою статичних методів. Також клас має розрахувати
    //кількість підрахунків площі та повернути це значення статичним
    //методом.
    public static void main(String[] args) {
        // Приклад використання класу
        GeometricShapes AreaCalculator = new GeometricShapes();
        double triangleArea = AreaCalculator.calculateTriangleArea(3, 4, 5);
        System.out.println("Площа трикутника: " + triangleArea);

        double rectangleArea = AreaCalculator.calculateRectangleArea(6, 8);
        System.out.println("Площа прямокутника: " + rectangleArea);

        double squareArea = AreaCalculator.calculateSquareArea(4);
        System.out.println("Площа квадрата: " + squareArea);

        double rhombusArea = AreaCalculator.calculateRhombusArea(5, 6);
        System.out.println("Площа ромба: " + rhombusArea);

        System.out.println("Кількість підрахунків: " + AreaCalculator.getCalculationCount());
    }
}



