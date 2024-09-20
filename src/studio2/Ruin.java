package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("What is your start amount?");
		double startAmount = in.nextDouble();
		System.out.println("What is your win chance?");
		double winChance = in.nextDouble();
		System.out.println("What is your win limit?");
		double winLimit = in.nextDouble();
		System.out.println("How many runs?");
		int totalSimulations = in.nextInt();
		int numberOfPlays = 0;


		for(int i = 0; i < totalSimulations; i++) {
			double currentBalance = startAmount;
			numberOfPlays = 0;

			while (0 < startAmount && startAmount < winLimit) {
				numberOfPlays++;
				double win = Math.random();
				if (win <= winChance) {
					startAmount++;
					System.out.println("You win!");
				}
				else {
					startAmount--;
					System.out.println("You lose");
				}
			}
		}
		System.out.println("Number of plays:" + numberOfPlays);
		if (startAmount == winLimit) {
			System.out.println("Won the day");
		}
		else {
			System.out.println("You ruined");
		}
	}
}
