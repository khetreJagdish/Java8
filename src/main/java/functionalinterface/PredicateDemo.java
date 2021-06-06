package functionalinterface;

import java.util.function.Predicate;

import com.java8.Employee;

public class PredicateDemo {

	public static void main(String[] args) {
		
		Predicate<Integer> predicate = i -> i<10;
		System.out.println(predicate.test(11));
		
		Predicate<String> predicate2 = str -> str.equals("JK");
		System.out.println(predicate2.test("JK"));
		

		
		Predicate<String> predicate3 = s -> s.length() >5;
		System.out.println("Lenght of String :"+ predicate3.test("abcddf"));
		
		Predicate<Employee> predicate4 = employee3 -> employee3.getEmpName().equals("Jagdish");
		
		System.out.println(predicate4.test(new Employee(2, "Jagdishe")));
	}

}
