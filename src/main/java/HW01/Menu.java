package HW01;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.run();

	}
	
	private void floweBed() {
		System.out.println("please insert radius:");
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		FlowerBed f = new FlowerBed();
		System.out.println("for Radius "+radius +
							"the circumference is " + f.calcCirc(radius) +
							"and the area is" + f.calcArea(radius));
	}
	
	private void personDetails(){
		PersonDetails personDet = new PersonDetails();
		personDet.getPrintDetails();
	}
	
	private void callCalc() {
		CallCalculator calc = new CallCalculator(3);
		calc.getAndCalc();
	}
	
	public void run() {
		System.out.println("(1) - Flower Bed Calculator");
		System.out.println("(2) - Perosn Details");
		System.out.println("(3) - Call Calculator");
		System.out.println("Chose an option:");
		
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		
		switch (option)
		{
		case 1:
			floweBed();
			break;
		case 2:
			personDetails();
			break;
		case 3:
			callCalc();
			break;
		default:
			System.out.println("invalid option: " + option);
			break;
		}
	}

}
