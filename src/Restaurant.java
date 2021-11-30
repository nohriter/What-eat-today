public class Restaurant {
    private Integer id;
    private String name;
    private String distance;
    private String category;

    public Restaurant(Integer id, String name, String distance, String category) {
        this.id = id;
        this.name = name;
        this.distance = distance;
        this.category = category;
    }

    public String getDistance() {
        return distance;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }
}
