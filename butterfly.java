package array;

public class butterfly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=4;

for(int i=0;i<n;i++)
{
	for(int j=1;j<=i+1;j++)
{System.out.print("*");
	}
for(int k=1;k<=2*(n-i-1);k++) {
	System.out.print(" ");
}
for(int j=1;j<=i+1;j++)
{System.out.print("*");
	}System.out.println();
}for(int i=n-1;i>=0;i--)
{
	for(int j=1;j<=i+1;j++)
{System.out.print("*");
	}
for(int k=1;k<=2*(n-i-1);k++) {
	System.out.print(" ");
}
for(int j=1;j<=i+1;j++)
{System.out.print("*");
	}System.out.println();
}

	}

}
