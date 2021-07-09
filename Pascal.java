package array;
import java .util.*;
public class Pascal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k;
		while(true)
		{System.out.println("enter row");
		Scanner sc= new Scanner(System.in);
		
		 k= sc.nextInt();
		 if(k>0)
		 {
			 break;
		 }
		}
int arr[][]=new int[k][k];

 for(int i=0;i<k;i++)
 {
	 for(int j=0;j<=i;j++)
 {if(j==0||j==i)
 {arr[i][j]=1;
	 
 }
 else {
	 arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
	 
 }} }
	
	
int f=k-1;
	for(int i=0;i<k;i++)
		
	{for(int p=0;p<f;p++)
		{System.out.print(" ");}
        f--	;
		for(int j=0;j<=i;j++)
	{System.out.print(arr[i][j]+" ");
		
	}System.out.println();
	}	

}}
