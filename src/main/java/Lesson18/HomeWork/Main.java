package Lesson18.HomeWork;
//Программа должна выводить на экран список студентов группы, указывая в
//строчку через пробел фамилию, год рождения, три оценки и средний бал.
//Необходимо разработать систему классов для реализации программы. Для
//хранения информации о студенте создайте класс Student.
public class Main {
    public static void main(String[] args) {
        Group group = new Group();

        Student student1 = new Student("Ivanov", 2000, new int[]{90, 85, 88});
        Student student2 = new Student("Petrov", 1999, new int[]{78, 92, 80});

        group.addStudent(student1);
        group.addStudent(student2);

        group.printStudentsInfo();
    }
}

