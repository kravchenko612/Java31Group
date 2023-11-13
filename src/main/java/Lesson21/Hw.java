package Lesson21;


public interface Hw {
    void show();
    //interface
    //abstract - IAnimal - AbstrCAT - blackCat
}

abstract class First implements Hw{

    public void fMethod(){

        System.out.println("First");
    }

    @Override
    public void show() {
        System.out.println("show");
    }
}

class Second extends  First{
    void sMethod(){
        System.out.println("Second");
    }
}



