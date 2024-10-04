package week3.day2.homeactivity;

public class ReverseOddWords {
	public static void main(String[] args) {
		String text="I am a software tester";
		String[] words = text.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (i%2==1) {
			    char[] ch1 = words[i].toCharArray();
                
	               
                for (int j = 0, k = ch1.length - 1; j < k; j++, k--) {
                    char temp = ch1[j];
                    ch1[j] = ch1[k];
                    ch1[k] = temp;
                }
                words[i]=new String (ch1);
			}
		}
		for(String word:words) {
			
			System.out.print(word+" ");
		}
	}
}

				
				
				
			