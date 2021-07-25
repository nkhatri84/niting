package package_1;

import java.util.Scanner;

public class Swapnum1 {
	public static void main(String[] args) {
		
		System.out.println("Please enter the value of a");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		System.out.println("Please enter the value of b");
		int b=s.nextInt();
	
		a=b+a;
		b=a-b;
		a=a-b;
		
		System.out.println("Value of a "+a);
		System.out.println("Value of b "+b);
	}

}
