package package_1;

public class Febonacci {
	
	public static void main(String[] args) {
		int x=0;
		int y=1;int sum=0;int n=10;
		
		while(sum<=100)
		{   System.out.println(sum);
			x=y;
		    y=sum;
		    sum=x+y;
		}
	}

}
