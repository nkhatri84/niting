package package_1;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("please enter the number");
		int n=s.nextInt();int temp=0;
		for (int i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				temp=temp+1;
			}
		}
		
		if(temp>=1)
		{
			System.out.println("number is not prime");
		}
		else
		{
			System.out.println("number is prime");
		}
	}

}
