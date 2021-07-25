package package_1;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("please enter number");
		int n=s.nextInt(); int rev=0; int r;
		int temp=n;
		
		while(temp!=0)
		{
			r=temp%10;
			rev=rev*10+r;
			temp=temp/10;
		}
		
		if(n==rev)
		{
			System.out.println("number is palindrome number");
		}
		
		else
		{
			System.out.println("number is not palindrome number");
		}
		
	}

}
