public class Main {
    public static void main(String[] args) {
        System.out.println();
        // Задание 1
        int clientOC = 0;
        if (clientOC == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOC == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // Задание 2
        int clientDeviceYear = 2016;
        if (clientOC == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOC == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOC == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();
        // Задание 3
        int year = 2024;
        if (year > 1584) {
            if ((year % 4 == 0) || (year % 400 == 0) && (year % 100 != 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println("Год должен быть больше, чем 1584");
        }
        System.out.println();
        // Задание 5
        int deliveryDistance = 95;
        int deliveryTime = 1;
        if (deliveryDistance <= 100) {
            if (deliveryDistance <= 20) {
                System.out.println("Потребуется дней: " + deliveryTime);
            } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
                System.out.println("Потребуется дней: " + (deliveryTime + 1));
            } else if (deliveryDistance > 60) {
                System.out.println("Потребуется дней: " + (deliveryTime + 2));
            }
        } else {
            System.out.println("Доставки нет");
        }
        System.out.println();
        // Задание 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Сезон - зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сезон - весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сезон - лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сезон - осень");
                break;
            default:
                System.out.println("Нет столько месяцев");


        }
    }
}