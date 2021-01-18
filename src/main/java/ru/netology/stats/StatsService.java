package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int mean = 0;
        for (int sale : sales) {
            // аналог sum = sum + purchase;
            mean += sale;
        }
        return mean;
    }


    public int monthMaxSales(int[] values) {
        int month = 0;
        for (int value : values) {
            month += 1;
        }
        return month;
    }

    public int monthMinSales(int[] values) {
        int month = 0;
        for (int value : values) {
            month += 1;
        }
        return month;
    }

    public int calculateMean(int[] sales) {
        int numberOfMonths = sales.length;
        int mean = calculateSum(sales) / numberOfMonths;
        return mean;
    }

    public int calculateMeanMinMonth(int[] sales) {
        int numberOfMonths = sales.length;
        int mean = calculateSum(sales) / numberOfMonths;
        int month = 0;
        for (int sale : sales) {
            month += 1;
        }
        return month;
    }

    public int calculateMeanMaxMonth(int[] sales) {
        int numberOfMonths = sales.length;
        int mean = calculateSum(sales) / numberOfMonths;
        int month = 0;
        for (int sale : sales) {
            month += 1;
        }
        return month;
    }
}




