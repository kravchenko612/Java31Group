package Lesson17;
  import java.util.ArrayList;

  public class Vehicle {
  String color;
  String model;

  public Vehicle(){

  }
  public Vehicle (String color, String model){
      this.color = color;
      this.model = model;
  }

  @Override
      public void drive (){
      System.out.println("Vehicle drive");
  }
  @Override
      public void stop(){
      System.out.println("stop");
  }
  @Override
      public void setFuel(){
      System.out.println("diesel");
  }
  @Override
      public void middleMethod{
          System.out.println("middle");
      }
      public abstract void abstractMethod();
}
