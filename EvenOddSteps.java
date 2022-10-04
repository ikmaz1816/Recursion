package recursion;

import java.util.Scanner;

public class EvenOddSteps {
	static int countSteps(int n,int c)
	{
		if(n==0)
			return c;
		if(n%2==0)
			return countSteps(n/2,c+1);
		return countSteps(n-1,c+1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(countSteps(n,0));
		sc.close();
		}

}
