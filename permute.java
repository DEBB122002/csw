package array;

import java.util.Arrays;

public class permute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char arr[]= {'a','b','c','d'};
int[]p= {2,0,1,3};
char arr2[]=new char[p.length];
for(int i=0;i<4;i++)
{arr2[p[i]]=arr[i];
	


}
for(int i=0;i<4;i++)
{
	System.out.print(arr2[i]+" ");}	}

}
