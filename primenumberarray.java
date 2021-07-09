package array;

import java.util.ArrayList;

public class primenumberarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=100;
		boolean arr[]=new boolean[a+1];
		arr[0]=false;
		arr[1]=false;
		for(int i=2;i<=a;i++)
		{arr[i]=true;
			
		}ArrayList<Integer>array2= new ArrayList<Integer>();
		for(int i=2;i<=a;i++)
		{if(arr[i]==true) {
			array2.add(i);
			
		}
			for(int j=2;j*i<=a;j++)
			{arr[i*j]=false;
				
			}
			
		}
		System.out.println(array2);
		}

}
