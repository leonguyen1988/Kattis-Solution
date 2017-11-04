package Trik;
import java.util.Scanner;

public class Trik {
	public static void main(String [] args)
	{
	  Scanner  sc = new Scanner(System.in);
	  String sequence = sc.next();
	  boolean leftcup = true;
	  boolean midlecup = false;
	  boolean rightcup = false;
	  boolean temp=false;
	  sc.close();
	 for(int i =0; i<sequence.length();i++)
	 {
		 switch(sequence.charAt(i))
		 {
		    case 'A':
		    	temp= midlecup;
		    	midlecup=leftcup;
		    	leftcup=temp;
		    	break;
		    case 'B':
		    	temp = rightcup;
		    	rightcup = midlecup;
		    	midlecup = temp;
		    	break;
		    case 'C':
		    	temp = leftcup;
		    	leftcup = rightcup;
		    	rightcup = temp;
		    	break;  	
		 }
	 }
	 if(leftcup)
	  System.out.println(1);
	 else if(midlecup)
		 System.out.println(2);
	 else
		 System.out.println(3);  
	}
}
