package array;

public class primeno {
public static boolean prime(int a)
{if (a==1)
{
	return false;
	
}if(a==2)
{return true;}
	for(int i= 2;i<=a/2;i++)
	{if(a%i==0)
	{
		return false;
		
	}
		
		
	}
	return true;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=100;
		
	for(int i=1; i<=a;i++)
	{if(prime(i))
	{System.out.print(i+" ");
		
	}
		
	}
	}

}
