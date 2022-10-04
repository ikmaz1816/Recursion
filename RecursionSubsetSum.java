package recursion;

import java.util.Scanner;

public class RecursionSubsetSum {
	public static void print(int[] arr,String p,int sum,int index)
	{
		if(index==arr.length)
		{
			if(sum==0)
				System.out.println(p);
			return;
		}
		print(arr,p+arr[index],sum-arr[index],index+1);
		print(arr,p,sum,index+1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		print(arr,"",k,0);
		sc.close();
	}

}
