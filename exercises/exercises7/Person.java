package exercises7;

/**
 * 
 * Identify the parts of this object:
 *      Constructor
 *      Instance variables
 *      Methods
 *         Accessors
 *         Mutators
 *         Other
 *
 */
public class Person {
	
	private int height, age;
	//instance variable
	
	public Person(int height) {
		this.height = height;
		this.age    = 0;
	}
	//constructor
	
	public void setHeight(int height) {
		this.height = height;
	}
	//mutators
	
	public void happyBirthday() {
		this.age = this.age + 1;
	}
	//other--add age by one
	
	public int getHeight() {
		return this.height;
	}
	//accessors
	
	public int getAge() {
		return this.age;
	}
	//accessors
	

}
