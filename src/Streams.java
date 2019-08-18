import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//java.util.stream.*
//need: to process the data in data structure like collection,arrays etc.
//ways to use Streams:(10 ways)
//1.collectionRef.stream().
//2.streamOf(arrayRef)
//3.Arrays.stream(data of array)

public class Streams {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(1, 8, 3,
				4, 5, 6, 2, 9, 10));
		Integer[] intArray = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// ways1
		List<Integer> list = Stream.of(intArray).filter(i -> i % 2 == 0)
				.collect(Collectors.toList());
		// ways2
		List<Integer> list2 = Arrays.stream(intArray).filter(i -> i % 2 == 0)
				.collect(Collectors.toList());
		// ways3
		List<Integer> list3 = al.stream().filter(i -> i % 2 == 0)
				.collect(Collectors.toList());
		// ways1
		List<Integer> list4 = Stream.of(intArray).filter(i -> i % 2 == 0)
				.map(i -> i * 3).collect(Collectors.toList());
		// ways2
		List<Integer> list5 = Arrays.stream(intArray).filter(i -> i % 2 == 0)
				.map(i -> i * 3).collect(Collectors.toList());
		// ways3
		List<Integer> list6 = al.stream().filter(i -> i % 2 == 0)
				.map(i -> i * 3).collect(Collectors.toList());

		// Testing
		System.out.println(list);
		System.out.println(list2);
		System.out.println(list3);

		System.out.println(list4);
		System.out.println(list5);
		System.out.println(list6);

		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee("vijay", 100000));
		employeeList.add(new Employee("Akash", 20000));
		employeeList.add(new Employee("vinay", 3666));
		employeeList.add(new Employee("Example", 445678));
		employeeList.add(new Employee("vikash", 54565));
		
		
		System.out.println("Employee with salary greater than 50000 and name start with V::"+getEmployee(employeeList));
		

	}

	// java-7

	public static Integer[] test(Integer[] arr) {
		Integer[] intArray = new Integer[10];
		for (int i = 0; i < arr.length; i++) {// iterating
			if (arr[i] % 2 == 0) {// testing or filtering
				intArray[i] = arr[i];// collecting
			}
		}
		return intArray;// returning

	}

	public static List<Employee> getEmployee(List<Employee> list) {
		return list
				.stream()
				.filter(employee -> employee.getSalary() > 50000
						&& employee.getName().startsWith("v"))
				.collect(Collectors.toList());

	}
}
