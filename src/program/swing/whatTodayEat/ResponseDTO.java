package program.swing.whatTodayEat;

public class ResponseDTO {
    private final String name;
    private final int distance;
    private final String category;

    public ResponseDTO(String name, int distance, String category) {
        this.name = name;
        this.distance = distance;
        this.category = category;
    }

    public String getName() {
        return name;
    }

}
