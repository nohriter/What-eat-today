package program.swing.whatTodayEat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Service {
    private RestaurantData restaurantData = new RestaurantData();
    private Map<Integer, Restaurant> restaurants = restaurantData.getAllRestaurants();

    public Restaurant getRestaurant(String distance, String foodCategory) {
        List<Restaurant> restaurantList = new ArrayList<>(restaurants.values());

        Collections.shuffle(restaurantList);

        List<Restaurant> tempList = new ArrayList<>();

        if (distance.equals(Distance.All.value()) && foodCategory.equals(FoodCategory.ALL.value())) {
            return restaurantList.get(0);
        }

        if (foodCategory.equals(FoodCategory.ALL.value())) {
            for (Restaurant restaurant : restaurantList) {
                if (restaurant.getDistance() <= Integer.parseInt(distance)) {
                    tempList.add(restaurant);
                }
            }

            return tempList.get(0);
        }

        if (distance.equals(Distance.All.value())) {
            for (Restaurant restaurant : restaurantList) {
                if (restaurant.getCategory().equals(foodCategory)) {
                    tempList.add(restaurant);
                }
            }

            return tempList.get(0);
        }

        for (Restaurant restaurant : restaurantList) {
            if (restaurant.getDistance() <= Integer.parseInt(distance)
                    && restaurant.getCategory().equals(foodCategory)) {

                tempList.add(restaurant);
            }
        }

        return tempList.get(0);
    }
}
