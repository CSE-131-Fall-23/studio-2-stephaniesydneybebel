package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.println("What is the starting amount? ");
		String startAmount = in.nextLine();
		System.out.println("How many days do you want to play? ");
		int totalSimulations = in.nextInt();
		
		for (int count = 1; count <= totalSimulations; count++)
		{

		int i = 0;
		while (i < 501) {
			double winChance = (double)(Math.random());
			
			System.out.print("Simulation " + i + ":");
			if(winChance <= 0.5) {
				System.out.println(" LOSE");
				}
				if(winChance>0.5)
				System.out.println(" WIN");
		  i++;
		  System.out.print("Number of days played: " + totalSimulations);
		}}}}
