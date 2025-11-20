package ru.netology.stats;

public class StatsService {
    //сумма всех продаж
    public long calculateTotalSales(long[] sales) {
        long total = 0;
        for (long sale : sales) {
            total += sale;
        }
        return total;
    }
    //средняя сумма продаж
    public double calculateAverageSales(long[] sales) {
        if (sales.length == 0) {
            return 0;
        }
        return (double) calculateTotalSales(sales) / sales.length;
    }
    //номер месяцев с макс.продажами (посл)
    public int findMonthWithMaxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }
    //номер месяцв с минимальными продажами (посл)
    public int findMonthWithMinSales(long[] sales) {
        int minMonth = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }
    //количество месяцев с продажами ниже среднего
    public int countMonthsBelowAverage(long[] sales) {
        double average = calculateAverageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }
    //количество месяцев с продажами выше среднего
    public int countMonthsAboveAverage(long[] sales) {
        double average = calculateAverageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }
}
