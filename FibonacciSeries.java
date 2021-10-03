package week1.day1.Assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
	
		int range=8;
		int firstNum=0;
		int secondNum=1;
		int sum;
		
		System.out.println(firstNum);
		System.out.println(secondNum);
		
		for (int i=2; i<range;i++)
		{
			sum=firstNum+secondNum;
					
			firstNum=secondNum;
			
			secondNum=sum;
			
			System.out.println(sum);
		}
		
		

	}

}
