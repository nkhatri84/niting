package package_1;

public class Armstrong {
	public static void main(String[] args) {
		
		int n=371; int sum=0;int r;
		int temp=n;
		while(temp!=0)
		{
			r=temp%10;
			temp=temp/10;
			sum=sum+r*r*r;
		}
		
		if(sum==n)
		{
			System.out.println("number is an armstrong number");
		}
		
		else
		{
			System.out.println("number is not an armstrong number");
		}
	}

}
