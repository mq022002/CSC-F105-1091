import java.util.Random;

import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {

		Random gen = new Random();
		Scanner scan = new Scanner(System.in);

		char again = 'n';

		do {
			int number = gen.nextInt(100) + 1;
			System.out.println("I have a number between 1 and 100, guess what it is (0 to quit): ");

			int guess;
			int count = 0;
			boolean quit = false;

			do {
				guess = scan.nextInt();
				if (guess == 0)
					quit = true;

				else {
					count++;
					if (guess == number)
						System.out.println("Correct! It takes you " + count + " try (tries).");

					else if (guess > number)
						System.out.println("Too high");

					else
						System.out.println("Too low");
				}
			}
			while (guess != number && quit == false);
			System.out.println("Would you like to play again? (y/n)");
			again = scan.next().charAt(0);
		}
		while (again == 'y');
		System.out.println("Have a nice day!");
		scan.close();
	}
}