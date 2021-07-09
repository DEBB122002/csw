package array;
import java.util.*;
public class arrjump {
public static int jump(int A[],int b,int size){
	
	if(b>=size-1)
	{
	return 0;
	
	}
	int jumps=999999; 
	int step=A[b];

	while(step>0)
	{
		if(A[b]+b==0) {
			step--;
			
		}else
		{jumps=Math.min(jumps,jump(A,b+A[b],size));
		step--;

		}
	}
	return jumps+1;
	
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int b[]= {};
System.out.println(jump(b,0,7));



	}

}
