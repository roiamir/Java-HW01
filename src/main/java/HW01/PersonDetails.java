package HW01;

import java.util.Scanner;

public class PersonDetails {
	public void getPrintDetails() {
		System.out.println("What is your name? : ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("Where are you from ("+name+")? : ");
		String place = sc.nextLine();
		System.out.println("Hi "+name+", you are from "+place+".");
	}
	
}
