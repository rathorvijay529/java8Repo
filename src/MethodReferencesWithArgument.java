interface Interf {
	public void sum(int a, int b);
}

public class MethodReferencesWithArgument {
	public static void main(String[] args) {

		// Using lambda epression
		Interf i = (a, b) -> System.out
				.println("Sum using lambda expression is::" + (a + b));
		i.sum(10, 20);

		// Using Method references
		Interf i2 = MethodReferencesWithArgument::add;
		i2.sum(20, 40);

		// Using Method references
		Interf i3 = new MethodReferencesWithArgument()::add1;
		i3.sum(40, 40);

	}

	// Using for static Method references
	public static void add(int a, int b) {
		System.out.println("Sum using method Refrences is::" + (a + b));
	}

	// Using for instance Method references
	public void add1(int a, int b) {
		System.out
				.println("Sum using instance method Refrences is::" + (a + b));
	}
}
