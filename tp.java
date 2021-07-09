package array;

import java.util.*;

public class tp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<Integer> a=new ArrayList<Integer>();
	;
	a.add(2);
	a.add(2);
	a.add(3);
	a.add(4);
	int k=1;
	for(int i=1;i<a.size();++i)
	{if(!a.get(k-1).equals(a.get(i)))
	{a.set(k++,a.get(i));
		
	}
		
	}
	System.out.println(a);}
}
