package recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LinearSearchFirstIndex {
	static int linear_search(int[] arr,int index,int key)
	{
		if(index==arr.length)
			return -1;
		if(arr[index]==key)
			return index;
		return linear_search(arr,index+1,key);
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
		int index=linear_search(arr,0,a);
		System.out.println(index);

	}

}
