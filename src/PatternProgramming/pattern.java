package PatternProgramming;

public class pattern {
 public static void main(String [] args) {
	 
	int n=5;
	
//	for(int i=0;i<n;i++) {
//		for(int j=0;j<n;j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
	
//	for(int i=1;i<=n;i++) {
//		for(int j=1;j<=n;j++) {
//			System.out.print(i+"");
//		}
//		System.out.println();
//	}
	
	
//	for(int i=1;i<=n;i++) {
//		for(int j=1;j<=n;j++) {
//			if(i==1||i==n||j==1||j==n) {
//			System.out.print("*");
//			}
//			else
//				System.out.print(" ");
//		}
//		System.out.println();
//	}
	
//	
//	int count=1;
//	for(int i=1;i<=n;i++) {
//		for(int j=1;j<=n;j++)
//		{
//			if(count<10)
//			{
//				System.out.print("0");
//			}
//			System.out.print(count+" ");
//			count++;
//		}
//		System.out.println();	
//	}
	
//	for(int i=1;i<=n;i++)
//	{
//		for(int j=1;j<=i;j++)
//		{
//			System.out.print("*");
//		}
//		System.out.println();
//	}
	
//	for(int i=1;i<=n;i++)
//	{
//		for(int j=1;j<=n-i;j++)
//		{
//			System.out.print(" ");
//
//		}
//		for(int k=1;k<=i;k++)
//		{
//			System.out.print("*");
//		}
//		System.out.println();
//	}
	
//	for(int i=1;i<=n;i++)
//	{
//		for(int j=1;j<=n-i;j++)
//		{
//			System.out.print(" ");
//
//		}
//		for(int k=1;k<=i;k++)
//		{
//			System.out.print("*"+" ");
//		}
//		System.out.println();
//	}
	
	
//	for(int i = n; i >= 1; i--) {
//	    
//	    for(int j = 1; j <= i; j++) {
//	        System.out.print("* ");
//	    }
//	    System.out.println();
//	}
//	
	
//	for(int i=1;i<=n;i++)
//	{
//		for(int j=1;j<=i;j++)
//		{
//			if((i+j)%2==0)
//			{
//				System.out.print("1"+" ");
//			}
//			else
//				System.out.print("0 ");
//		}
//		System.out.println();
//	}
	
//	for(int i=1;i<=n;i++)
//	{
//		//spaces
//		for(int j=1;j<=n-i;j++)
//		{
//			System.out.print(" ");
//		}
//		//stars
//		for(int k=1;k<=(2*i)-1;k++)
//		{
//			System.out.print("*");
//		}
//		System.out.println();
//	}
	
	
	
	
	//top half
//	for(int i=1;i<=n;i++)
//	{
//		//space
//		for(int j=1;j<=n-i;j++)
//		{
//			System.out.print(" ");
//		}
//		for(int k=1;k<=(2*i-1);k++)
//		{
//			System.out.print("*");
//		}
//		System.out.println();
//	}
//	//bottom half
//	for(int i=n-1;i>=1;i--)
//	{
//		//space
//		for(int j=1;j<=n-i;j++)
//		{
//			System.out.print(" ");
//		}
//		for(int k=1;k<=(2*i-1);k++)
//		{
//			System.out.print("*");
//		}
//		System.out.println();
//	}
	
	
	//top half
	for(int i=1;i<=n;i++)
	{
		//left wing
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		//space bn wings
		for(int j=1;j<=(2*(n-i));j++)
		{
			System.out.print(" ");
		}
		//right wing
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	//bottom half
	for(int i=n;i>=1;i--)
	{
		//left wing
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		//space bn wings
		for(int j=1;j<=(2*(n-i));j++)
		{
			System.out.print(" ");
		}
		//right wing
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
 }
}
