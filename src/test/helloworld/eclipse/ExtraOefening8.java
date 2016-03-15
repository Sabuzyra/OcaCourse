package test.helloworld.eclipse;

import java.util.Scanner;

public class ExtraOefening8 {

	//8. Write a program that asks the user to enter three numbers. The pro- gram will
	//then determine and print the largest of the three numbers.
	
	public static void main(String[] args)
	{
		int[] arraylist = new int[3];
		int max = arraylist[0];
		
		for (int i=0; i<3; i++)
		{
			System.out.println("Vul een getal in.");
			Scanner s = new Scanner(System.in);
			int  x = Integer.valueOf(s.next());
			
			arraylist[i] = x;
			for (int j = 1; j < arraylist.length; j++) {
			    if (arraylist[i] > max ) {
			      max = arraylist[i];
			    }
			}

		}
		
		System.out.println("Hoogste getal is: " + max);
	}
}
