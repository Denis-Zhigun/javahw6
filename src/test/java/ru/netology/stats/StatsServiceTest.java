package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
        void calculateSum() {
            StatsService service = new StatsService();

            long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            long expected = 180;

            long actual = service.calculateSum(purchases);

            assertEquals(expected, actual);
        }

   @Test
    void findMax() {
        StatsService service = new StatsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 20;

        long actual = service.findMax(purchases);

        assertEquals(expected, actual);
    }


    }


