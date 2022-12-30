
public class StarsB{

	public static void main(String[] args){
		final int LIMIT = 10;
		for (int row = 1; row <= LIMIT; row++)
			{
				for (int space = 1; space <= LIMIT - row; space++)
					System.out.print(" ");
				for (int star = 1; star <= row; star++)
					System.out.print("*");
				System.out.println();
			}
	}
}