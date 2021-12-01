package program.swing.whatTodayEat.buttonEnum;

public enum Distance {
    All("9999",0,20,31,106,40),
    THREE_HUNDRED("300",1,146,31,106,40),
    FIVE_HUNDRED("500",2,272,31,106,40),
    ONE_KILOMETER("1000",3,398,31,106,40);

    private final String distance;
    private final int index;
    private final int x;
    private final int y;
    private final int width;
    private final int height;


    Distance(String distance, int index, int x, int y, int width, int height) {
        this.distance = distance;
        this.index = index;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public String value() {
        return distance;
    }

    public int index() {
        return index;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
