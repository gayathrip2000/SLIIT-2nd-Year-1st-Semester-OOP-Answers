package Question2;

import java.util.ArrayList;

public class GenericPerson<T extends IPerson> {
	
	ArrayList<T>obj;
	
	public void displayElements(ArrayList<T>obj) {
		
		for(T value : obj){
			 System.out.println(value.displayDetails());
			
		}
	}
	
	

}
