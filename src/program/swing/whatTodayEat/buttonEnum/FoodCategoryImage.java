package program.swing.whatTodayEat.buttonEnum;

public enum FoodCategoryImage {
    ALL_BASIC("image/food_basic_all_btn.jpg"),
    ALL_HOVER("image/food_hover_all_btn.jpg"),
    ALL_SELECTED("image/food_selected_all_btn.jpg"),
    KOREA_BASIC("image/food_basic_korea_btn.jpg"),
    KOREA_HOVER("image/food_hover_korea_btn.jpg"),
    KOREA_SELECTED("image/food_selected_korea_btn.jpg"),
    CHINA_BASIC("image/food_basic_china_btn.jpg"),
    CHINA_HOVER("image/food_hover_china_btn.jpg"),
    CHINA_SELECTED("image/food_selected_china_btn.jpg"),
    JAPAN_BASIC("image/food_basic_japan_btn.jpg"),
    JAPAN_HOVER("image/food_hover_japan_btn.jpg"),
    JAPAN_SELECTED("image/food_selected_japan_btn.jpg"),
    FOREIGN_BASIC("image/food_basic_foreign_btn.jpg"),
    FOREIGN_HOVER("image/food_hover_foreign_btn.jpg"),
    FOREIGN_SELECTED("image/food_selected_foreign_btn.jpg");

    private final String url;

    FoodCategoryImage(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}
