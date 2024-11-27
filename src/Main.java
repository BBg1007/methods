import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        //Task1

        System.out.println("Задача №1");
        System.out.println();
        checkLeapYear((short) 1700);
        System.out.println();

        //Task2

        System.out.println("Задача №2");
        System.out.println();
        suggestRelevantVersion((byte) 0 ,2024);
        System.out.println();

        //Task3
        System.out.println("Задача №3");
        System.out.println();
        calculateDeliveryTime((byte) 97);

    }

    public static void checkLeapYear(short year) {
        if ((year > 1584)&&(year%4==0)&&(year%100!=0)) {
            System.out.println(year + " год является высокосным.");


        }
        else if ((year > 1584)&&year%400==0){
            System.out.println(year + " год является высокосным.");

        }
        else if (year<1584) {
            System.out.println("Год должен быть больше, чем 1584 (в котором был введен високосный год).");
        }
        else {
            System.out.println(year+" год не является высокосным.");
        }
    }

    public static void suggestRelevantVersion(byte clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 1 && (clientDeviceYear - currentYear) == 0) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        else if (clientOS == 1 && (clientDeviceYear - currentYear) < 0) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
        else if (clientOS != 1 && (clientDeviceYear - currentYear) == 0){
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        else {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }

    }

    public static void calculateDeliveryTime(byte deliveryDistance) {
        byte deliveryDays;
        if (deliveryDistance<=20&&deliveryDistance>=0){
            deliveryDays=1;
            System.out.println("Потребуется дней: "+deliveryDays);
        }
        else if (deliveryDistance>20&&deliveryDistance<=60) {
            deliveryDays=2;
            System.out.println("Потребуется дней: "+deliveryDays);
        } else if (deliveryDistance>60&&deliveryDistance<=100) {
            deliveryDays=3;
            System.out.println("Потребуется дней: "+deliveryDays);
        }
        else {
            System.out.println("К сожалению, доставки нет.");
        }

    }



}

