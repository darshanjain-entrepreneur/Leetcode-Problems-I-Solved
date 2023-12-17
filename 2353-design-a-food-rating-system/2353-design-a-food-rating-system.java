import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class FoodRatings {

    Map<String, PriorityQueue<FoodRate>> cuisine_foodRateMap = new HashMap<>();

    Map<String, FoodRate> food_foodRateMap = new HashMap<>();

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        for (int i = 0; i < foods.length; i++) {
            FoodRate foodRate = new FoodRate(foods[i], ratings[i], cuisines[i]);
            food_foodRateMap.put(foods[i], foodRate);
            cuisine_foodRateMap.computeIfAbsent(cuisines[i], x -> new PriorityQueue<>((a, b) -> {
                if (a.rate == b.rate) return a.food.compareTo(b.food);
                return b.rate - a.rate;
            })).add(foodRate);
        }
    }

    public void changeRating(String food, int newRating) {
        FoodRate foodRate = food_foodRateMap.get(food);
        PriorityQueue<FoodRate> pq = cuisine_foodRateMap.get(foodRate.cuisine);
        pq.remove(foodRate);
        foodRate.rate = newRating;
        pq.offer(foodRate);
    }

    public String highestRated(String cuisine) {
        return cuisine_foodRateMap.get(cuisine).peek().food;
    }
}

class FoodRate {
    String food;
    int rate;
    String cuisine;

    public FoodRate(String food, int rate, String cuisine) {
        this.food = food;
        this.rate = rate;
        this.cuisine = cuisine;
    }
}
/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */