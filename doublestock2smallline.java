package array;

public class doublestock2smallline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,11,13,9,12,8,14,13,15};
		int buy1,buy2;
		buy1=Integer.MAX_VALUE;
		buy2=Integer.MAX_VALUE;
	int	profit =0;
		int toprofit=0;
		for(int i=0;i<arr.length;i++)
	{
			buy1=Math.min(buy1,arr[i]);
			profit=Math.max(profit,arr[i]-buy1);
			buy2=Math.min(buy2,arr[i]-profit);
			toprofit=Math.max(toprofit,arr[i]-buy2);
			
	}
		System.out.println(toprofit);}

}
