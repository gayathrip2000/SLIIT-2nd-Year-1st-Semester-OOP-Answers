package Question3;

import java.util.ArrayList;

public class GenericEmployee <T extends IEmployee>{
	
	ArrayList<T> obj;
	
	public void showElements(ArrayList<T> obj) {
		
		for(T value : obj) {
			System.out.println(value.showEmployeeDetails());
		}
		
	}

}
