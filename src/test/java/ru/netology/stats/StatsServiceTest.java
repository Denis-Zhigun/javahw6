package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void calculateSum() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void monthMaxSales() {
        StatsService service = new StatsService();

        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 12;

        int actual = service.monthMaxSales(values);

        assertEquals(expected, actual);
    }

    @Test
    void monthMinSales() {
        StatsService service = new StatsService();

        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 12;

        int actual = service.monthMinSales(values);

        assertEquals(expected, actual);
    }

    @Test
    void calculateMean() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.calculateMean(sales);

        assertEquals(expected, actual);
    }
}




