package org.example.warehouse;

import org.example.warehouse.Category;

import java.util.List;

public record Product(String name, float price, List<Product> products) {
}
