package Question4;

public class Dinner extends Meal{

	@Override
	public void displayMeal() {
		// TODO Auto-generated method stub
		System.out.println("Preparing Dinner.......");
		mealWithFiavour();
		meallnDuration();
		displayCost();
		System.out.println();
	}

	@Override
	public void displayCost() {
		// TODO Auto-generated method stub
		System.out.println("Cost for the meal is " +iPrepareDeliciously.getCost());

	}

}
