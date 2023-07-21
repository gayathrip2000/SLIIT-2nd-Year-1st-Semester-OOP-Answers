package Question2;

import java.util.Map;
import java.util.TreeMap;

public class AscendingTable <T,E>{
	
	
	Map<T,E> tree = new TreeMap<>();

	public void add(T t,E e) {
		tree.put(t,e);
	}
	
	public static <T,E> void display(AscendingTable <T,E> table) {
		

		for(Map.Entry<T,E> entry : table.tree.entrySet()) {
			
			System.out.println(entry.getKey() + ", " + entry.getValue());
		}
	}
}
