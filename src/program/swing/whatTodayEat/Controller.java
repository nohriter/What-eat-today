package program.swing.whatTodayEat;

public class Controller {
    private Model model = new Model();

    public RestaurantDTO getRestaurant(String distance, String foodCategory) {
        return model.getRestaurant(distance, foodCategory);
    }
}
