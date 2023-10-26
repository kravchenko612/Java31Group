package Lesson8;

public class EndsWithExample {
    public static void main(String[] args) {

        String[] files = {"test.jpg", "hello.png", "img.img", "cat.png", "dog.png", "hot-dog.png"};

        for (int i = 0; i < files.length; i++) {
            if(files[i].endsWith(".png") && files[i].startsWith("c")){
                System.out.println(files[i]);
            }
        }
    }
}