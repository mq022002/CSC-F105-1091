
public class Dog {

	private String name;
	private int age;
	
	public Dog(String n, int a){
		setName(n);
		setAge(a);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int personYears(){
		return age *7;
	}
	
	public String toString() {
		return "==========" 
		+ "\n" + getName() + "'s age in person years is " + personYears() + ".";
	}
}	
	
