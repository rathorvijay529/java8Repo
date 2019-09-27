
public class AnimalParent {

	private String stomach;

public AnimalParent() {
		
		
	}

	public AnimalParent(String stomach) {
		
		this.stomach = stomach;
	}

}

class Dog extends AnimalParent {
	private String noOfLegs;

	public Dog(String noOfLegs) {
		
		this.noOfLegs = noOfLegs;
	}

}