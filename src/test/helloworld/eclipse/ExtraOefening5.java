package test.helloworld.eclipse;

import java.util.Scanner;

public class ExtraOefening5 {

	//5. Express each of the following statements using an if block:
	//a. If x divided by y is 5, then set x to 100.
	//b. If x times y is 5, then set x to 1. 
	//c. If x is less than y, then double the value of x.
	//d. If x is greater than y, then increment the value of x by 1. 
	
	public static void main(String[] args) {
		System.out.println("Vul de waarde voor X in.");
		Scanner s = new Scanner(System.in);
		int  x = Integer.valueOf(s.next());
		
		System.out.println("Vul de waarde voor Y in.");
		Scanner r = new Scanner(System.in);
		int y = Integer.valueOf(r.next());
		
		if (x/5 == 5)
		{
			x = 100;
			System.out.println("De nieuwe waarde van X = " + x );
		}
		
		else if (x*y == 5)
		{
			x = 1;
			System.out.println("De nieuwe waarde van X = " + x );
		}
		else if (x <= y)
		{
			x = x * 2;
			System.out.println("De nieuwe waarde van X = " + x );
		}
		else if (x >= y)
		{
			x = x + 1;
			System.out.println("De nieuwe waarde van X = " + x );
		}

	}

}
