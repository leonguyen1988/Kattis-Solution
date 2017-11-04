package ReversedBinaryNumber;
import java.util.*;

public class reversedBinary {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		sc.close();
		int decimal =0;
		while(num!=0)
		{
			decimal<<=1;
			decimal|=(num &1);
			num>>=1;
		}
		System.out.println(decimal);
	}
}
		