package week1.day1;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=23;
		int count=0;
		for (int i = 2; i <num/2; i++) {
			if (num%i==0) {
				count++;
				break;
			}
		}
		if (count==0) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not a Prime Number");
			}
			
		}

	}


