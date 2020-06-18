package Programmers;
import java.util.List;
import java.util.Set;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class ArraySet {
	
	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};
		Set set = new HashSet<>();
		set.add(arr);
		

		for(Iterator itr =set.iterator(); itr.hasNext();) {
			System.out.print(itr.next());
		System.out.println();	
		
		for(int n: set)
			System.out.print(n+'t');
		System.out.println();
		
		}
	}
	
}
