package com.m2i.exoTests.exercice5;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ShopTest {

    private Shop shop;
    private Product product;
    private Product productTest;
    private List<Product> products = List.of(
            new Product("laitier", "lait", 45, 20),
            new Product("charcuterie", "saucisson", 35, 25),
            new Product("viennoiserie", "pain au chocolat", 12, 5),
            new Product("laitier", "Camembert", 25, 30)
    );

    // -	Une fois la date de péremption est à zéro, la qualité se dégrade deux fois plus vite.

    @Test
    public void whenSellInIs0UpdateQuality()
    {
        // Arrange
        Shop shop = new Shop(products);
        int qualityStart;
        int qualityAt0;
        int qualityAfter0;
        int nbUpdatesBefore0 = 0;
        int nbUpdatesAfter0 = 0;

        // Act
        for (Product product : products) {
            if (product.getName().equals("lait")) {
                productTest = product;
            }
        }
        qualityStart = productTest.getQuality();
        while (0 < productTest.getSellIn()) {
            shop.update(productTest);
            nbUpdatesBefore0++;
        }
        qualityAt0 = productTest.getQuality();
        while (-10 <= productTest.getSellIn()) {
            shop.update(productTest);
            nbUpdatesAfter0++;
        }
        qualityAfter0 = productTest.getQuality();
        int qualityDiffBefore0 = qualityStart - qualityAt0;
        int qualityDiffAfter0 = qualityAt0 - qualityAfter0;
        double quotientBefore0 = (double) qualityDiffBefore0 / nbUpdatesBefore0;
        double quotientAfter0 = (double) qualityDiffAfter0 / nbUpdatesAfter0;

//        // Assert
        Assert.assertEquals(quotientBefore0*2, quotientAfter0, 0);
    }
}
