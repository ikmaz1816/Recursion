package recursion;

import java.util.Scanner;

public class Multiplication {

	static int power(int n,int m)
	{
		if(m==0)
			return 0;
		return n +  power(n,m-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		System.out.println(power(n,m));
		sc.close();

	}

}
