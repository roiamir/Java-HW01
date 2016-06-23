package HW01;

import java.util.Scanner;

public class CallCalculator {
	double[] rates;
	double[] durations;
	double[] totals;
	double total = 0;
	
	public CallCalculator (int numberOfCalls){
		rates = new double[numberOfCalls];
		durations = new double[numberOfCalls];
		totals = new double[numberOfCalls];
	}
	
	public void getAndCalc()
	{

		getRates();
		getDurations();
		calculate();
		for (int i=0; i< totals.length; i++) {
			System.out.println("Total for call [#"+(i+1)+"] is : " + totals[i]);
		}
		System.out.println("Grand total for all calls is : " + total);
	}
	
	private void getRates(){
		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < rates.length; i++){
			System.out.println("Please insert rate [#"+(i+1)+"]:");
			rates[i] = sc.nextDouble();
		}
	}
	
	private void getDurations(){
		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < durations.length; i++){
			System.out.println("Please insert duration [#"+(i+1)+"]:");
			durations[i] = sc.nextDouble();
		}
	}
	
	private void calculate(){
		total=0;
		for(int i = 0; i < durations.length; i++){
			totals[i]= rates[i]*durations[i];
			total+= totals[i];
		}
	}
}
