public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        System.out.println();
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            total = total + salary;
            i = i + 1;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }

        System.out.println();
        System.out.println("Задача 2");
        for (int w = 10; w > 0; w = w - 1) {
            System.out.print(w + " ");
        }
        System.out.println();
        int q = 0;
        while (q <= 10) {
            q++;

            System.out.print(q + " ");
        }

        System.out.println();
        System.out.println("Задача 3");
        System.out.println();

        int pop = 12_000_000;
        int birtRat = pop / 1000 * 17;
        int detRat = pop / 1000 * 8;
        int growPerYear = birtRat - detRat;
        int time = 0;
        while (time < 10) {
            time = time + 1;
            int popGrow = growPerYear * time;
            int popTotal = pop + popGrow;
            System.out.println("Год " + time + ", численность населения составляет " + popTotal + " человек");

        }

        System.out.println();
        System.out.println("Задача 4");
        System.out.println();

        int cash = 15_000;
        int monthPercent = 7;
        int t = 0;
        int totalDeposit = 0;
        for (int deposit = 0; deposit <= 12_000_000; ) {
            deposit = deposit + cash;
            int percent = deposit % monthPercent;
            totalDeposit = deposit + percent;
            t = t + 1;
            System.out.println("Месяц " + t + " сумма накоплений равна " + totalDeposit + " рублей");
        }

        System.out.println();
        System.out.println("Задача 5");
        System.out.println();

        int cash2 = 15_000;
        int monthPercent2 = 7;
        int t2 = 0;
        int totalDeposit2 = 0;
        for (int deposit2 = 0; deposit2 <= 12_000_000; ) {
            deposit2 = deposit2 + cash2;
            int percent = deposit2 % monthPercent2;
            totalDeposit2 = deposit2 + percent;
            t2 = t2 + 1;
            if (t2 % 6 == 0) {
                System.out.println("Месяц " + t2 + " сумма накоплений равна " + totalDeposit2 + " рублей");


            }
        }

        System.out.println();
        System.out.println("Задача 6");
        System.out.println();

        int cash3 = 15_000;
        int monthPercent3 = 7;
        int deposit3 = 0;
        int totalDeposit3 = 0;
        for (int t3 = 0; t3 <= 9 * 12; ) {
            deposit3 = deposit3 + cash3;
            int percent = deposit3 % monthPercent3;
            totalDeposit3 = deposit3 + percent;
            t3 = t3 + 1;
            if (t3 % 6 == 0) {
                System.out.println("Месяц " + t3 + " сумма накоплений равна " + totalDeposit3 + " рублей");
            }
        }
        System.out.println();
        System.out.println("Задача 7");
        System.out.println();

        for (int friday = 4; friday < 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        }

        System.out.println();
        System.out.println("Задача 8");
        System.out.println();

        for (int year = 0; year < 2022 + 100; year = year + 79) {
            if (year > 2022 - 200) {
                System.out.println(year);
            }
        }


    }
}