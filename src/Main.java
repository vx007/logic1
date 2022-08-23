public class Main {
    public static void main(String[] args) {
        //Задание 1
        boolean clientOS = false;
        if (clientOS)
            System.out.println("Установите версию приложения для Android по ссылке");
        else
            System.out.println("Установите версию приложения для iOS по ссылке");

        //Задание 2
        int clentDeviceYear = 2014;
        if (clientOS) {
            if (clentDeviceYear >= 2015)
                System.out.println("Установите версию приложения для Android по ссылке");
            else
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            if (clentDeviceYear >= 2015)
                System.out.println("Установите версию приложения для iOS по ссылке");
            else
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

        //Задание 3
        short year = 2021;
        boolean yearIsLeap = false;

        if (year % 4 == 0) yearIsLeap = true;
        if (yearIsLeap && (year % 100 == 0)) yearIsLeap = false;
        if (!yearIsLeap && (year % 400 == 0)) yearIsLeap = true;

        if (yearIsLeap) System.out.println(year + " год является високосным");
        else System.out.println(year + " год не является високосным");

        //Задание 4
        short deliveryDistance = 95;
        byte deliveryDays = 1;

        if (deliveryDistance > 20) deliveryDays +=1;
        if (deliveryDistance > 60) deliveryDays +=1;
        if (deliveryDistance > 100) deliveryDays +=1;

        System.out.println("Потребуется дней: " + deliveryDays);

        //Задание 5
        byte monthNumber = 12;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Сезон зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сезон весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сезон лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сезон осень");
                break;
            default:
                System.out.println("Такого месяца не существует!");
        }

        //Задание 6
        short age = 19;
        int salary = 58_000;
        float limit = 0f;
        float mult = 1f;

        if (age >= 23) mult = 3f;
        else mult = 2f;

        if (salary >= 50_000) mult *= 1.2f;
        if (salary >= 80_000) mult *= 1.5f;

        limit = salary * mult;
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");

        //Задание 7
        int wantedSum = 10_330_000;
        float paySum;
        float rate = 10f;
        boolean isApproved = false;

        if (age < 23) rate += 1f;
        if (age > 23 && age < 30) rate += 0.5f;
        if (salary > 80_000) rate -= 0.7f;

        paySum = wantedSum * rate / 100 / 12;
        if (paySum < (salary / 2) ) isApproved = true;

        System.out.println("Максимальный платеж при ЗП " + salary + " равен " + (salary / 2) + " рублей. " +
                "Платеж по кредиту " + paySum + " рублей.");
        if(isApproved) System.out.println("Кредит одобрен ");
        else System.out.println("Кредит не одобрен");

    }
}
