
public class RollingDice {

	public static void main(String[] args) {
			Die die1, die2;

			die1 = new Die(); //Call constructor
			die2 = new Die();

			System.out.println("Die One: " + die1 + ", Die Two: " + die2);

			die1.roll();
			die2.roll();

			System.out.println("Die One: " + die1 + ", Die Two: " + die2);

			int sum = die1.getFaceValue() + die2.getFaceValue();
			System.out.println("Sum: " + sum);

			die1.setFaceValue(6);
			System.out.println("Die One: " + die1 + ", Die Two: " +  die2);
	}

}
