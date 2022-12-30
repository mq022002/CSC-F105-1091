import java.util.Random;

public class Die {

	private int faceValue;// instance data
	Random gen = new Random();
	
	//Constructor - set initial value for the instance variables
	public Die() {
		faceValue = 1;
	}
	//Mutator or Setter
	public void setFaceValue (int face){
		faceValue = face;
	}
	//Accessor or Getter
	public int getFaceValue() {
		return faceValue;
	}
	//Additional Method
	public void roll(){
		faceValue = gen.nextInt(6) + 1;
	}
	//toString() is used to indicate how to print out the results
	public String toString() {
		return "" + faceValue;
	}
}
