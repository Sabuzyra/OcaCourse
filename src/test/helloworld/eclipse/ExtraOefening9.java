package test.helloworld.eclipse;

import java.util.Scanner;

public class ExtraOefening9 {

	//9. Create an input validation loop that only accepts numbers in the range of 1
	//through 10. 
	public static void main(String[] args)
	{
		boolean forever = true;
		
		while(forever)
		{
			System.out.println("Vul een getal in.");
			Scanner s = new Scanner(System.in);
			int  x = Integer.valueOf(s.next());
			if(1 <=x && x <=10)
			{
				System.out.println("Prachtig, getal is tussen de 1 en 10.");
			}
			else
			{
				System.out.println("Niet prachtig. Het is geen getal tussen 1 en 10.");
			}
		}

	}

}
