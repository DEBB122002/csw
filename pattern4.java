package array;

public class pattern4 {

	public static void main(String[] args) {
	
		int n=9;
		int f=1;
		for(int i=1;i<=n;i++)
		{for(int j=1;j<=2*(n-i);j++)
		{
			System.out.print(" ");
		}
			for(int k=1;k<=i;k++)
			{
				System.out.print
				(f +"  ");
				f++;
			}System.out.println();
		}System.out.println("*");
for(int i=2;i<=n;i++)
{System.out.print("*");
	
	if(i!=n)
{for(int j=1;j<=i;j++)
{System.out.print(" ");

}
System.out.print("*");
}
	else {
		for(i=1;i<=n;i++)
		{
			System.out.print("*");
		}
	}
	System.out.println();
}

}

}
	


