package Lesson14.shape;

import Lesson14.shape.Shape;

public class ShapeMain {
    public static void main(String[] args) {

        Shape shape = new Shape(10,20);
        System.out.println(shape.getX());
        System.out.println(shape.getY());


        Shape rectengle = new Shape();
        rectengle.setX(15);
        rectengle.setY(27);
    }
}
