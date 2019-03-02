import java.util.Scanner;

public class PrimeOrNot {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number : ");
	int n = sc.nextInt();
	int i;
	if(n==1)
	{
		System.out.println("prime number start from 2");
	}
	for(i=2;i<n;i++)
	{
		if(n%i==0)
		{
			System.out.println("it's not prime number");
			break;
		}
	}
	if(n==i)
	{
		System.out.println("it's a prime number");
	}
}
}
