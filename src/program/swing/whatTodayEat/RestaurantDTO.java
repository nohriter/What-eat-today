package program.swing.whatTodayEat;

public class RestaurantDTO {
    private final String name;
    private final int distance;
    private final String category;

    public RestaurantDTO(String name, int distance, String category) {
        this.name = name;
        this.distance = distance;
        this.category = category;
    }

    public String getName() {
        return name;
    }

}
