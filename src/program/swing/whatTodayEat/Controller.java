package program.swing.whatTodayEat;

public class Controller {
    private Service model = new Service();

    public Restaurant getRestaurant(String distance, String foodCategory) {
        return model.getRestaurant(distance, foodCategory);
    }
}
