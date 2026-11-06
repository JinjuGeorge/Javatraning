package javatraining;
import java.util.Scanner;
public class Salary {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);{
	System.out.println("Enter the Environment:DEV/QA/STAGE");
	char c = scanner.next().charAt(0);
	if(c=='D' || c=='Q' || c=='S' )
	{
	System.out.println("1.chrome ");
	System.out.println("2.Firefox ");
	System.out.println("3.Edge");
	System.out.println("Enter Browser CHoice:");
	int br = scanner.nextInt();
	
	System.out.println(" suite choice ");
	System.out.println("1.Smoke ");
	System.out.println("2.Regression ");
	System.out.println("3.Sanity");
	System.out.println("Enter test suite choice ");
	int choice1 = scanner.nextInt();
	System.out.println("Execution Summary");
	System.out.println("Environment"+(c));	
	System.out.println("Browser:"+(br));
	
	  if(choice1 == 1)
	     {
		System.out.println("Smoke:"+20+"test");	   	
	     }
	     else if(choice1 == 2)
	      {
		System.out.println("Regression:"+100+"test");
	      }
	     else
	     {
		System.out.println("Sanity:"+30+"test");
	      }
	}
	else
	{
		System.out.println("Rejected");
	}
	scanner.close();
	}
	}
}

