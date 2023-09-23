package week1.day2;

public class FindOddNumbers {

	public static void main(String[] args) {
		int maxRange=10;
		System.out.println("From 1 to 10 integers, odd numbers are: ");
		for (int i=1;i<=maxRange;i++)
		{
			if((i%2)==1)
			System.out.println(i);
		}
		
	}

}
