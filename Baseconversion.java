package array;
import java.util.*;
public class Baseconversion {
public static int decimal(String s1,int a)
{int s=s1.length();
int mul=1;
int last=0;
for(int i=s-1;i>=0;i--)
{char c=s1.charAt(i);
int sum;
if(c>='0'&&c<='9') {
	sum=(int)(c-'0');
}else
{sum=(int)(c-'A'+10);
	}

//System.out.println(sum);
last=last+(sum*mul);
mul=mul*a;

}


return last;

}

public static String other(int dec,int b)
{int mul=1;
int sum=0;
String s="";
	while(dec!=0)
	{mul=dec%b;
	if(mul<=9)
	{dec=dec/b;
	s=mul+s;
	}
	else {char c=(char)('A'+mul-10);dec/=b;
	s=c+s;}
	}if(dec%b!=0)
	{s=s+(dec%b);
		
	}return s;
}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		String num=sc.next();
		System.out.println("Enter the current base");
		int current=sc.nextInt();
		System.out.println("Enter the base to be converted");

		int next=sc.nextInt();
		
int dec =decimal(num,current);

System.out.println(other(dec,next));
	}

}
