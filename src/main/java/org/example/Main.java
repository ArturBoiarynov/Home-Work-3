package org.example;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Locale;

public class Main {


    public static void main(String[] args) {
        Locale locale = Locale.GERMANY;
          //Product No-1
        int productNo = 1;
        String productName = "smartphone";
        int days = 5;
        BigDecimal totalSales = new BigDecimal("12153.41");
        BigDecimal salesByDay = totalSales.divide(BigDecimal.valueOf(days), MathContext.DECIMAL128);
          System.out.printf(locale,
                  "product No %d: %s,%ntotal sales for %d days is EUR %.2f,%nsales by day is EUR %.2f.%n",
          productNo, productName, days, totalSales,salesByDay);

          //Product No-2
        productNo = 2;
        productName = "laptope";
        days = 7;
        totalSales = new BigDecimal("10486.85");
        salesByDay = totalSales.divide(BigDecimal.valueOf(days), MathContext.DECIMAL128);
          System.out.printf(locale,
                  "product No %d: %s,%ntotal sales for %d days is EUR %.2f,%nsales by day is EUR %.2f.%n",
                  productNo, productName, days, totalSales, salesByDay);





    }
}