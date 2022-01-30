import java.util.Scanner
public class EvenOdd {

	public static void main(String[] args) {
		//Write a java program to check whether a given number is Odd or Even
		
		Scanner scan = new Scanner(System.in)
		
		System.out.println("Enter Number");
		int no= scan.nextInt();
		
		if(no%2==0)
		{
			System.out.println("Number is Even Number");
		}
		else
		{
			System.out.println("Number is Odd Number");
		}
		
		
	}

}

