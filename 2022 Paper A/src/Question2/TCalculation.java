package Question2;

import java.util.ArrayList;

public class TCalculation <T extends Number> {
	
	ArrayList<T> numList = new ArrayList<>();
	
	public void append(T value) {
		numList.add(value);
	}
		
	public double average() {
		
		double tot=0;
		
		for(T value : numList){
			tot += value.doubleValue(); //java that is equivalent to the method sum()
		}
		return tot/numList.size();
	}
	
	
	
}

