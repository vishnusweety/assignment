package degfah;

import java.util.Scanner;

public class integer {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the integer number between 0 to 1000:");
		int num=in.nextInt();
		int sumofdigits=(num%10)+((num/10)%10)+(num/100);
		System.out.println("sum of digits is :"+sumofdigits);
		
		

	}

}
