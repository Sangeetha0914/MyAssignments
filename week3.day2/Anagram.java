package week3.day2.homeactivity;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        String text1="stops";
	        String text2="potss";
	       if(text1.length()==text2.length()) {
	        	
	        	System.out.println("String is an Anagaram");
	        }else {
	        	System.out.println("Lengths mismatch String is not an anagram ");
	        	
	        }
	       char[] ch1 = text1.toCharArray();
	       char[] ch2 = text2.toCharArray();
	       Arrays.sort(ch1);
	       Arrays.sort(ch2);
	       boolean result = Arrays.equals(ch1,ch2);
	     
	    		   if (result) {
	    			   System.out.println("The given strings are anagram");
					
				} else {
					System.out.println("The given strings are not an anagram ");

				}
					
				}
	    		 
			
			
		}
	


	                  
	      
		
		

	

	




