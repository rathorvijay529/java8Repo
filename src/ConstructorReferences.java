//Note::Constructor references should use when functional interface abstract method returns class

interface Interf1 {
	public Student getEmployee(int id, String name, String lastName,
			String departanme);

}

// Using java-7
class InterfaceImpl implements Interf1 {
	@Override
	public Student getEmployee(int id, String name, String lastName,
			String departanme) {
		Student student = new Student(id, name, lastName, departanme);
		return student;
	}

}

public class ConstructorReferences {
	public static void main(String[] args) {

		// Using java-7
		InterfaceImpl impl = new InterfaceImpl();
		System.out.println(impl.getEmployee(1, "Vijay", "Rathor", "CSE"));

		// Using java-8 lambda expression
		Interf1 i = (id, name, lastName, departName) -> new Student(id, name,
				lastName, departName);
		System.out.println(i.getEmployee(2, "Vijay1", "Rathor1", "CSE1"));

		// Using java-8 Constructor refrences
		Interf1 i2 = Student::new;
		System.out.println(i2.getEmployee(3, "Vijay2", "Rathor2", "CSE2"));

	}

}
