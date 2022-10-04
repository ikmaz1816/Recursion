package recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LinearSearchMultipleOccurences {

	static ArrayList<Integer> linear_search(int[] arr,int index,int key)
	{
		ArrayList<Integer> arr1=new ArrayList<>();
		if(index==-1)
		{
			return arr1;
		}
		
		if(arr[index]==key)
		{
			arr1.add(index);
		}
		
		arr1.addAll(linear_search(arr,index-1,key));
		return arr1;
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
		ArrayList<Integer> ar=linear_search(arr,arr.length-1,a);
		System.out.println(ar);

		}
}
