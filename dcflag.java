package array;

public class dcflag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,0,1,2,0,0,1,2};
		int pivot =0;
		int low=0;
		int high =arr.length-1;
		while (pivot<=high)
		{
		{if(arr[pivot]==0)
		{int temp=arr[pivot];
			arr[pivot]=arr[low];
			arr[low]=temp;
			pivot++;
			low++;}
			else if(arr[pivot]==1)	
		
			{pivot++;
			}
			else if(arr[pivot]==2)
			{int temp1=arr[pivot];
			arr[pivot]=arr[high];
			arr[high]=temp1;
			high--;}
		}

		}for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");}
	}

}
