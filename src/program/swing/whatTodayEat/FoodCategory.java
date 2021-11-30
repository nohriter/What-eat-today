package program.swing.whatTodayEat;

public enum FoodCategory {
    ALL("전체"),
    KOREA("한식"),
    CHINA("중식"),
    JAPAN("일식"),
    FOREIGN("양식");

    private final String foodCategory;

    FoodCategory(String foodCategory) {
        this.foodCategory = foodCategory;
    }

    public String value() {
        return foodCategory;
    }
}
