package program.swing.whatTodayEat;

import java.util.HashMap;
import java.util.Map;

public class RestaurantData {
    private Integer id = 0;
    private Map<Integer, Restaurant> restaurants = new HashMap<>();

    public RestaurantData() {
        restaurants.put(generatedId(), new Restaurant(id,"김치찌개",300,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"돈까스",500,"양식"));
        restaurants.put(generatedId(), new Restaurant(id,"초밥",300,"일식"));
        restaurants.put(generatedId(), new Restaurant(id,"짜장면",500,"중식"));
        restaurants.put(generatedId(), new Restaurant(id,"비빔밥",500,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"순대국",300,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"파스타",500,"양식"));
        restaurants.put(generatedId(), new Restaurant(id,"탕수육",1000,"중식"));
        restaurants.put(generatedId(), new Restaurant(id,"고등어정식",300,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"불고기",1000,"한식"));
        restaurants.put(generatedId(), new Restaurant(id,"새우덮밥",1000,"일식"));
    }

    private Integer generatedId() {
        return id++;
    }

    public Map<Integer, Restaurant> getAllRestaurants() {
        return restaurants;
    }
}
