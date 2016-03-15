package test.helloworld.eclipse;

import java.util.Scanner;

public class ExtraOefening4 {

	/*4. Write a program that prompts the user to enter the length (L), width (W), and
	height (H) of a box. The program will then compute and dis- play the volume
	and surface area of the box. (Hint: Volume = L × W × H; Surface area =
	2×[(L × W) + (L × H) + (H × W)].) */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Wat is de lengte van de doos??");
		Scanner s = new Scanner(System.in);
		int  input = Integer.valueOf(s.next());
		
		System.out.println("Wat is de wijdte van de doos???");
		Scanner r = new Scanner(System.in);
		int input2 = Integer.valueOf(r.next());
		
		System.out.println("Wat is de hoogte van de doos???");
		Scanner t = new Scanner(System.in);
		int input3 = Integer.valueOf(t.next());
		
		int volume = input * input2 * input3;
		
		int surfaceArea = 2 * ((input * input2) + (input * input3) + (input2 * input3));
		
		System.out.println("De volume is  " + volume );	
		System.out.println("De surface area is  " + surfaceArea );	
	}

}
