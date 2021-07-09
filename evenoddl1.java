package array;

public class evenoddl1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int c[]= {201,1,2,3,4,3};
int count=-1;
for (int i=0;i<6;i++)
{if(c[i]%2==0)
	
{count++;
int temp=c[i];

c[i]=c[count];
c[count]=temp;


	
}
}

for(int i=0;i<6;i++)
{System.out.print(c[i]+" ");
	
}
	System.out.println(9%10);}

}
