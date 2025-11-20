import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test
    void shouldCalculateTotalSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        long actual = service.calculateTotalSales(sales);
        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        double actual = service.calculateAverageSales(sales);
        assertEquals(expected, actual);
    }
    @Test
    void shouldFindMonthWithMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.findMonthWithMaxSales(sales);
        assertEquals(expected, actual);
    }
    @Test
    void shouldFindMonthWithMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.findMonthWithMinSales(sales);
        assertEquals(expected, actual);
    }
    @Test
    void shouldCountMonthsBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.countMonthsBelowAverage(sales);
        assertEquals(expected, actual);
    }
    @Test
    void shouldCountMonthsAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.countMonthsAboveAverage(sales);
        assertEquals(expected, actual);
    }
    @Test
    void shouldWorkWithEmptyArray() {
        StatsService service = new StatsService();
        long[] sales ={};
        assertEquals(0, service.calculateTotalSales(sales));
        assertEquals(0, service.calculateAverageSales(sales));
        assertEquals(0, service.countMonthsBelowAverage(sales));
        assertEquals(0, service.countMonthsAboveAverage(sales));
    }
    @Test
    void shouldWorkWithSingleElement() {
        StatsService service = new StatsService();
        long[] sales ={100};
        assertEquals(100, service.calculateTotalSales(sales));
        assertEquals(100, service.calculateAverageSales(sales));
        assertEquals( 1, service.findMonthWithMaxSales(sales));
        assertEquals( 1, service.findMonthWithMinSales(sales));
        assertEquals(0, service.countMonthsBelowAverage(sales));
        assertEquals(0, service.countMonthsAboveAverage(sales));
    }
    }
