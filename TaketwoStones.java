package Stones;
import java.util.Scanner;

public class TaketwoStones {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int numStones = sc.nextInt();
		sc.close();
		if(numStones%2 == 0)
			System.out.println("Bob");
		else if(numStones%2==1)
			System.out.println("Alice");
	}
}
