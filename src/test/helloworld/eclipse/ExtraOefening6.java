package test.helloworld.eclipse;

import java.util.Scanner;

public class ExtraOefening6 {

	//6. Write a program that prompts the user to enter five test scores between 1 and 10.
	//The program will then count the number of scores that are greater than 7.

	public static void main(String[] args) {

		int[] arraylist = new int[5];
		int counter = 0;
		
		for (int i=0; i<5; i++)
		{
			System.out.println("Vul de waarde voor X in.");
			Scanner s = new Scanner(System.in);
			int  x = Integer.valueOf(s.next());
			
			arraylist[i] = x;
			if (1<= arraylist[i] && arraylist[i] <=10)
			{
				if (arraylist[i] > 7)
				{
					++counter;
				}
			}
			else
			{
				System.out.println("Graag een getal tussen de 1 en 10 AUB" );
				i = i - 1;
			}
		}
		
		System.out.println("Het aantal wat een 7 of hoger hebben gehaald is: " + counter );

	}

}
