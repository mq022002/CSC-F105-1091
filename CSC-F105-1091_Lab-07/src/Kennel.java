import java.util.Scanner;

public class Kennel
{
   public static void main (String[] args)
   {
	  String name;
	  int age = 0;
	  
	  Scanner scan = new Scanner (System.in);
	  
	  System.out.println ( "What is the dog's name?");
	  name = scan.next();
	  
	  System.out.println ("What is the dog's age?  ");
	  age= scan.nextInt();
	  
	  Dog dog = new Dog(name, age);
	  
	  
	  System.out.println(dog);

	  scan.close();
   }
} 
