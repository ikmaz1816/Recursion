package recursion;

public class ArraySubset {
	public static void print(int[] arr,int index,String p)
	{
		if(index==arr.length)
		{
			System.out.println(p);
			return;
		}
		print(arr,index+1,p+arr[index]);
		print(arr,index+1,p);
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3};
		print(arr,0,"");
	}

}
