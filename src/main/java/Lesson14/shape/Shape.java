package Lesson14.shape;

public class Shape {
    int x;
    int y;
    public Shape(){
        this.x = 5;
        this.y = 5;
    }
    public Shape(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public void setX (int x){
        this.x = x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
}
