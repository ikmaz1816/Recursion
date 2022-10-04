package recursion;

import java.util.Scanner;

public class GeometricSum {
	static double sum(int n)
	{
		if(n==0)
			return 1/Math.pow(2, n);
		return 1/Math.pow(2, n) + sum(n-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(sum(n));
		sc.close();
	}

}
