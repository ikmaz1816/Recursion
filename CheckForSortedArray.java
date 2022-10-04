package recursion;

import java.util.Scanner;

public class CheckForSortedArray {
	static boolean checkSorted(int[] arr,int index)
	{
		if(index==arr.length-1)
			return true;
		return arr[index]<arr[index+1] && checkSorted(arr,index+1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		if(checkSorted(arr,0))
			System.out.println("Sorted");
		else 
			System.out.println("Not Sorted");
		sc.close();

	}

}
