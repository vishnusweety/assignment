package degfah;

import java.util.Scanner;

public class inchmeter {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("enter the number in inches :");
		double inches =input.nextDouble();
		double meter =inches *0.254;
		System.out.println("the number in meter"+meter);
		
		
			

	}

}
