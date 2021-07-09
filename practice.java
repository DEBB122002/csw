package array;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.PriorityQueue;
 
class practice {
  public static void main(String [] a)
  {ArrayList<Integer>a1= new ArrayList<Integer>();
  a1.add(10);
  a1.add(9);
  a1.add(8);
  a1.add(7);
  a1.add(70);
  a1.add(60);
  PriorityQueue <Integer> q1= new PriorityQueue<>();
 // Iterator<Integer>it1=a1.iterator();
  int k=3;//for this example	  
  for(int i=0;i<=k;i++)
  {q1.add(a1.get(i));
	  
	  
  }
 for(int i=k+1;i<a1.size();i++)
 {q1.add(a1.get(i));

 System.out.println(q1.remove());
	 
 }
while(!q1.isEmpty()) {
	System.out.println(q1.remove());
}
}
}