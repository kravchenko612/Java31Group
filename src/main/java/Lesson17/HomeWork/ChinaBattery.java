package Lesson17.HomeWork;
//Завдання 3
//Створіть клас для китайської батарейки ChinaBattery.
//Додайте в клас батарейки:
//   поле класу для зберігання поточного заряду private int charge;
//   метод, що зменшує заряд батарейки boolean charge(); повертає істину,
//  якщо заряд вдалося зменшити, і хибність, якщо батарейка розряджена.
//Додайте до класу ліхтарика властивість класу з типом батарейки:
//  private ChinaBattery battery = new ChinaBattery();
//Додайте використання батарейки в методі ввімкнення ліхтарика.
public class ChinaBattery {

    //Поле, що зберігає поточний стан заряду
    private int charge;

    public boolean charge(){
        if (charge > 0) {
            charge--;
            return true;
        }else{
            return false;
        }

    }




}


