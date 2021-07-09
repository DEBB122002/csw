package array;

public class evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {4,7,8,
		3,2,1,6,8
		};
int even=0;
for(int i=0;i<=arr.length/2;i++)
{for(int j=arr.length/2;j<arr.length;j++)
{if(arr[i]%2!=0&&arr[j]%2==0)
{int  a=arr[i];
arr[i]=arr[j];
arr[j]=a;
	
}//else if(arr[j]%2==0)
}

}

for(int i=arr.length/2;i<arr.length;i++)
{for(int j=0;j<=arr.length/2;j++)
{if(arr[i]%2==0&&arr[j]%2!=0)
{int  a=arr[i];
arr[i]=arr[j];
arr[j]=a;
	
}//else if(arr[j]%2==0)
}

}
for(int i=0;i<arr.length;i++)
{System.out.println(arr[i]);}	}
}