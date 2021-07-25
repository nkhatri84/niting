package package_1;

import java.util.Scanner;

public class Swapnum2 {

	public static void main(String[] args) {
		
		System.out.println("Please enter the value of a");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		System.out.println("please enter the value of b");
		int b=s.nextInt();
		int c;
		c=a+b;
		a=c-a;
		b=c-a;
		System.out.println("value of a "+a);
		System.out.println("value of b "+b);
	}
}
