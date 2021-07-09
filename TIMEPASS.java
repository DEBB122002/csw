package array;

public class TIMEPASS {
public static int sum(int n)
{
	if(n==1)
	{
		return 1; //1
		
	}
	else {
		int s=0;
		s=s+n+sum(n-1);//T(n)=T(n-1)+1
		
		return s;
	}


}
	public static void main(String[] args) {
		
		
		System.out.println(sum(6));
}
}