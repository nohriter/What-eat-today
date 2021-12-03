package program.swing.whatTodayEat;

public class RequestDTO {
    private String selectedDistance;
    private String selectedFood;

    public RequestDTO(String selectedDistance, String selectedFood) {
        this.selectedDistance = selectedDistance;
        this.selectedFood = selectedFood;
    }

    public String getSelectedDistance() {
        return selectedDistance;
    }

    public String getSelectedFood() {
        return selectedFood;
    }
}
