package gr.aueb.cf.ch13;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PaymentsUtil {

    private PaymentsUtil() {}

    /**
     * Rounds a BigDecimal to the specified number of decimal places
     * using HALF_UP rounding mode.
     * @param value           the amount to round.
     * @param decimalPlaces   the number of decimal places to round to.
     * @return                the rounded amount.
     */
    public static BigDecimal round(BigDecimal value,int decimalPlaces) {
        if (value == null) return BigDecimal.ZERO;
        return value.setScale(decimalPlaces, RoundingMode.HALF_UP);
    }

    /**
     * Calculates the difference between two BigDecimals
     * @param a             the first amount.
     * @param b             the second amount.
     * @param decimalPlaces the number of decimal places to round to.
     * @return              the difference between the two amount.
     */
    public static BigDecimal diff(BigDecimal a, BigDecimal b, int decimalPlaces) {
        if (a == null || b == null) return BigDecimal.ZERO;
        return b.subtract(a)
                .setScale(decimalPlaces, RoundingMode.HALF_UP);
    }
}
