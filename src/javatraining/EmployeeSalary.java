package javatraining;
import java.util.Scanner;
public class EmployeeSalary {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);				
		System.out.println("Enter Employee Salary");
	    int empsal = scanner.nextInt(); 
		System.out.println("Enter Performance Rating(1 - 5)");
		int rate = scanner.nextInt(); 
		System.out.println("Enter Year of Service:");
		int yer = scanner.nextInt(); 
		if(empsal <=0)
		{System.out.println("Invalid Salary");
		}
		else if(yer<=0)
		{System.out.println("Invalid year of Service:");
		}
		else if(rate <1 || rate>5)
		{System.out.println("Invalid rating");
		}
		else
		{
			System.out.println("Output");	
			if(rate == 5)
		{
			System.out.println("performanceBonus:"+20+"%");	
		}
		else if(rate == 4)
		{
			System.out.println("performanceBonus:"+15+"%");
		}
		else if(rate == 3)
		{
			System.out.println("performanceBonus:"+10+"%");
		}		
		else 
		{
			System.out.println("No Bonus");
		}	
			int performanceBonus1 = 0;
			if(performanceBonus1 >= 0)
			{
				if(yer >= 5)
				{
				System.out.println("serviceBonus:"+5+"%");
				double bonusAmount = (20*empsal/100);
				System.out.println("Bonus Amount:"+bonusAmount);
				double finalSalary1 = empsal + bonusAmount;	
				System.out.println("finalSalary:"+finalSalary1);
				}
				else
			    {
				System.out.println("serviceBonus:"+0+"%");
			    }
			}
	}
		scanner.close();
}}

	
		
		
		        
		      
		        
		
		
	

