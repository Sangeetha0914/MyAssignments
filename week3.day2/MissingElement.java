package week3.day2.homeactivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num= {1,2,3,4,10,6,8};
		
		List<Integer>element=new ArrayList<Integer>();
		for (int i = 0; i < num.length-1; i++) {
			element.add(num[i]);
		}
		Collections.sort(element);
		for (int i = 0; i <element.size()-1; i++) {
			int current = element.get(i);
			int next = element.get(i+1);
			if (current +1 !=next) {
				System.out.println("Missing element is :"+(current+1));
				
			}
			
		}
	  
		}
		

	}


