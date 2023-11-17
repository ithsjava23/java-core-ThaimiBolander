package org.example.warehouse;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class Category {
    private final String name;
    private static final Map<String, Category> categories = new HashMap<>();


    private Category (String name) {
        if (name == null) {
            throw new IllegalArgumentException("Category name can't be null");
        }
        name = capitalizeFirstLetter(name);
        this.name = name;
    }

    private static String capitalizeFirstLetter (String str) {
        if (str.isEmpty()) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public static Category of (String name) {
        if (categories.containsKey(name))
            return categories.get(name);
        var category = new Category(name);
        categories.put(name, category);
        return category;
    }

    public String getName () {
        return name;
    }

    public String name () {
        return name;
    }

    @Override
    public boolean equals (Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Category) obj;
        return Objects.equals(this.name , that.name);
    }

    @Override
    public int hashCode () {
        return Objects.hash(name);
    }

    @Override
    public String toString () {
        return "Category[" +
                "name=" + name + ']';
    }

}


//TODO: DisplayName Category, = made record ✅
// Category should have no public constructors, = made private Constructor ✅
// Create names from .of-method = made constructor with of-method
// shouldBeOfSameInstanceForSameName,
// shouldAlwaysHaveUppercaseFirstLetter,
// ofThrowsIllegalArgumentExceptionIfNameIsNull =