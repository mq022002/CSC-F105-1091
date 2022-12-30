import java.util.Scanner;

// Convert a temperature from Fahrenheit to Celsius
public class TempConverter {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("What is the temperature in  Fahrenheit? ");

		double fahrenheit = scan.nextDouble();
		double celsius = (fahrenheit - 32) *5/9;

		System.out.println("The temperature in celsius is: " + celsius);

		scan.close();
	}
}
