package array;

import java.util.ArrayList;

public class nonuniform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer>a1=new ArrayList<Integer>();
a1.add(0);
a1.add(1);
a1.add(2);
a1.add(3);
a1.add(4);
ArrayList<Double>a2=new ArrayList<Double>();	
a2.add(0.2);
a2.add(0.2);
a2.add(0.2);
a2.add(0.2);
a2.add(0.2);
double f=0;

double r=Math.random();
//System.out.println(r);
if(r>=a2.get(0))
{
	f=a1.get(0);}
 double k1=0;
double j=a2.get(0);
// System.out.println(k1);
	for(int i=1;i<a1.size();i++)
	{k1=j+a2.get(i);
		if(r>=j&&r<k1)
		{//System.out.println("hi");
		f=a1.get(i);
			//System.out.println("hii"+k1);
			break;
		}
		j=k1;
	}
	System.out.println(f);
}}
