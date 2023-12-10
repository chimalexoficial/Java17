package PrimitiveDataTypes11;

import java.math.BigDecimal;

public class SimpleInterestCalculator2Runner {
    public static void main(String[] args) {
        SimpleInterestCalculator2 calculator = new SimpleInterestCalculator2("4500.00", "7.5");
        BigDecimal totalValue = calculator.calculateTotalValue(5);
        System.out.println(totalValue);
    }
}
