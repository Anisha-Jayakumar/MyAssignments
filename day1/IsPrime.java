package week1.day1;

public class IsPrime {
	public static void main(String[] args) {
		int number = 1;
		int count=0;
		if(number<=1) {
			System.out.println(number + " is not a prime number");
			return;
		}
		for(int i=2;i<number/i;i++) {
			if(number % i == 0) {
		        count++;	
			}
		}
		if(count>1) {
			System.out.println(number+" is not a prime number");
		}
		else {
			System.out.println(number+" is a prime number");
		}
	}

}
