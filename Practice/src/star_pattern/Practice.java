package star_pattern;

import java.util.Scanner;

public class Practice {
	
	public static void main(String [] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number");
		int a =sc.nextInt();
		int c=a;
		int arm =0;
		while(a>0) {
		int r = a%10;
		arm = (r*r*r)+arm;
		a=a/10;
		}
		if(c==a) {
		System.out.println("Given number is amstrong number");
		} 
		else {
			
		System.out.println("Given number is not amstronh number");
		}
     }

}
