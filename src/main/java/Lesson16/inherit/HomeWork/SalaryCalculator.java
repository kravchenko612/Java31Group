package Lesson16.inherit.HomeWork;

class SalaryCalculator {
    public static double calculateSalary(Workers workers, double rate, double hoursWorked, double amountEarned) {
        switch (workers.getPaymentType()) {
            case STAVKA:
                return rate * 20; // Припускаємо 20 робочих днів в місяць
            case POGODINNA:
                return rate * hoursWorked;
            case VIDRYADNA:
                return amountEarned;
            default:
                return 0.0;
        }
    }
}

