package exercice5;
import org.example.exercice5.entity.QualityException;
import org.example.exercice5.entity.Shop;

import org.example.exercice5.entity.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class ProductTest {

    private Shop shop;
    private Product product;

    @BeforeEach
    void setUp() {
        shop = new Shop();

    }

    @org.junit.jupiter.api.Test
    void testUpdateShouldDecreaseQuality() throws QualityException {
        int quality = 1;
        int sellIn = 1;
        product = Product.builder().name("p1").type("t1").quality(quality).sellIn(sellIn).build();
        shop.update(product);
        Assertions.assertEquals(0, product.getQuality());
    }

    @org.junit.jupiter.api.Test
    void testUpdateShouldDecreaseSellIn() throws QualityException {
        int quality = 1;
        int sellIn = 1;
        product = Product.builder().name("p1").type("t1").quality(quality).sellIn(sellIn).build();
        shop.update(product);
        Assertions.assertEquals(0, product.getSellIn());
    }

    @org.junit.jupiter.api.Test
    void testUpdateShouldDecreaseQualityTwiceWhenSellInIs0() throws QualityException {
        int quality = 10;
        int sellIn = 0;
        product = Product.builder().name("p1").type("t1").quality(quality).sellIn(sellIn).build();
        shop.update(product);
        Assertions.assertEquals(8, product.getQuality());
    }

    @org.junit.jupiter.api.Test
    void testUpdateShouldRaiseQualityExceptionWhenQualityIsNegative() {
        int quality = -10;
        int sellIn = 0;
        product = Product.builder().name("p1").type("t1").quality(quality).sellIn(sellIn).build();

        Assertions.assertThrowsExactly(QualityException.class, () -> {
            shop.update(product);
        });
    }

    @org.junit.jupiter.api.Test
    void testUpdateShouldRaiseQualityExceptionWhenQualityIsMoreThan50() {
        int quality = 51;
        int sellIn = 0;
        product = Product.builder().name("p1").type("t1").quality(quality).sellIn(sellIn).build();

        Assertions.assertThrowsExactly(QualityException.class, () -> {
            shop.update(product);
        });
    }

    @org.junit.jupiter.api.Test
    void testUpdateShouldIncreaseQualityWhenProductIsBrie() throws QualityException {
        product = Product.builder().quality(10).sellIn(10).name("brie vielli").type("laitier").build();

        shop.update(product);
        Assertions.assertEquals(11, product.getQuality());
    }

    @org.junit.jupiter.api.Test
    void testUpdateShouldDecreaseQualityTwiceWhenProductTypeIsDairy() throws QualityException {
        product = Product.builder().quality(10).sellIn(10).name("p1").type("laitier").build();
        shop.update(product);
        Assertions.assertEquals(8, product.getQuality());
    }
    @Test
    void testUpdateShouldDecreaseQualityTwiceWhenProductTypeIsDairyAndSellInIs0() throws QualityException {
        product = Product.builder().quality(10).sellIn(0).name("p1").type("laitier").build();
        shop.update(product);
        Assertions.assertEquals(6, product.getQuality());
    }
}
