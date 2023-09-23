package week1.day2;

import java.util.Scanner;

public class IsPrimeNumber {

	public static void main(String[] args) {
		
		//Enter the integer number greater than 1
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean flag = true;
		
		if(n<=1)
		{
			System.out.println("Entered number is one or less, please try again!");
			System.exit(0);
		}
		
		for(int i=2;i<n-1;i++)
		{
			if((n%i)==0)
			{
				flag=false;
				break;
			}	
		}
		
		if(flag)
		System.out.println(n+" is a prime number!!");
		else
			System.out.println(n+" is not a prime number!!");
		sc.close();

	}

}
