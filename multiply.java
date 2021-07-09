package array;

import java.util.ArrayList;

public class multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1=new ArrayList<Integer>();
		ArrayList<Integer> list2=new ArrayList<Integer>();
	
	list1.add(1);
	list1.add(1);
	list1.add(1);
	list2.add(-2);
	list2.add(2);
	list2.add(2);
	System.out.println(" "+list1);
    System.out.println("x"+list2);
    ArrayList<Integer> list3=new ArrayList<Integer>();
	
    for(int i=0;i<list1.size()+list2.size();i++)
	{
		list3.add(0);
		
	}
	for(int i=list1.size()-1;i>=0;i--)
	{for(int j=list2.size()-1;j>=0;j--)
		
{int product=Math.abs(list1.get(i)*list2.get(j));
int carry =product/10;		

list3.set(i+j+1,(list3.get(i+j+1))+(product%10));
list3.set(i+j,list3.get(i+j)+carry);

	}
		
	
	}
	int sign=((list1.get(0)<0)^(list2.get(0)<0))?-1:1;
//boolean f=true;
	

	//list3.set(0,list3.get(0)*sign);
	while(list3.get(0)==0)
	{
		list3.remove(0);
	}
	list3.set(0,list3.get(0)*sign);
	System.out.println(list3);
	for(int i=0;i<list3.size();i++)
	{
		System.out.print(list3.get(i));
	}
	}
	}
