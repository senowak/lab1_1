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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (cause == null ? 0 : cause.hashCode());
        result = prime * result + (value == null ? 0 : value.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Discount other = (Discount) obj;
        if (cause == null) {
            if (other.cause != null)
                return false;
        } else if (!cause.equals(other.cause))
            return false;
        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        return true;
    }

}
