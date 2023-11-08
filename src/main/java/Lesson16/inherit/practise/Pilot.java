package Lesson16.inherit.practise;

public class Pilot extends Human{
    String plane;

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public void fly(){
        System.out.println(name + "in fly");
    }
}
