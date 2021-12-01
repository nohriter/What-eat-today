package program.swing.whatTodayEat.buttonEnum;

public enum RandomButtonImage {
    BASIC("image/basic_random_btn.jpg"),
    HOVER("image/hover_random_btn.jpg");

    private final String url;

    RandomButtonImage(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}
