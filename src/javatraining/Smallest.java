package javatraining;

public class Smallest {
	public static void main(String[] args)
	{
int[] arrnumbers= {55,65,79,2250,25,38,101,369,369};

int firstSmallest=Integer.MAX_VALUE;
int secondSmallest=Integer.MAX_VALUE;
for(int number : arrnumbers)
  {
	if(number < firstSmallest) 
	{
		
		secondSmallest=firstSmallest;
		firstSmallest=number;
	
	}
	else if(number<secondSmallest&&number>firstSmallest)
	{
		
		secondSmallest=number;
	}
  }
	System.out.println("firstSmallest"+firstSmallest);
	System.out.println("secondSmallest"+secondSmallest);
  }


	}
	
