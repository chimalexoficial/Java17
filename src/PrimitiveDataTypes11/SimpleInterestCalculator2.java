package PrimitiveDataTypes11;

import java.math.BigDecimal;

public class SimpleInterestCalculator2 {
    private BigDecimal principal;
    private BigDecimal interest;

    public SimpleInterestCalculator2(String principal, String interest) {
        this.principal = new BigDecimal(principal);
        this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
    }

    public BigDecimal calculateTotalValue(int noOfYears) {
        BigDecimal noOfYearBigDecimal = new BigDecimal(noOfYears);
        BigDecimal totalValue = principal.add(principal.multiply(interest).multiply(noOfYearBigDecimal));
        return totalValue;
    }
}
