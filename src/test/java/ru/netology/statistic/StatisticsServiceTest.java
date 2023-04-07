package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class StatisticsServiceTest {

    @Test
    void testFindMaxWhenAtFirst() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void testFindMaxWhenAtMiddle() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 47, 8, 6, 11, 11, 12};
        long expected = 47;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}
