package program.swing.whatTodayEat.buttonEnum;

public enum FoodCategory {
    ALL("전체", 0,20,100,84,40),
    KOREA("한식", 1,120,100,84,40),
    CHINA("중식", 2,220,100,84,40),
    JAPAN("일식", 3,320,100,84,40),
    FOREIGN("양식", 4,420,100,84,40);

    private final String foodCategory;
    private final int index;
    private final int x;
    private final int y;
    private final int width;
    private final int height;

    FoodCategory(String foodCategory, int index, int x, int y, int width, int height) {
        this.foodCategory = foodCategory;
        this.index = index;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public String value() {
        return foodCategory;
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
