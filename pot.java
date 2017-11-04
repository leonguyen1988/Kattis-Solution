package pot;
import java.util.Scanner;

//Solution for Pot problem on Kattis.com
public class pot {
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int counter = sc.nextInt();
	  int numPower =0;
	  int num=0;
	  int FinalResult =0;
	  for(int k = 0; k <counter ;k++)
	  {
		  int num1 = sc.nextInt();
		  int resultNum =1;
		  numPower = num1%10;
		  num = num1/10;
		  for(int j=0;j<numPower;j++)
		  {
			  resultNum *=num;
		  }
		  FinalResult +=resultNum;
	  }
	  System.out.println(FinalResult);
	  sc.close();
  }

}
