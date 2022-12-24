package ru.netology.stats;

public class StatsService {


    public int summaSales(long[] sales) {
        int summa = 0;
        for (int i = 0; i < sales.length; i++) {
            summa += sales[i];
        }
        return summa;
    }

    public int averageSales(long[] sales) {
        int average = 0;
        if (sales.length > 0) {
            int summa = 0;
            for (int i = 0; i < sales.length; i++) {
                summa += sales[i];
            }
            average = summa / sales.length;
        }
        return average;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int belowAverage(long[] sales) {
        int belowAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales(sales)) {
                belowAverage++;
            }
        }
        return belowAverage;
    }

    public int upperAverage(long[] sales) {
        int upperAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales(sales)) {
                upperAverage++;
            }
        }
        return upperAverage;
    }
}
