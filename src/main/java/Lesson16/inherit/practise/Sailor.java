package Lesson16.inherit.practise;

public class Sailor extends Human {
    String shipName;

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public void goToSea(){
        System.out.println(name + " go to sea" );
    }
}
