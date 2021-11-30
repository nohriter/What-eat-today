package program.swing.whatTodayEat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Model {
    private RestaurantData restaurantData = new RestaurantData();
    private Map<Integer, Restaurant> restaurants = restaurantData.getRestaurants();

    public Restaurant getRestaurant(String distance, String category) {
        List<Restaurant> restaurantList = new ArrayList<>(restaurants.values());
        List<Restaurant> tempList = new ArrayList<>();

        for (Restaurant restaurant : restaurantList) {
            if (restaurant.getDistance().equals(distance) && restaurant.getCategory().equals(category)) {
                tempList.add(restaurant);
            }
        }

        Collections.shuffle(tempList);

        return tempList.get(0);
    }
}
