package Lesson17;


public class Task {
    public static void main(String[] args) {

        Mercedes mercedes = new Mercedes();
        mercedes.drive();
        mercedes.showNumber();

        Vehicle mercedes2 = new Mercedes();
        mercedes2.stop();

        Vehicle car = new Car();
        car.drive();

        Mercedes mercedes3 = new Mercedes();

        ToyCar toyCar = new ToyCar(); //композиция
        toyCar.drive();

        Car nissan = new Car();

        ToyCar toyCar1 = new ToyCar(nissan); //агрегация
        toyCar1.drive();

        System.out.println("=========");
        Vehicle vehicle;

        vehicle = new Car();
        vehicle.drive();

        vehicle = new Mercedes();
        vehicle.drive();

        System.out.println("Экземпляр на основе интерфейса");
        Transport transport = new Mercedes();
        Fuel fuel = new Mercedes();

        transport.drive();
        fuel.setFuel();

    }
}
