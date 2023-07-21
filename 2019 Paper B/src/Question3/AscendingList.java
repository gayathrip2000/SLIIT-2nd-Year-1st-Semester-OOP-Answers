package Question3;


import java.util.SortedSet;
import java.util.TreeSet;

public class AscendingList <T>{
	
	TreeSet<T> tree = new TreeSet<T>();
	
	public void add(T t) {
		
		tree.add(t);
	}
	
	public void displayMyList(AscendingList <T> list) {
		
			for(T value: list.tree) {
			
			System.out.println(value);
			
			}
	}
}
