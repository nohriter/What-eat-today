package program.swing.whatTodayEat;

public enum Distance {
    All("전체"),
    THREE_HUNDRED("300m"),
    FIVE_HUNDRED("500m"),
    ONE_KILOMETER("1km");

    private final String distance;

    Distance(String distance) {
        this.distance = distance;
    }

    public String value() {
        return distance;
    }
}
