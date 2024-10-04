package week3.day2.homeactivity;



public class RemoveDuplicateValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String text = "We learn Java basics as part of java sessions in java week1";
        
        String lowerValues= text.toLowerCase();      
        String[] words = lowerValues.split(" ");             
        int count = 0;
        
       
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                
                if (words[i].equals(words[j]) && !words[i].equals("")) {
                    words[j] = "";  
                    count++;        
                }
            }
        }        
       
        System.out.println("Modified array after removing duplicates from the string are :");
        for (String word : words) {
            if (!word.equals("")) {
                System.out.print(word + " ");
            }
        }
        
         System.out.println("Number of duplicates: " + count);
        
     
	}



	}



