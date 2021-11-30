package program.swing.whatTodayEat;

public class Restaurant {
    private Integer id;
    private String name;
    private int distance;
    private String category;

    public Restaurant(Integer id, String name, int distance, String category) {
        this.id = id;
        this.name = name;
        this.distance = distance;
        this.category = category;
    }

    public int getDistance() {
        return distance;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }
}
