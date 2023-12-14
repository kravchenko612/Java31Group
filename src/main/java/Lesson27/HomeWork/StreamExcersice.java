package Lesson27.HomeWork;

import java.util.*;

public class StreamExcersice {

    private enum Sex {
        MAN,
        WOMEN
    }

    private static class Student {
        private final String name;
        private final Integer age;
        private final Sex sex;

        public Student(String name, Integer age, Sex sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Sex getSex() {
            return sex;
        }

        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", sex=" + sex +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student)) return false;
            Student people = (Student) o;
            return Objects.equals(name, people.name) &&
                    Objects.equals(age, people.age) &&
                    Objects.equals(sex, people.sex);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, sex);
        }
    }

    static List<Student> students = Arrays.asList(
            new Student("Вася", 16, Sex.MAN),
            new Student("Петя", 23, Sex.MAN),
            new Student("Соня", 18, Sex.WOMEN),
            new Student("Виктор Петрович", 65, Sex.MAN),
            new Student("Дима", 25, Sex.MAN),
            new Student("Катя", 21, Sex.WOMEN),
            new Student("Семен", 33, Sex.MAN),
            new Student("Елена", 42, Sex.WOMEN),
            new Student("Иван Иванович", 69, Sex.MAN)
    );


    public static void main(String[] args) {
        // TODO: тестировать здесь
        ex01().forEach(System.out::println);
        System.out.println("able to work = " + ex03());
        System.out.println("avarage = " + ex02());
        System.out.println("avarage = " + ex021());
        System.out.println("reverse alphabetical order = " + ex04());
        System.out.println("max age = " + ex05());
        System.out.println("student with max age = " + ex051());
        System.out.println("student with min age = " + ex06());


    }

    static List<Student> ex01() {
        // TODO: Задание 1
        // Выбрать всех мужчин-военнообязанных (возраст от 18 до 27 лет)

        return students
                .stream()
                .filter(student -> student.age >= 18 && student.age <= 27 && student.sex == Sex.MAN)
                .toList();

    }

    static Double ex02() {
        // TODO: Задание 2
        // Найти средний возраст среди мужчин

        return students.stream()
                .filter(student -> student.sex == Sex.MAN)
                .mapToDouble(student -> student.age)
                .average()
                .orElse(Double.NaN);
    }

    static Double ex021() {
        // TODO: Задание 2
        // Найти средний возраст среди мужчин

        IntSummaryStatistics summaryStatistics = students.stream()
                .filter(student -> student.sex == Sex.MAN)
                .mapToInt(student -> student.age)
                .summaryStatistics();

        return summaryStatistics.getAverage();
    }

    static Long ex03() {
        // TODO: Задание 3
        // Найти кол-во потенциально работоспособных
        // студентов в выборке (т.е. от 18 лет и учитывая
        // что женщины выходят в 55 лет, а мужчина в 60)

        return students
                .stream()
                .filter(student -> {
                    if (student.age >= 18 && student.age <= 60 && student.sex == Sex.MAN)
                        return true;
                    else if (student.age >= 18 && student.age <= 55 && student.sex == Sex.WOMEN) {
                        return true;
                    }
                    return false;
                })
                .count();

    }

    static List<Student> ex04() {
        // TODO: Задание 4
        // Отсортировать студентов по имени в обратном алфавитном порядке

        return students
                .stream()
                .sorted(new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o2.getName().compareTo(o1.getName());
                    }
                })
                .toList();
    }

    static int ex05() {
        //  TODO: Задание 5
        //  найти студента с максимальным возрастом

        return students
                .stream()
                .mapToInt(student -> student.age)
                .summaryStatistics().getMax();
    }

    static Optional<Student> ex051() {
        //  TODO: Задание 5
        //  найти студента с максимальным возрастомOptional<Student>

        return students
                .stream()
                .max(Comparator.comparingInt(Student::getAge));
    }

    static Optional<Student> ex06() {
        // TODO: Задание 6
        // Найти студента с минимальным возрастом

        if (students.isEmpty()) {
            System.out.println("Список пуст");
            return Optional.empty();
        }
        return students
                .stream()
                .min(new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return Integer.compare(o1.getAge(), o2.getAge());
                    }
                });
    }

}
