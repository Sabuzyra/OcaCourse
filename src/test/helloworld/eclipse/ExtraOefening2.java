package test.helloworld.eclipse;

import java.util.Scanner;

public class ExtraOefening2 {

	//2. Write a program that asks the user to enter a temperature in degrees Celsius. The
	//program will convert the temperature to degrees Fahrenheit and display the
	//result to the user with an appropriate message. (Hint: F° = (1.8 × C°) + 32.)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hoeveel graden is het nu?");
		
		Scanner s = new Scanner(System.in);
		int  input = Integer.valueOf(s.next());
		
		double getal = (1.8 * input) + 32;
		
		System.out.println("Het is " + getal + " fahrenheit");	
	}

}
