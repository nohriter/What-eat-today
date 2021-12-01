package program.swing.whatTodayEat.buttonEnum;

public enum DistanceImage {
    ALL_BASIC("image/basic_all_btn.jpg"),
    ALL_HOVER("image/hover_all_btn.jpg"),
    ALL_SELECTED("image/selected_all_btn.jpg"),
    THREE_HUNDRED_BASIC("image/basic_300_btn.jpg"),
    THREE_HUNDRED_HOVER("image/hover_300_btn.jpg"),
    THREE_HUNDRED_SELECTED("image/selected_300_btn.jpg"),
    FIVE_HUNDRED_BASIC("image/basic_500_btn.jpg"),
    FIVE_HUNDRED_HOVER("image/hover_500_btn.jpg"),
    FIVE_HUNDRED_SELECTED("image/selected_500_btn.jpg"),
    ONE_KILOMETER_BASIC("image/basic_1km_btn.jpg"),
    ONE_KILOMETER_HOVER("image/hover_1km_btn.jpg"),
    ONE_KILOMETER_SELECTED("image/selected_1km_btn.jpg");

    private final String url;

    DistanceImage(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }


}
