package test.helloworld.eclipse;

import java.util.Scanner;

public class ExtraOefening11 {

	//11. A company sells five different products whose retail prices are shown in the
	//following table. Write a program that asks the user to enter the product number
	//and the quantity sold. The program will then calculate and display the total
	//retail value.
	
	public static void main(String[] args) 
	{

		long l = 10000000000l;
		double[] retailprice = new double[6];
		retailprice[1] = 2.95;
		retailprice[2] = 4.99;
		retailprice[3] = 5.49;
		retailprice[4] = 7.80;
		retailprice[5] = 8.85;
		
		System.out.println("Vul de product nummer in.");
		Scanner s = new Scanner(System.in);
		int  x = Integer.valueOf(s.next());
		
		
		System.out.println("Vul hoeveel er verkocht zijn.");
		Scanner r = new Scanner(System.in);
		int  y = Integer.valueOf(s.next());
		
		if(x >= 0)
		{
			System.out.println("Gefeliciteerd, " + Math.round((retailprice[x]*y * 100.0))/100.0 + " is de retail value. GG.");
		}
		
		
		
		
	}

}
