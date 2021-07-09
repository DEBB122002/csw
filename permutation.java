package array;

import java.util.*;
public class permutation {
public static void permutation2(ArrayList<String> l1,int l ,int r)
{if(l==r)
{System.out.println(l1);

return;	}

for(int i=l;i<=r;i++) {
	swap(l1,l,i);
	permutation2(l1,l+1,r);
    swap(l1,l,i);
}
	}

static void swap(ArrayList<String> l1, int a,int b)
{String temp=l1.get(a);
l1.set(a,l1.get(b));
l1.set(b,temp);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>l1=new ArrayList<String>();
l1.add("0");
l1.add("1");
l1.add("2");
//l1.add("d");
permutation2(l1,0,l1.size()-1);
	}

}
