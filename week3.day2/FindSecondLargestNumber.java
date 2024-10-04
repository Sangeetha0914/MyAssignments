package week3.day2.homeactivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]array= {3,2,11,4,6,7};
		List<Integer>obj=new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {			
			obj.add(array[i]);
			
		}
		System.out.println(obj);
		Collections.sort(obj);
		System.out.println(obj);	
	
		System.out.println(obj.get(4));
		
		
		
		
		


	}
}











