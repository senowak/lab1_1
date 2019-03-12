package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;
import java.util.Date;

public class Product {

    private String id;

    private String name;

    private Date snapshotDate;

    private String type;

    private Money price;

    public Product(String productId, BigDecimal productPrice, String productName, Date productSnapshotDate, String productType) {
        this(productId, productPrice, productName, productSnapshotDate, productType, null);
    }

    public Product(String productId, BigDecimal productPrice, String productName, Date productSnapshotDate, String productType,
            String productCurrency) {
        this.id = productId;
        this.name = productName;
        this.snapshotDate = productSnapshotDate;
        this.type = productType;
        this.price = new Money(productPrice, productCurrency);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getSnapshotDate() {
        return snapshotDate;
    }

    public String getType() {
        return type;
    }

    public Money getPrice() {
        return price;
    }
}
