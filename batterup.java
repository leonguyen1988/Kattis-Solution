package Batterup;
import java.util.*;

public class batterup {
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		int numCount = sc.nextInt();
		int count =0;
		double total=0;
		for(int i = 0; i<numCount;i++)
		{
			int numBat = sc.nextInt();
			if(numBat>=0)
			{
				total +=numBat;
				count++;
			}
		}
		sc.close();
		System.out.println(total/count);
	}
}
