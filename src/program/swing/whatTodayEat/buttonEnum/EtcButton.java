package program.swing.whatTodayEat.buttonEnum;

public enum EtcButton {
    JLABEL(20,166,484,252),
    RANDOM_BUTTON(20,444,486,90);

    private final int x;
    private final int y;
    private final int width;
    private final int height;

    EtcButton(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
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
