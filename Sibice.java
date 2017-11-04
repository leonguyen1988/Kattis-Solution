package Sibice;
import java.util.*;

public class Sibice {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int numMatches = sc.nextInt();
		int w = sc.nextInt();
		int h =sc.nextInt();
		double diagonalSquare= w*w + h*h;
		for(int k =0; k<numMatches;k++)
		{
			int length=sc.nextInt();
			int lengthSquare = length *length;
			if(diagonalSquare>=lengthSquare)
				System.out.println("DA");
			else
				System.out.println("NE");
		}
		sc.close();
		
	}
}
