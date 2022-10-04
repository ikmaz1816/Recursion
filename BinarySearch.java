package recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BinarySearch {
	static int binary_search(int[] arr,int start,int end,int key)
	{
		if(start>end)
			return -1;
		
		int mid=start + (end-start)/2;
		
		if(arr[mid]==key)
			return mid;
		else if(arr[mid]>key)
			return binary_search(arr,start,mid-1,key);
		return binary_search(arr,mid+1,end,key);
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(br.readLine());
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
		}
		int a=Integer.parseInt(br.readLine());
		int index=binary_search(arr,0,arr.length-1,a);
		System.out.println(index);
	}

}
