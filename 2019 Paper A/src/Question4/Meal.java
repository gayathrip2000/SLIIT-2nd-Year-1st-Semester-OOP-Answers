package Question4;

public abstract class Meal {
	
	IPrepareDeliciously iPrepareDeliciously ;
	IPrepareQuickly iPrepareQuickly;
	
	void setFlavour(IPrepareDeliciously iPrepareDeliciously) {
		
		this.iPrepareDeliciously=iPrepareDeliciously;
	}
	
	
	
	void setDuration(IPrepareQuickly iPrepareQuickly) {
		
		this.iPrepareQuickly=iPrepareQuickly;
	}

	void  mealWithFiavour(){
		iPrepareDeliciously.addFlavour();
	}
	void  meallnDuration() {
		 iPrepareQuickly.deliveryTime();
	}
	
	
	abstract public void displayMeal();
	abstract public void  displayCost();
	
}


