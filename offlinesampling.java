package array;
import java.util.*;

public class offlinesampling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer>a1=new ArrayList<Integer>();
a1.add(8);
a1.add(100);
a1.add(500);
a1.add(890);
a1.add(609);
a1.add(890);

int s1=3;
for(int i=0;i<s1;i++ )
{int a =(int)(((Math.random() * (s1- i+1)) + i));
System.out.println(a);
int temp=a1.get(i);
Collections.swap(a1,a,i);

}
for(int i=s1;i<a1.size();i++)
{a1.remove(i);}
a1.remove(a1.size()-1);
System.out.println(a1);
}

}
