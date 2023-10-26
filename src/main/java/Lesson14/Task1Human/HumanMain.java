package Lesson14.Task1Human;

public class HumanMain {
    public static void main(String[] args) {
        Human human = new Human();
        human.PIB = "Кравченко Ірина Олександрівна";
        human.birthday = "Дванадцяте липня";
        human.number = +48123456;
        human.city = "Warsaw";
        human.country = "Poland";
        human.address = "RondoZeclancow";

        System.out.println(human.PIB);
        System.out.println(human.birthday);
        System.out.println(human.number);
        System.out.println(human.city);
        System.out.println(human.country);
        System.out.println(human.address);




    }
}