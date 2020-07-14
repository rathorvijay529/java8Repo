
//it works only with functional interface.
// it uses when abstract method return type is class.

//classname::new

interface FunctionalF {
	public Employee showData(String name, Integer salary);
}

interface FunctionalF1 {
	public Animal show();
}

public class Test2 {

	public static void main(String[] args) {
		// java 8::normalabda expression

		FunctionalF f = (a, b) -> {
			Employee emp = new Employee(a, b);
			System.out.println("**** Go to hell***********");
			return emp;
		};

		f.showData("Vijay", 200000);

		FunctionalF1 f2 = () -> {
			System.out.println("GGGGGGGGGGGGGGGGGGGGg");
			return new Animal();
		};
		f2.show();

		FunctionalF f1 = Employee::new;
		f1.showData("Vikash", 200);

		FunctionalF1 f3 = Animal::new;
		f3.show().display();
		

	}

}
