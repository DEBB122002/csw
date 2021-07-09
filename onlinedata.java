package array;

import java.util.ArrayList;
import java.util.*;

public class onlinedata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>a1=new ArrayList<Integer>();
		a1.add(2);
		a1.add(4);
		a1.add(6);
		a1.add(7);
		a1.add(11);
		a1.add(12);
		Iterator<Integer> it = a1.iterator();
		int i=0;
		int s1=2; 
		while(it.hasNext())
		{int f=it.next();
			int a =(int)(((Math.random() * (s1- i+1)) + i));
			//System.out.println();
		if(a<=s1)
		{//System.out.println(a);
		
		Collections.swap(a1,a,i);}
         i++;

		}
		
	
	for(int j=0;j<s1;j++)
		{
		System.out.println(a1.get(j));
		
		}}}


