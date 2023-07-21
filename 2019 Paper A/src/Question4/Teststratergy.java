package Question4;

public class Teststratergy { 

public static void main(String[] args) { 
	
	
	Meal meal = new Breakfast();
	meal.setFlavour(new ChickenFlavour());
	meal.setDuration(new ThirtyMinutes());
	meal.displayMeal();
	

	Meal meal2 = new Lunch();
	meal.setFlavour(new FishFlavour());
	meal.setDuration(new OneHour());
	meal.displayMeal();
	
	
	Meal meal3 = new Dinner();
	meal.setFlavour(new EggFlavour());
	meal.setDuration(new FourtyFiveMinutes());
	meal.displayMeal();
	
	
	
}
	
}

