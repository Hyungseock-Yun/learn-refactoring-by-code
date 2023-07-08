package me.whiteship.refactoring._24_comments._43_introduce_assertion;

public class Customer {

    private Double discountRate;

    public double applyDiscount(double amount) {
        return (this.discountRate != null) ? amount - (this.discountRate * amount) : amount;
    }

    public Double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(Double discountRate) {
        assert discountRate != null && discountRate > 0;    // but, assertion의 경우 JVM 옵션(-ea)을 끄면 통과하게 됨
//        if (discountRate != null && discountRate > 0) {
//            throw new IllegalArgumentException(discountRate + " can't be minus.");
//        }
        this.discountRate = discountRate;
    }
}
