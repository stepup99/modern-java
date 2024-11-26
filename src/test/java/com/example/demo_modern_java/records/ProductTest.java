package com.example.demo_modern_java.records;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void name() {
        //given
        var product = new Product("Iphone", new BigDecimal("999.99"), "ELECTRONICS");
        System.out.println("product = "+product);
        Assertions.assertEquals("Iphone", product.name());
        Assertions.assertEquals("ELECTRONICS", product.type());
    }

    @Test
    void cost() {
    }

    @Test
    void type() {
    }
}