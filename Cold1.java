package cold;

import java.util.Scanner;

public class Cold1 {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int numCount = sc.nextInt();
		int count=0;
		for(int i=0; i<numCount;i++)
		{
			int num = sc.nextInt();
			if(num <0)
				count++;
		}
		sc.close();
		System.out.println(count);
	}
}