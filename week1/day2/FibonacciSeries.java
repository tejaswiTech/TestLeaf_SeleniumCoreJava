package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		
	  int firstNum=0,secondNum=1, range=8;
	  
	  System.out.println("Fibonacci Series for the range of 8 as:");
		for (int i=0;i<=range-1;i++)	
		{
			System.out.print(firstNum+",");
			int nextNum;
			//logic
			nextNum=firstNum+secondNum;
			firstNum=secondNum;
			secondNum=nextNum;		
		}
	}
}
