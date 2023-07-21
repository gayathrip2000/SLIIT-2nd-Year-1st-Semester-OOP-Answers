package Question1;

import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Item> item = new ArrayList<>();
		
	  Book  b1=  new Book(1, "ABC", 350.00, "Sarasavi","DSA", 200);
	  Book  b2=  new Book(2, "ABC", 350.00, "Sarasavi","DSA", 200);
	  
	  item.add(b1);
	  item.add(b2);
	  
	  Car c1 = new Car(1, "Nissan", 12000000, "Electric","hatchback");

	  Car c2 = new Car(2, "Nissan", 22000000, "Electric","hatchback");
	  
	  
	  item.add(c1);
	  item.add(c2);
	  
	  
	  for(Item x : item) {
		  x.Display();
		  System.out.println();
	  }
	}

}
