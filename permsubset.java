package array;

import java.util.*;

public class permsubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hashtable<Integer,Integer>h1= new Hashtable<Integer,Integer>();
	int k=4;
	for(int i=0;i<k;i++) {
		int ran=(int)(((Math.random() * ((k-1 )- i+1)) + i));
		Integer p1=h1.get(ran);
		Integer p2=h1.get(i);
		if(p1==null&&p2==null) {
			h1.put(ran,i);
			h1.put(i,ran);
			
		}
		else if(p1!=null&&p2==null) {
			h1.put(i,p1);
			h1.put(ran,i);
			
		} else if(p1==null&&p2!=null) {
			h1.put(ran,p2);
			h1.put(i,ran);
			
		}
		else if(p1!=null&&p2!=null){
			h1.put(i,p1);
			h1.put(ran,p2);
		}
	}
	//System.out.println(h1);
	for(int i=0;i<k;i++) {
		System.out.println(h1.get(i));
		
	}
	}

}
