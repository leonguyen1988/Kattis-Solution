package Bijele;
import java.util.Scanner;

public class Bijele {
	public static void main(String [] args)
	{
	  int[] numIn= new int[6];
	  Scanner sc = new Scanner(System.in);
	  for(int i =0; i<6;i++)
	  {
		  numIn[i] = sc.nextInt();
		  switch (i)
		  {
		  	case 0:
		  	case 1:
		  			numIn[i] = 1-numIn[i];
		  		break;
		  	case 2:
		  	case 3:
		  	case 4:
		  			numIn[i]= 2-numIn[i];
		  			break;
		  	case 5:
		  		numIn[i] = 8-numIn[i];
		  		break;
		  	default:
		  		break;
		  }			  
	  }
	  for(int k =0; k<6;k++)
	  {
		  System.out.print(numIn[k]+" ");
	  }
	  sc.close();
	}
}
