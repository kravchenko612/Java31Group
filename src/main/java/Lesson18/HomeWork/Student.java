package Lesson18.HomeWork;


import java.util.ArrayList;
import java.util.List;

public class Student {

        private String lastName;
        private int birthYear;
        private int[] grades;

        public Student(String lastName, int birthYear, int[] grades) {
            this.lastName = lastName;
            this.birthYear = birthYear;
            this.grades = grades;
        }

        public String getLastName() {
            return lastName;
        }

        public int getBirthYear() {
            return birthYear;
        }

        public int[] getGrades() {
            return grades;
        }

        public double getAverageGrade() {
            if (grades.length == 0) {
                return 0.0;
            }

            int sum = 0;
            for (int grade : grades) {
                sum += grade;
            }

            return (double) sum / grades.length;
        }
    }
