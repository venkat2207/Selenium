package week1.day1.Assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int number=13;
		
		boolean flag=false;
				
		for(int i=2;i<=number/2 ;i++)
		{
			
			if ((number%i)==0)
			{
				flag=true;
				break;
					
			
		     }
		
		}
		if (flag==false)
		{
			System.out.println( number +" is a prime number");
		}
		
		else
		{
			System.out.println(number + " is not a prime number");
			
		}

	}

}
