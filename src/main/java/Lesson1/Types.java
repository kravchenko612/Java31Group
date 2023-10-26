package Lesson1;

public class Types {
    public static void main(String[] s){

        //=== примітивні типи даних ===

        //== числові типи ==
        //цілі цисла
        byte b = 127; //-128 do 127 2^8 -2^7 do -2^7 -1
        short sh = 20; // 2^16 -2^15 do 2^15 -1
        int in = 999999999; //2^32 -2^31 do 2^31 -1
        long l = 999999999999999999L;  //2^64

        //дробові числа
        float fl = 15.5F; //(4 byte)
        double d = 15.5;  //(8 byte)

        //symbols
        char ch = 'A';//(2 byte)

        //logic
        boolean bool = true;//(1 byte)


        //особливість типів double(float)
        System.out.println(d/0);//Infinity
        System.out.println(-d/0);//-Infinity
        System.out.println(0.0/0.0);//Not a number


        //=== Силочні типи даних ===

        String name = "Jack";

        //Класи обгортки для примитивів
        Byte.parseByte("15");
        Short.valueOf("45");
        Integer.toString(15);
        Double.hashCode(15.0);

        Character.isDigit('9');

        Boolean.getBoolean("Hello");
        //Пояснення до класів обгортки:
        //Цей код на Java використовує різні методи для роботи з примітивами та обгортками (wrapper classes) для них. Ось пояснення кожного рядка коду:
        //
        //1. `Byte.parseByte("15");`
        //   - Цей рядок перетворює рядок "15" в байтове значення. Функція `parseByte` приймає рядок і повертає відповідне байтове значення.
        //
        //2. `Short.valueOf("45");`
        //   - Цей рядок перетворює рядок "45" в об'єкт класу `Short`. Метод `valueOf` використовується для створення об'єкта-обгортки для короткого цілого числа.
        //
        //3. `Integer.toString(15);`
        //   - Цей рядок перетворює ціле число 15 в його рядкове представлення. Метод `toString` об'єкта `Integer` використовується для цього.
        //
        //4. `Double.hashCode(15.0);`
        //   - Цей рядок обчислює хеш-код для значення з плаваючою точкою 15.0. Метод `hashCode` класу `Double` обчислює хеш-код для об'єкта.
        //
        //5. `Character.isDigit('9');`
        //   - Цей рядок перевіряє, чи символ '9' є цифрою. Метод `isDigit` класу `Character` повертає `true`, якщо символ є цифрою, і `false`, якщо ні.
        //
        //6. `Boolean.getBoolean("Hello");`
        //   - Цей рядок намагається отримати значення булевої змінної за іменем системної властивості "Hello". Метод `getBoolean` класу `Boolean` читає системну властивість і перетворює її в булеве значення.
        //
        //Зазначені методи та операції виконують різні операції з примітивами та обгортками для них в Java.














    }
}
