package degfah;

import java.util.Scanner;

public class degfeg {

	public static void main(String[] args) {
		float temp;
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the temperature : ");
		temp = sc.nextFloat();
		temp = ((temp-32)*5)/9;
		System.out.println("celsium temp is"+temp);
		
		

	}

}
