package test.helloworld.eclipse;

import java.util.Scanner;

//1. Write a program that asks that user to enter an article, a noun, and a verb. 
//The program then creates a sentence of the form article noun verb. 

public class ExtraOefening1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Voer een artikel in (?)");
		Scanner s = new Scanner(System.in);
		String input = s.next();
		
		System.out.println("Voer een noun in (?)");
		Scanner d = new Scanner(System.in);
		String input2 = d.next();
		
		System.out.println("Voer een verb in (?)");
		Scanner f = new Scanner(System.in);
		String input3 = f.next();
		
		System.out.println(input);
	}

}
