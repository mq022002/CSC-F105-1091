import java.util.Scanner;

public class AboutMe {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		String name = scan.nextLine();
		
		System.out.println("Please enter your age: ");
		String age = scan.nextLine();
		
		System.out.println("Please enter your college: ");
		String college = scan.nextLine();
		
		System.out.println("Please enter your pet name: ");
		String petName = scan.nextLine();

		System.out.println("Hello, my name is "+name+" and I am "+age+" years old. "
				+ "I’m enjoying my time at "+college+", though I miss my pet "+petName+" very much!");
		
		scan.close();
		
	}

}