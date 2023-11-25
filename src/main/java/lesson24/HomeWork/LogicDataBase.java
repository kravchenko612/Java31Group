package lesson24.HomeWork;

import java.util.Scanner;

public class LogicDataBase {

    public void logicDB() {
        Menu menu = new Menu();


        MethodsDB methods = new MethodsDB();
        while (true) {
            menu.menu();
            switch (menu.getChoice()) {
                case 1 -> methods.printDataBase();
                case 2 -> {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter user code");
                    int code = scanner.nextInt();
                    methods.printByINN(code);
                }
                case 3 -> {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter type of fine");
                    String typeFine = scanner.nextLine();
                    methods.printUsersByFineType(typeFine);
                }
                case 4 -> {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter city");
                    String city = scanner.nextLine();
                    methods.printUsersByCity(city);
                }
                case 5 -> {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter new name");
                    String name = scanner.nextLine();

                    System.out.println("Enter inn");
                    int inn = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Enter city");
                    String city = scanner.nextLine();

                    methods.addHuman(name, inn, city);
                }
                case 6 -> {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter name");
                    String name = scanner.nextLine();
                    System.out.println("Enter new fine");
                    Fine fine = new Fine(scanner.nextLine());

                    methods.addFine(name, fine);

                }

                case 7 -> {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter name");
                    String name = scanner.nextLine();
                    System.out.println("Enter type of fine");
                    String typeFine = scanner.nextLine();
                    methods.removeFine(name, typeFine);

                }

                case 8 -> {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter new name");
                    String name = scanner.nextLine();

                    System.out.println("Enter inn");
                    int inn = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Enter city");
                    String city = scanner.nextLine();

                    System.out.println("Enter fine");
                    Fine fine = new Fine(scanner.nextLine());

                    methods.replaceInfo(name,inn, city, fine);

                }
            }
        }
    }
}
