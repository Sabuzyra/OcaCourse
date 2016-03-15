package test.helloworld.eclipse;

import java.util.Scanner;

public class ExtraOefening7 {
	
	//7. Express each of the following statements using an if/else block:
		//a. If x times y is 8, then set x to 1; otherwise, set x to 2. 
		//b. If x is less than y, then double the value of x; otherwise, increment x by 1. 
		//c. If x is greater than y, then increment both by 1; otherwise, decrement
		//both by 1.

	public static void main(String[] args)
	
	{
		System.out.println("Vul de waarde voor X in.");
		Scanner s = new Scanner(System.in);
		int  x = Integer.valueOf(s.next());
		
		System.out.println("Vul de waarde voor Y in.");
		Scanner r = new Scanner(System.in);
		int y = Integer.valueOf(r.next());
		
		if (x*y == 8)
		{
			x = 1;
			System.out.println("A: De nieuwe waarde van X = " + x );
		}
		
		else
		{
			x = 2;
			System.out.println("A: De nieuwe waarde van X = " + x );
		}
		
		if (x <= y)
		{
			x = x * 2;
			System.out.println("B: De nieuwe waarde van X = " + x );
		}
		else
		{
			x = x + 1;
			System.out.println("B: De nieuwe waarde van X = " + x );
		}
		if (x >= y)
		{
			x = x + 1;
			y = y + 1;
			System.out.println("C: De nieuwe waarde van X = " + x + " en van Y is " + y );
		}
		else
		{
			x = x - 1;
			y = y - 1;
			System.out.println("De nieuwe waarde van X = " + x + " en van Y is " + y );
		}
		
		

	}

}
