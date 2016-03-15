package test.helloworld.eclipse;

import java.util.Scanner;

public class ExtraOefening3 {

	//3. Write a program that reads the lengths of the two sides of a right triangle and
	//calculates the length of the hypotenuse.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Wat is de lengte van de eerste rechter kant?");
		Scanner s = new Scanner(System.in);
		int  input = Integer.valueOf(s.next());
		
		System.out.println("Wat is de lengte van de tweede rechter kant?");
		Scanner r = new Scanner(System.in);
		int input2 = Integer.valueOf(r.next());
		
		int kwadraatonzin = (input * input) + (input2 * input2);

		System.out.println("De hypotenuse onzin is " + kwadraatonzin );	
	}

}
