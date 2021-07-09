package array;

public class binaryadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="30";
String t="11";
Integer a1=new Integer(s);
Integer a2=new Integer(t);

String bs=Integer.toString(a1,2);
String bt=Integer.toString(a2,2);
System.out.println(" "+bs);
System.out.println("+"+bt);
if(bs.length()<bt.length())
{String temp=bs;
bs=bt;
bt=temp;
	}
String f="";


int o=bs.length()-1;
int h=bt.length()-1;



int carry=0;
while(o>=0) 
	
{if(o>=0&&h>=0)
	{if(carry==0)
{if(bs.charAt(o)=='1'&&bt.charAt(h)=='1')
{   f="0"+f;
	carry=1;
	
}
else if(bs.charAt(o)=='0'&&bt.charAt(h)=='0')
{      f="0"+f;
       carry=0;
}
else {
	   f="1"+f;
	   carry=0;
}
//o--;
}else if(carry==1)
{if(bs.charAt(o)=='1'&&bt.charAt(h)=='1')
{f="1"+f;
carry=1;
}
else if(bs.charAt(o)=='0'&&bt.charAt(h)=='0')
{     f="1"+f;
      carry=0;
} else {
      f="0"+f;
      carry=1;
}
}}
else
{
	if(carry==1)
{
		if(bs.charAt(o)=='1')
		{f="0"+f;
		carry=1;
			
		}	else if(bs.charAt(h)=='0')
		{f="1"+f;
		carry=0;}}
else if(carry==0){
	
	
	if(bs.charAt(h)=='1')
	{f="1"+f;
	carry=0;
		
	}	else if(bs.charAt(h)=='0')
	{f="0"+f;
	carry=0;}

}
}
o--;
h--;
}	

	
if(carry==1)
{
	f="1"+f;}


System.out.println("---------");
System.out.println(" "+f);
}}
