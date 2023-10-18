package org.example.warehouse;

import org.junit.jupiter.api.DisplayName;

public record Category(String name) {
    private static Category of(String name) {
        return null;
    }

    public String getName() {
        return null;
    }

    //TODO: DisplayName Category,
    // Category should have no public constructors, -> make it private?
    // Create names from .of-method,
    // shouldBeOfSameInstanceForSameName,
    // shouldAlwaysHaveUppercaseFirstLetter,
    // ofThrowsIllegalArgumentExceptionIfNameIsNull

}
