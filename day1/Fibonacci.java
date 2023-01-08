package week1.day1;


public class Fibonacci {
 public static void main(String[] args) {
	int first = 0;
	int second = 1;
	int sum = 0;
	System.out.println(first);
	System.out.println(second);
	for (int i = 1; i < 10; i++) {
		sum = first+second;
		System.out.println(sum);
		first = second;
		second = sum;
	}
	
	}
}

