package array;

import java.util.*;

public class permute2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>l1= new ArrayList<String>();
l1.add("p");
l1.add("x");
l1.add("y");
l1.add("z");
l1.add("q");
ArrayList<Integer>l2= new ArrayList<Integer>();
l2.add(2);
l2.add(1);
l2.add(0);
l2.add(4);
l2.add(3);
System.out.println(l1);
System.out.println(l2);
for(int i=0;i<l1.size();i++)
{
	int  next=i;
	while(l2.get(next)>=0)
		
	{System.out.println("i"+i);
	System.out.println(next);
		Collections.swap(l1,i,l2.get(next));
	int t=l2.get(next);
	l2.set(next,l2.get(next)-l2.size());
		next=t;
	System.out.println("next "+next);
	System.out.println("t "+t);System.out.println(l1);
	System.out.println(l2);	
		System.out.println("-----------");
	}


}
System.out.println(l1);	
System.out.println(l2);
	}

}
