package recursion;

import java.util.Scanner;

public class CountZeroes {
	static int count(int n,int c)
	{
		if(n%10==n)
		{
			if(n==0)
				c+=1;
			return c;
		}
		if(n%10==0)
			return count(n/10,c+1);
		return count(n/10,c);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(count(n,0));
		
		sc.close();
	}

}
