package array;
import java.util.*;


public class arrayincr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();

list.add(9);
list.add(8);
list.add(9);
	
for(int i=list.size()-1;i>=0;i--)
{if(list.get(i)==9)
{list.set(i,0);
	if(i==0)
		{
		list.add(1);
		Collections.reverse(list);
		}}
else {
	list.set(i,list.get(i)+1);
	break;
	}
}
System.out.println(list);

}
	
	}

