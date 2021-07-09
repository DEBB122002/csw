package array;

import java.util.*;

public class Advancingarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		System.out.println("enter");
		Scanner sc= new Scanner(System.in);
		String s=sc.next();
		Integer i=new Integer(s);
		//System.out.println(i);
		while(i!=0)
		{list.add(i%10);
		i/=10;
			
		}
		Collections.reverse(list);
	System.out.println(list);
	int j=0;
	int f=0;
	while (j<list.size())
	{
		if(f<j) {
			
			break;
			
		}else 
		{f=Math.max(f,j+list.get(j));}
		
	j++;
	
}

	System.out.println(f>=list.size());}	}
