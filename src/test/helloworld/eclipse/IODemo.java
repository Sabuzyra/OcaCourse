package test.helloworld.eclipse;

import java.util.Scanner;

public class IODemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Voer iets in");
		
		Scanner s = new Scanner(System.in);
		String input = s.next();
		
		System.out.println("Wat jij typte is: " + input + " dat is toch correct?");
	}

}
