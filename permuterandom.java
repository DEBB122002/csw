package array;

import java.util.ArrayList;
import java.util.Collections;

public class permuterandom {public static void per(ArrayList<Integer>a1,int size)
	{
	
	

	int s1=size;
	for(int i=0;i<s1;i++ )
	{int a =(int)(((Math.random() * (s1- i+1)) + i));
	//System.out.println(a);
	int temp=a1.get(i);
	Collections.swap(a1,a,i);

	}
		
	}public static void main(String[] args)
{
		

ArrayList<Integer>a1=new ArrayList<Integer>();
a1.add(0);
a1.add(1);
a1.add(2);
a1.add(3);
a1.add(4);
int size=a1.size()-1;
per(a1,size);
System.out.println(a1);
System.out.println("DEB"+8);

}}
