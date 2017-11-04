package pot;
import java.util.Scanner;

public class faktor {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int numArti = sc.nextInt();
		int numFactor = sc.nextInt();
		sc.close();
		int result = (numArti * (numFactor-1)) + 1;
		System.out.println(result);
	}
}