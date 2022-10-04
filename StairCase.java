package recursion;

import java.util.Scanner;

public class StairCase {
	static int count(int n)
	{
		if(n<=2)
			return n;
		if(n==3)
			return 4;
		return count(n-1) + count(n-2) + count(n-3);
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println(count(n));
	
	sc.close();

	}

}