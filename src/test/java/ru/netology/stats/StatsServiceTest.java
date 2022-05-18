package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test

    public  void shouldSum() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long actual = service.sumSale(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldAverageSale() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        long actual = service.averageSale(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / sales.length;
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldMaxMonth() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        long actual = service.maxSale(sales);
        long expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldMinMonth() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        long actual = service.minSale(sales);
        long expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldBelowAverage() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        long actual = service.belowAverageSale(sales);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldAboveAverage() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        long actual = service.aboveAverageSale(sales);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }
}
