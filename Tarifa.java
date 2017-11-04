package Tarifa;
import java.util.Scanner;

public class Tarifa {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int numLimitPerMonth = sc.nextInt();
		int numMonth = sc.nextInt();
		int store=0;
		for(int i =0;i<numMonth;i++)
		{
			int usingPerMonth = sc.nextInt();
			store += numLimitPerMonth - usingPerMonth;
		
		//System.out.println(store);
		}
		System.out.println(store+numLimitPerMonth);
		sc.close();
	}

}
