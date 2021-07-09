package array;

import java.util.ArrayList;

public class spiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[][]= { { 1, 2, 3, 4 },
               { 5, 6, 7, 8 },
               { 9, 10, 11, 12 },
               { 13, 14, 15, 16 } };


int top=0;
int bot=arr.length-1;
int left=0;
int right=arr[0].length-1;;
ArrayList<Integer> a1=new ArrayList<Integer>();
int k=0;
int counter =1;
while(counter!=4*4)
{
	

if(k%4==0)
{for(int i=left;i<=right;i++)
{System.out.print(arr[top][i]+" ");
	a1.add(arr[top][i]);
}
top++;

	
}
else if(k%4==1) {
	
	for(int i=top;i<=bot;i++)
	{a1.add(arr[i][right]);
		System.out.print(arr[i][right]+" ");
		
	}right--;
	
}
else if(k%4==2) {
	
	for(int i=right;i>=left;i--)
	{System.out.print(arr[bot][i]+" ");
	a1.add(arr[bot][i]);
	}bot--;
	
}
else if(k%4==3) {
	
	for(int i=bot;i>=top;i--)
	{System.out.print(arr[i][left]+" ");
	a1.add(arr[i][left]);
	}left++;
	
}
k++;
counter++;
}System.out.println();
	System.out.println(a1);}

}
