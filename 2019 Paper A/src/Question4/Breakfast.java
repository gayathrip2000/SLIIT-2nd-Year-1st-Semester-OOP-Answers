package Question4;

public class Breakfast extends Meal {

	@Override
	public void displayMeal() {
		// TODO Auto-generated method stub
		System.out.println("Preparing Breakfast.......");
		mealWithFiavour();
		meallnDuration();
		displayCost();
		System.out.println();
	}

	@Override
	public void displayCost() {
		// TODO Auto-generated method stub
		System.out.println("Cost for the meal is =  " +iPrepareDeliciously.getCost());
	}

}
