package Spavanac;
import java.util.Scanner;

public class Spavanac {
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minutes = sc.nextInt();
		if(minutes<45)
		{
			if(hour != 0)
				hour--;
			else
				hour = 23;
			minutes +=60-45;
		}
		else
			minutes -=45;
		sc.close();
		System.out.println(hour+ " " + minutes);
	}
}
