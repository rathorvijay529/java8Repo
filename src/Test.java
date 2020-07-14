
//method signature in java:method name and type of parameters ,no of parameters.
//1.works with functional interfaces.
//2.return types (will nt notic)
//3.modifiers( will nt  notice.)

class Employee12 {
	public void display() {
		for (int i = 0; i < 5; i++) {
			System.out.println("*****Display**********::" + i);
		}
	}

	public static void show() {
		for (int i = 0; i < 5; i++) {
			System.out.println("*****show**********::" + i);
		}
	}

	public void sum(int a, int b) {
		System.out.println("Sum in class::" + (a + b));
	}

}

interface FunctionI {
	public void add(int a, int b);
	//public void add1(int a, int b);
}

public class Test {

	public static void main(String[] args) {

		/*
		 * Runnable rn = new Runnable() {
		 * 
		 * @Override public void run() { for (int i = 0; i < 5; i++) {
		 * System.out.println("**********gggg*****::" + i); } }
		 * 
		 * };
		 * 
		 * Runnable rn1 = () -> { for (int i = 0; i < 5; i++) {
		 * System.out.println("***************::" + i); } };
		 * 
		 * Runnable rn12 = Test::print;
		 * 
		 * Runnable rn13 = new Employee12()::display;
		 * 
		 * Runnable rn14 = Employee12::show;
		 * 
		 * Thread t = new Thread(rn14); t.start();
		 */
		
		  FunctionI f = (a, b) -> {
		  
		  System.out.println("sum::" + (a + b)); };
		 
		
		
		FunctionI f1 = new Employee12()::sum;
		
		f1.add(2, 5);

	}

	public static void print() {
		for (int i = 0; i < 5; i++) {
			System.out.println("*****print**********::" + i);
		}
	}

}
