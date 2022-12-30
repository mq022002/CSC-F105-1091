
import java.util.Scanner;

public class Paint2

{
	public static void main(String[] args){

		final int COVERAGE = 350; //paint covers 350 sq ft/gal

		//declare integers length, width, and height
		int length, width, height;

		//declare double totalSqFt;
		double totalSqFt;

		//declare double paintNeeded;
		double paintNeeded;

		//declare and initialize Scanner object
		Scanner scan = new Scanner(System.in);

		//Prompt for and read in the length of the room
		System.out.println("Enter the length of the room: ");
		length=scan.nextInt();

		//Prompt for and read in the width of the room
		System.out.println("Enter the width of the room: ");
		width=scan.nextInt();

		//Prompt for and read in the height of the room
		System.out.println("Enter the height of the room: ");
		height=scan.nextInt();

		System.out.println("Total number of windows: ");

		int winCount = scan.nextInt();
		System.out.println("Total number of doors: ");

		int doorCount = scan.nextInt();
		totalSqFt = (length * width * height) - (winCount*15) - (doorCount*20);

		paintNeeded = (totalSqFt/COVERAGE);

		System.out.println("Total square feet doors and windows occupy: "+ (winCount*15) + (doorCount*20));
		System.out.println("Total square feet to be painted: " + totalSqFt);
		System.out.println("The amount of paint needed is : " + paintNeeded);

		scan.close();
	}
}