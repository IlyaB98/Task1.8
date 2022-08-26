import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        int currentYear = LocalDate.now().getYear();
        checkLeapYear(currentYear);
    }

    public static void checkLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.printf("%d  - високосный год.", year);
        } else {
            System.out.printf("%d - не високосный год.", year);
        }
    }

    public static void task2() {
        int clientDeviceYear = 2015;
        int OS = 0;
        checkDevice(clientDeviceYear, OS);
    }

    public static void checkDevice(int year, int OS) {
        int currentYear = LocalDate.now().getYear();
        if (year == currentYear && OS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (year < currentYear && OS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (year == currentYear && OS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (year < currentYear && OS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

    }

    public static void task3() {
        int deliveryDistance = 95;
        int deliveryDays = calculationDeliveryDays(deliveryDistance);
        System.out.println("Потребуется дней: " + deliveryDays);

    }
    public static int calculationDeliveryDays(int distance) {
       int days = 1;
        if (distance > 20) {
            days ++;
        }
        if (distance > 60) {
            days++;
        }
        return days;
    }
}