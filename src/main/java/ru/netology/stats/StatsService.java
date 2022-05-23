package ru.netology.stats;


public class StatsService {

    public long sumSale(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long averageSale(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        long average = sum / sales.length;
        return average;
    }

    public int maxSale(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return (maxMonth + 1);
    }

    public int minSale(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowAverageSale(long[] sales) {
        long sumMonth = sumSale(sales);

        long mediumMonth = sumMonth / sales.length;
        int amountMonth = 0;
        for (long sale : sales) {
            if (sale < mediumMonth) {
                amountMonth++;
            }
        }
        return amountMonth;
    }


    public int aboveAverageSale(long[] sales) {
        long sumMonth = sumSale(sales);

        long mediumMonth = sumMonth / sales.length;
        int amountMonth = 0;
        for (long sale : sales) {
            if (sale > mediumMonth) {
                amountMonth++;
            }
        }
        return amountMonth;
    }

}
