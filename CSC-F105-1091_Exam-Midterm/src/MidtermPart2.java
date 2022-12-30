// Quijano, Matthew
// Midterm Part2


import java.util.Random;
import java.util.Scanner;

public class MidtermPart2 {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		int num;
		// Scanner is a class, located in java.util package, and scan is an object, named by programmer
		// New means that each time when you create an object, you need to call the constructor of the class
		// System.class in means that you will take the input from the keyboard.

		System.out.println("What is your first name? ");
		String fname = scan.nextLine();
		
		System.out.println("What is your last name? ");
		String lname = scan.nextLine();
		
		num = generator.nextInt(500) + 500;
		
		System.out.println(lname.charAt(0) + fname.substring(0,3) + num + "@mail.ct.edu");
		
		scan.close();

	}
}


