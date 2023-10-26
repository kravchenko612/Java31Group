package Lesson14.HomeWork;
//Завдання 1:
//Створіть програму, яка дозволяє ввести з клавіатури n
//діапазонів цілочислових значень (наприклад, 3-10). Кожен
//діапазон має початкову і кінцеву точку.Після введення, програма
//має вивести довжину кожного діапазону. Програма має
//виводити повідомлення про помилку, якщо початок діапазону
//більший, ніж його кінець.
public class Diapazon {
    int start;
    int end;

    public Diapazon (int start, int end){
        this.start = start;
        this.end = end;
    }
    public int getStart(){
        return start;
    }
    public int getEnd(){
        return end;
    }
    public int getLength(){
        return Math.abs(end - start) + 1;
    }
    public boolean isValid(){
        return start <= end;
    }
}
