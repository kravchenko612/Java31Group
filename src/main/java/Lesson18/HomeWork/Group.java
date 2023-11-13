package Lesson18.HomeWork;

import java.util.ArrayList;
import java.util.List;

public class Group {
        private List<Student> students;

        public Group() {
            students = new ArrayList<>();
        }

        public void addStudent(Student student) {
            students.add(student);
        }

        public void printStudentsInfo() {
            for (Student student : students) {
                System.out.printf("%s %d %d %d %d %.2f%n",
                        student.getLastName(),
                        student.getBirthYear(),
                        student.getGrades()[0],
                        student.getGrades()[1],
                        student.getGrades()[2],
                        student.getAverageGrade());
            }
        }
    }

