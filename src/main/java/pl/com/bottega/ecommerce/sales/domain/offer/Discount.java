package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;

public class Discount {

    private String cause;

    Money value;

    public Discount(BigDecimal kasa) {
        this(kasa, null);
    }

    public Discount(BigDecimal kasa, String cause) {
        this.value = new Money(kasa);
        this.cause = cause;
    }

    public Money getValue() {
        return value;
    }

    public String getCause() {
        return cause;
    }
}
