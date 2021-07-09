package array;

public class largestpalim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String k="kkkkkkakkkkkk pppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp ";
int start=0;
int end=0;
String h="";
String last="";
int length=0;
for(int i=0;i<k.length();i++)
	{  
         //input1.setLength(0);
	for(int f=i;f<k.length();f++)
	{String sub=k.substring(i,f+1);
	 StringBuilder input1 = new StringBuilder();
	input1.append(sub);
	input1.reverse();
		h=input1.toString();
		int l1=h.length();
		//System.out.println(l1);
		if(sub.equals(h)&&l1>length) {
			start=i;
			end=f;
			last=h;//System.out.println(start+" "+end);
			length=l1;
		}
		
	}
	}

	System.out.println(start+" "+end);}

}
