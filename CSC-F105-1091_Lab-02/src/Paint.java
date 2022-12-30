
import java.util.Scanner;

public class Paint{

	public static void main(String[] args){

		final int COVERAGE = 350; //paint covers 350 sq ft/gal

		//declare integers length, width, and height;
		int length, width, height, doors, windows;

		//declare double totalSqFt;
		double totalSqFt;

		//declare double paintNeeded;
		double paintNeeded;

		//declare and initialize Scanner object
		Scanner scan = new Scanner(System.in);

		//Prompt for and read in the length of the room
		System.out.println("Enter the length of the room: ");
		length = scan.nextInt();

		//Prompt for and read in the width of the room
		System.out.println("Enter the width of the room: ");
		width = scan.nextInt();

		//Prompt for and read in the height of the room
		System.out.println("Enter the height of the room: ");
		height = scan.nextInt();

		System.out.println("Enter the number of doors: ");
		doors = scan.nextInt();

		System.out.println("Enter the number of windows: ");
		windows = scan.nextInt();

		//Compute the total square feet to be painted--think
		//about the dimensions of each wall
		totalSqFt = ((length*height)*2) + ((width*height)*2) - (windows*15) - (doors*20);

		//Compute the amount of paint needed
		paintNeeded = totalSqFt/COVERAGE;

		//Print the length, width, and height of the room and the
		//number of gallons of paint needed.
		System.out.println("The number of gallons needed is: " + paintNeeded + " for "
				+ "a room with length " + length + " ft, and width " + width + " ft, and "
				+ "height " + height + " ft. containing " + doors + " doors " + windows + " windows.");

		scan.close();
	}
}