package program.swing.whatTodayEat;

public class Controller {
    private Model model = new Model();

    public Restaurant getRestaurant(String distance, String category) {
        return model.getRestaurant(distance, category);
    }
}
