package array;

import java.util.ArrayList;

public class dstock2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int arr[]= {12,11,13,9,12,8,14,13,15};
		int min=arr[0];
		int maxpro=0;
		int sell=0;
		int buy=0;
		int indexs=0;
		int indexbuy=0;
		int k=0;
		
		for(int i=0;i<arr.length;i++)
		{if(arr[i]<min)
		{min=arr[i];
k=i;}
		if(arr[i]-min>maxpro)
		{maxpro=arr[i]-min;
		sell=arr[i];
		buy=min;
	indexs=i;
	indexbuy=k;}
		} 
		int maxpro2=0;
		int sell2=0;
		int  buy2=0;
		if(indexs==arr.length-1)
		{//System.out.println(indexs);
			int min2=arr[0];
			int indexs2=0;
			int indexbuy2=0;
			int k2=0;
			for(int i=0;i<indexbuy;i++)
			{if(arr[i]<min2)
			{min2=arr[i];
			k2=i;
				}
			if(arr[i]-min2>maxpro2)
			{maxpro2=arr[i]-min2;
			sell2=arr[i];
			buy2=min2;
		indexs2=i;
		indexbuy2=k;}
			}	
		}
			
		else {int min2=arr[0];
	
		int indexs2=0;
		int indexbuy2=0;
		int k2=0;
		for(int i=0;i<indexbuy;i++)
		{if(arr[i]<min2)
		{min2=arr[i];
k2=i;
			
		}
		if(arr[i]-min2>maxpro2)
		{maxpro2=arr[i]-min2;
		sell2=arr[i];
		buy2=min2;
	indexs2=i;
	indexbuy2=k;}
		}	
		for(int i=indexs+1;i<arr.length;i++)
		{if(arr[i]<min2)
		{min2=arr[i];
k2=i;
			
		}
		if(arr[i]-min2>maxpro2)
		{maxpro2=arr[i]-min2;
		sell2=arr[i];
		buy2=min2;
	indexs2=i;
	indexbuy2=k;}
		
		}
		
		}		
			//System.out.println(maxpro2);
		System.out.println(sell)
		;
		System.out.println(buy);
		System.out.println(sell2);
		System.out.println(buy2);
		
			System.out.println(maxpro+maxpro2);
			
		}
	
	
	}


