package program.swing.whatTodayEat;

public enum Distance {
    All("9999"),
    THREE_HUNDRED("300"),
    FIVE_HUNDRED("500"),
    ONE_KILOMETER("1000");

    private final String distance;

    Distance(String distance) {
        this.distance = distance;
    }

    public String value() {
        return distance;
    }
}
