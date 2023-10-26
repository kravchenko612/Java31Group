package Lesson14.developer;

import java.util.random.RandomGenerator;

//шаблон для створення об'єкту
public class Developer {

    //instance variable (переменные екземпляра)
    //и еще свойства класса
    String name;
    int age;
    int experience;
    String technologies;

    public void setName(String name) {
        if (name.length() <= 10) {
            this.name = name;
        } else {
            System.out.println("Имя слишком длинное");
        }
    }
    public void setAge (int age){
        if (age >= 18 && age <= 80){
            this.age = age;
        }else if (age < 0) {
            System.out.println("Возраст не может быть отрицательным числом");
        }else if (age >= 0 && age < 18){
            System.out.println("Вам нужно набраться опыта");
        }else {
            System.out.println("Слишком почетный возраст");
        }
    }
    public void setTechnologies (String technologies){
        this.technologies = technologies;
    }
    //getters

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getExperience() {
        return experience;
    }

    public String getTechnologies() {
        return technologies;
    }
    //поведение объекта
    //методы класса
    public void writeCode(){
        System.out.println(name + " writing code on " + technologies);
    }
    public void solveProblems(){
        System.out.println(name + "solved problems with " + technologies);
    }
    @Override
    public String toString(){
        return "Developer{" +
                "name = '" + name + '\'' +
                "age =" + age +
                "experience =" + experience +
                ", technologies'" + technologies + '\'' +
                '}';

    }
}
