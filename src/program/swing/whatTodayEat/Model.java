package program.swing.whatTodayEat;

import program.swing.whatTodayEat.buttonEnum.Distance;
import program.swing.whatTodayEat.buttonEnum.FoodCategory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Model {
    private final RestaurantData restaurantData = new RestaurantData();
    private final Map<Integer, Restaurant> restaurants = restaurantData.getAllRestaurants();

    public ResponseDTO getRestaurant(RequestDTO requestDTO) {
        String distance = requestDTO.getSelectedDistance();
        String foodCategory = requestDTO.getSelectedFood();

        List<Restaurant> restaurantList = new ArrayList<>(restaurants.values());

        Collections.shuffle(restaurantList);

        List<Restaurant> tempList = new ArrayList<>();

        if (distance.equals(Distance.All.value()) && foodCategory.equals(FoodCategory.ALL.value())) {

            Restaurant restaurant = restaurantList.get(0);

            return new ResponseDTO(restaurant.getName(), restaurant.getDistance(), restaurant.getCategory());
        }

        if (foodCategory.equals(FoodCategory.ALL.value())) {
            for (Restaurant restaurant : restaurantList) {
                if (restaurant.getDistance() <= Integer.parseInt(distance)) {
                    tempList.add(restaurant);
                }
            }

            Restaurant restaurant = tempList.get(0);

            return new ResponseDTO(restaurant.getName(), restaurant.getDistance(), restaurant.getCategory());
        }

        if (distance.equals(Distance.All.value())) {
            for (Restaurant restaurant : restaurantList) {
                if (restaurant.getCategory().equals(foodCategory)) {
                    tempList.add(restaurant);
                }
            }

            Restaurant restaurant = tempList.get(0);

            return new ResponseDTO(restaurant.getName(), restaurant.getDistance(), restaurant.getCategory());
        }

        for (Restaurant restaurant : restaurantList) {
            if (restaurant.getDistance() <= Integer.parseInt(distance)
                    && restaurant.getCategory().equals(foodCategory)) {

                tempList.add(restaurant);
            }
        }

        Restaurant restaurant = tempList.get(0);

        return new ResponseDTO(restaurant.getName(), restaurant.getDistance(), restaurant.getCategory());
    }
}
