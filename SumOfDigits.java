package recursion;

import java.util.Scanner;

public class SumOfDigits {
	static int sum(int n)
	{
		if(n%10==n)
			return n;
		return n%10 + sum(n/10);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(sum(n));
		sc.close();
	}

}
