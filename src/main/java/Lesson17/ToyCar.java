package Lesson17;

public class ToyCar {
    Car car;

    public ToyCar(){
        this.car = new Car();

    }

    public ToyCar (Car car){
        this.car = car;
    }

    public void drive(){
        System.out.println("Toy ");
    }
}
