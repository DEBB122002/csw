package array;

public class stock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {310,315,275,295,260,270,290,230,255,250};
int min=arr[0];
int maxpro=-1;
int sell=0;
int buy=0;
for(int i=0;i<arr.length;i++)
{if(arr[i]<min)
{min=arr[i];

	
}
if(arr[i]-min>maxpro)
{maxpro=arr[i]-min;
sell=arr[i];
buy=min;
	}
}



System.out.println(maxpro);
System.out.println(sell);
System.out.println(buy);
}

	}

