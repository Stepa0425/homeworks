package by.it_academy.homeworks.hw9.Practice;

public abstract class Food {
    private FoodType foodType;

    public Food(FoodType foodType) {
        this.foodType = foodType;
    }

    public FoodType getFoodType() {
        return foodType;
    }
}
