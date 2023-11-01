package Lesson15.HomeWork;
//Завдання 3
//     Створіть клас Money (Гроші) для роботи з грошовими сумами.
//     Число має бути представлене двома полями:
//      типу long – для гривень;
//      типу byte – для копійок.
//     Реалізуйте виведення значення на екран,
//     при цьому дробова частина має бути відокремлена комою від цілої частини.
//     Реалізуйте
//     додавання,
//     віднімання,
//     ділення сум,
//     *ділення суми на дробове число,
//     *множення на дробове число
//     та операції порівняння.
public class Main {
    public static void main(String[] args) {
        Money money = new Money(-15L,(byte) 95);
        money.show();
        money.add(7L, (byte) 99);
        money.show();
        money.add(5, (byte) 50);
        money.show();
        money.substract(7L, (byte) 70);
        money.show();
        money.divide(8L, (byte) 91);
        money.show();

    }
}
