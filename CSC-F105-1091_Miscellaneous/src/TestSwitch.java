
public class TestSwitch {

	public static void main(String[] args)
	{
		char option = 'B';
		int aCount = 0, bCount = 0, cCount = 0;
		switch(option)
		{
			case 'A':
				aCount++;
				break;

			case 'B':
				bCount++;
				break;

			case 'C':
				cCount++;
				break;

		}
		System.out.println(aCount + "\t" + bCount + "\t" +cCount);
	}
}
