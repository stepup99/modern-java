package com.example.demo_modern_java.records;

import java.math.BigDecimal;

public record Product(String name,
                      BigDecimal cost,
                      String type
                      ) {
}
