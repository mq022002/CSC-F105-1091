import java.text.DecimalFormat;
import java.util.Scanner;

public class GradeAverage{
    public static void main(String[] args){
        int sum = 0, value, count = 0;
        double average;

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter integer grades (-1 to quit):");
        value = scan.nextInt();

        while (value != -1){
            if (value <= 0 && value != -1 || value > 100){
                System.out.println("Invalid Input. Please enter another grade:");
            	value = scan.nextInt();
            }
            else{
	        	count++;
	            sum += value;
	            System.out.println("The total is " + sum);
	            value = scan.nextInt();
            }
        }

        System.out.println ();

        if (count == 0 && value == -1)
            System.out.println("No grades entered");
        else{
            average = (double)sum / count;

            DecimalFormat fmt = new DecimalFormat("0.##");
            System.out.println("Average: " + fmt.format(average));
            System.out.println("Max: " + fmt.format(Math.max(value, value)));
            System.out.println("Min: " + fmt.format(Math.min(value, value)));

            scan.close();
        }
    }
}
