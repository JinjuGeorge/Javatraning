package javatraining;
import java.util.Scanner;
public class Atm {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        boolean amt= true;
        int cpin = 1234;
       System.out.println("Enter the pin: ");
       int enteredPin = scanner.nextInt();
       if(enteredPin == cpin)
       {    	
    		System.out.println("Enter Withdrawal Amount:");
    		int number2 = scanner.nextInt(); 
   				if(amt == true )
    				{ 
   					int bala =200000;
   					int res;
   					System.out.println("available Balance is:"+(bala));  					
    					 res = 200000-number2;
    					 System.out.println("Remaining Balance:"+(res));
    				}   
         }
		else 
		{
          		System.out.println("Access Denied:");
    	}   
scanner.close(); 
}
}
	
