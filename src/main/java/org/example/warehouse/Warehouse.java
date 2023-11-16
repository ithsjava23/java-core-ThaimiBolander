package org.example.warehouse;

import java.math.BigDecimal;
import java.util.UUID;

public record Warehouse(String name, Category category, int price, UUID uuid) {
    //TODO: shouldHaveNoPublicConstructors
    // isCreatedWithFactory


    public static Warehouse getInstance(String newWarehouse) {
        return null;
    }

//    public ProductRecord addProduct(UUID id, String name, Category category, BigDecimal price) {
//        return null;
    }
}
