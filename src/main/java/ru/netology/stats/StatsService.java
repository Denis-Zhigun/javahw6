package ru.netology.stats;

public class StatsService {
    public int sum(int[] purchases) {
        int result = 0;
        for (int purchase : purchases) {
            result += purchase;

        }
        return result;
    }

    public int mean(int[] purchases) {
        return sum(purchases) / purchases.length;
    }

    public int MonthMaxPurchase(int[] purchases) {

        int max = purchases[0];
        for (int purchase : purchases) {
            if (max < purchase) {
                max = purchase;
            }
        }
        int monthMaxPurchase = 0;
        int MonthCount = 0;
        for (int purchase : purchases) {
            MonthCount++;
            if (purchase == max) {
                monthMaxPurchase = MonthCount;

            }
        }
        return monthMaxPurchase;
    }

    public int MonthMinPurchase(int[] purchases) {

        int min = purchases[0];
        for (int purchase : purchases) {
            if (min > purchase) {
                min = purchase;
            }
        }
        int monthMinPurchase = 0;
        int MonthCount = 0;
        for (int purchase : purchases) {
            MonthCount++;
            if (purchase == min) {
                monthMinPurchase = MonthCount;

            }
        }
        return monthMinPurchase;
    }

    public int monthCounthMoreMean(int[] purchases) {
        int mean = mean(purchases);
        int monthCount = 0;
        for (int purchase : purchases) {
            if (purchase > mean) {
                monthCount++;
            }
        }
        return monthCount;
    }

    public int monthCounthLessMean(int[] purchases) {
        int mean = mean(purchases);
        int monthCount = 0;
        for (int purchase : purchases) {
            if (purchase < mean) {
                monthCount++;
            }
        }
        return monthCount;
    }
}
