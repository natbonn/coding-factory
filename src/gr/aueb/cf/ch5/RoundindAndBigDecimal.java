package gr.aueb.cf.ch5;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundindAndBigDecimal {
    public static void main(String[] args) {
        BigDecimal bigNum = new BigDecimal("10.2345");
        BigDecimal divisor = new BigDecimal("3");
        BigDecimal result = BigDecimal.ZERO;
        BigDecimal result2 = BigDecimal.ZERO;

        result = bigNum.divide(divisor, 2, RoundingMode.HALF_UP);   // 2.345 -> 2.35
        result = bigNum.divide(divisor, 2, RoundingMode.HALF_EVEN); // 2.345 -> 2.34


        System.out.println("Result: " + result);
        System.out.println("Result2: " + result2);
    }
}
