package org.example.warehouse;

public record Category(String name) {
    private Category {
        if(name ==  null) {
            throw new IllegalArgumentException("Category name can't be null");
        }
        this.name = capitalizeFirstLetter(name);
    }
    private String capitalizeFirstLetter (String inputName) {
        if(inputName == null || inputName.isEmpty()){
            return inputName;
        }
        return Character.toUpperCase(inputName.charAt(0)) + inputName.substring(1);
    }
    static Category category = Category.of("Example");
    private Category(){
        this(null);
    }
    public static Category of(String name) {
        return new Category(name);
    }
    public boolean getName () {
        return false;
    }
}



//TODO: DisplayName Category, = made record ✅
// Category should have no public constructors, = made private Constructor ✅
// Create names from .of-method = made constructor with of-method
// shouldBeOfSameInstanceForSameName,
// shouldAlwaysHaveUppercaseFirstLetter,
// ofThrowsIllegalArgumentExceptionIfNameIsNull =