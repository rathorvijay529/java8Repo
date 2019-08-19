public class MethodReferences {
	public static void main(String[] args) {
		// till java 7
		UserdefinedThreadUsingJava7 java7 = new UserdefinedThreadUsingJava7();
		Thread t1 = new Thread(java7);
		t1.start();

		// After java 7
		Runnable r = () -> {
			for (int i = 0; i < 10; i++)
				System.out.println("Child thread using java 8::" + i);
		};

		Thread t = new Thread(r);
		t.start();

		// method reference with static method
		Runnable r1 = MethodReferences::printData;
		Thread t2 = new Thread(r1);
		t2.start();

		// method reference with instance method
		Runnable r2 = new MethodReferences()::printDataInstanceMethod;
		Thread t3 = new Thread(r2);
		t3.start();

		// method reference with private instance method
		Runnable r3 = new MethodReferences()::printDataPrivateInstanceMethod;
		Thread t4 = new Thread(r3);
		t4.start();

		// method reference with default instance method
		Runnable r4 = new MethodReferences()::printDataDefaultInstanceMethod;
		Thread t5 = new Thread(r4);
		t5.start();

		// method reference with public instance method
		Runnable r5 = MethodReferences::printDataWithReturnType;
		Thread t6 = new Thread(r5);
		t6.start();

		// method reference with public instance method
		Runnable r6 = new MethodReferences()::printDataInstanceMethodWithReturnType;
		Thread t7 = new Thread(r6);
		t7.start();

		// method reference with default instance method
		// Error:run() doesnt has anyargument.
		/*Runnable r7 = new MethodReferences()::printDataWithArgument;
		Thread t8 = new Thread(r7);
		t8.start();*/

	}

	// public method with static method
	public static void printData() {
		for (int i = 0; i < 10; i++)
			System.out
					.println("Child thread using java 8 static method reference::"
							+ i);
	}

	// public instance method
	public void printDataInstanceMethod() {
		for (int i = 0; i < 10; i++)
			System.out
					.println("Child thread using java 8 instance method reference::"
							+ i);
	}

	// private method
	private void printDataPrivateInstanceMethod() {
		for (int i = 0; i < 10; i++)
			System.out
					.println("Child thread using java 8 private instance method reference::"
							+ i);
	}

	// default method
	void printDataDefaultInstanceMethod() {
		for (int i = 0; i < 10; i++)
			System.out
					.println("Child thread using java 8 default instance method reference::"
							+ i);
	}

	// public method with static method with return type
	public static Integer printDataWithReturnType() {
		for (int i = 0; i < 10; i++)
			System.out
					.println("Child thread using java 8 static method reference with return type::"
							+ i);
		return 10;
	}

	// public instance method with return type
	public Integer printDataInstanceMethodWithReturnType() {
		for (int i = 0; i < 10; i++)
			System.out
					.println("Child thread using java 8 instance method reference with return type::"
							+ i);
		return 10;
	}

	// public method with static method with return type
	public static void printDataWithArgument(Integer arg) {
		for (int i = 0; i < 10; i++)
			System.out
					.println("Child thread using java 8 static method reference with return type::"
							+ i);

	}

}

// till java 7
class UserdefinedThreadUsingJava7 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++)
			System.out.println("Child thread using java 7::" + i);

	}

}