package program.swing.whatTodayEat;

import java.util.HashMap;
import java.util.Map;

public class RestaurantData {
    private Integer id = 0;
    private Map<Integer, Restaurant> restaurants = new HashMap<>();

    public RestaurantData() {
        restaurants.put(generatedId(), new Restaurant(id,"김치찌개","300m","한식"));
        restaurants.put(generatedId(), new Restaurant(id,"돈까스","300m","양식"));
        restaurants.put(generatedId(), new Restaurant(id,"초밥","300m","일식"));
        restaurants.put(generatedId(), new Restaurant(id,"짜장면","300m","중식"));
        restaurants.put(generatedId(), new Restaurant(id,"비빔밥","300m","한식"));
        restaurants.put(generatedId(), new Restaurant(id,"순대국","300m","한식"));
        restaurants.put(generatedId(), new Restaurant(id,"감자탕","300m","한식"));
        restaurants.put(generatedId(), new Restaurant(id,"백반","300m","한식"));
        restaurants.put(generatedId(), new Restaurant(id,"고등어정식","300m","한식"));
        restaurants.put(generatedId(), new Restaurant(id,"불고기","300m","한식"));
        restaurants.put(generatedId(), new Restaurant(id,"댄장찌개","300m","한식"));
    }

    private Integer generatedId() {
        return id++;
    }

    public Map<Integer, Restaurant> getRestaurants() {
        return restaurants;
    }
}
