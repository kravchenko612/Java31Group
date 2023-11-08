package Lesson16.inherit.HomeWork;

//Завдання 1:
//Розробіть і протестуйте набір класів для вирішення завдання
//підрахунку заробітної плати співробітників якоїсь фірми.
//На фірмі є декілька способів оплати праці:
// ставка — вказується, скільки співробітник отримує за
//робочий день; по кожному співробітнику записується
//кількість відпрацьованих днів в місяці;
// погодинна — вказується, скільки співробітник отримує
//оплату в годину; по кожному співробітнику записується
//кількість відпрацьованих годин в місяць;
// відрядна — вказується, скільки співробітник отримає за
//виконану роботу; по кожному співробітнику записуються
//суми з кожного виконаного завдання, яке працівник встиг
//виконати за місяць.
//Програма має вміти виводити звіт по всіх працівниках фірми
//про заробітну плату у такому вигляді:
//П.І.Б. Вид оплати Сума
//Іваненко ставка 3000 грн
//Сидоренко погодинна 800 грн
//Петренко відрядна 5500 грн
//Разом: 9300 грн
public class Main {
public static void main(String[] args) {
        Workers employee1 = new Workers("Іваненко", PaymentType.STAVKA);
        Workers employee2 = new Workers("Сидоренко", PaymentType.POGODINNA);
        Workers employee3 = new Workers("Петренко", PaymentType.VIDRYADNA);

        double salary1 = SalaryCalculator.calculateSalary(employee1, 150, 0, 0);
        double salary2 = SalaryCalculator.calculateSalary(employee2, 0, 160, 0);
        double salary3 = SalaryCalculator.calculateSalary(employee3, 0, 0, 5500);

        System.out.println("П.І.Б. Вид оплати Сума");
        System.out.println(employee1.getFullName() + " " + employee1.getPaymentType() + " " + salary1 + " грн");
        System.out.println(employee2.getFullName() + " " + employee2.getPaymentType() + " " + salary2 + " грн");
        System.out.println(employee3.getFullName() + " " + employee3.getPaymentType() + " " + salary3 + " грн");

        double totalSalary = salary1 + salary2 + salary3;
        System.out.println("Разом: " + totalSalary + " грн");
        }
        }

