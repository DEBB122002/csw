package array;

import java.util.ArrayList;

public class doublestock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,11,13,9,12,8,14,13,15};
		int min=arr[0];
		int maxpro=0;
		int sell=0;
		int buy=0;
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{if(arr[i]<min)
		{min=arr[i];

			
		}
		if(arr[i]-min>maxpro)
		{maxpro=arr[i]-min;
		sell=arr[i];
		buy=min;
			}
		list.add(maxpro);}
		

System.out.println(list);
int max=0;
int mxpro2=0;
for(int i=arr.length-1;i>0;i-- )
{//list.add
	if(arr[i]>max)
	{
		max=arr[i];
		
	}
	if(mxpro2<max-arr[i]+list.get(i-1))
	{mxpro2=max-arr[i]+list.get(i-1);
		
	}

}
System.out.println(mxpro2);	}

}
