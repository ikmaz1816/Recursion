package recursion;

import java.util.Scanner;

public class CheckPalindrome {
	static int rev(int n,int digit)
	{
		if(n%10==n)
			return n;
		return n%10 * (int)Math.pow(10,digit-1) + rev(n/10,digit-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int digit=(int)Math.log10(n) + 1;
		if(rev(n,digit)==n)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		sc.close();
	}

}
