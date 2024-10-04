package week3.day2.homeactivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			String[] cmpNames = {"HCL", "Wipro", "Aspire Systems", "CTS"};
			List<String> com = new ArrayList<String>();
			for(int i=0;i<=cmpNames.length-1;i++) {
				com.add(cmpNames[i]);
			}
			Collections.sort(com);
					for(int i=com.size()-1;i>=0;i--) {
				System.out.print(com.get(i) + " ");

	}
		}
	}
	
