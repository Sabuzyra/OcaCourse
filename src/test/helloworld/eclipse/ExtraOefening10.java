package test.helloworld.eclipse;

import java.util.Scanner;

public class ExtraOefening10 {

	//10. Write a script that asks the user, “Are you sure you want to quit [Y, N]?” The
		//	script then checks the user’s input and only accepts the letters Y and N as valid
			//answers. 
	public static void main(String[] args)
	{
		System.out.println("Are you sure you want to quit [Y, N]?");
		Scanner s = new Scanner(System.in);
		String  x = (s.next());
		
		if (x.equals("Y"))
		{
			System.out.println("Rage quit initiated.");
		}
		else if (x.equals("N"))
		{
			System.out.println("Just rage quit. Don't press no.");
		}
		else
		{
			System.out.println(x + " is no valid input. GG");
		}

	}

}
