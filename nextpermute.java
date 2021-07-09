package array;

import java.util.*;

public class nextpermute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int p[]= {2,0,1};
int f=-1;
//	int small=-1;
	int small2=-1;
	int smin=3;
	for(int i=p.length-2;i>=0;i--)
	{if(p[i]>p[i+1])
	{f=i;break;
}}//System.out.println(f);
	for(int i=f+1;i<p.length;i++)	
	{
		if(p[i]<p[f]&&p[i]>small2)
		{small2=p[i];
		smin=i;
	//	System.out.println("f");		
		break;
			
		
		}
		
	
	}
if(f!=-1)
	{int temp=p[smin];
	p[smin]=p[f];
	p[f]=temp;
	int j;}
reverse(p,f+1);
for(int i=0;i<p.length;i++)
{
	System.out.println(p[i]);}
	}

    private static void reverse(int[]a, int start) {
        int i = start, j = a.length - 1;
        while (i < j) {
          int temp=a[i];
          a[i]=a[j];
          a[j]=temp;
            i++;
            j--;
        }
}}
