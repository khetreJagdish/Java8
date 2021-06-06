package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

/**
 * Hello world!
 *
 */
public class App {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		Function<Long, Long> fun = (val) -> val + 3;
		Long number = fun.apply(5L);
		System.out.println(number);

		InterfaceDemo idemo = () -> {

			System.out.println("From InterfaceDemo Implementation:" + (2 + 5));
			m2();
		};

		InterfaceDemo2 demo2 = str -> {

			str.length();
			System.out.println("Length of the String is " + str.length());
			return str.length();
		};
		
		MultiplicationInterface multiplication = (x) -> {
			
			System.out.println("Multiplication is : " + (x*x));
		};
		
		Runnable r = () -> {
			
			for(int i =0; i<10;i++) {
				System.out.println("Inside "+i);
			}
		};
		
		
		List<Integer> l = new ArrayList();
		l.add(1);
		l.add(5);
		l.add(6);
		l.add(9);
		System.out.println("Before Sorting + "+ l);
		Collections.sort(l,(l1,l2)->(l1<l2)?-1:(l1>l2)?1:0);
		System.out.println("After Sorting + "+ l);
		
		List<Employee> listOfEmployee = new ArrayList<Employee>();
		listOfEmployee.add(new Employee(1,"Jagdish"));
		listOfEmployee.add(new Employee(2,"Achyut"));
		listOfEmployee.add(new Employee(3,"Abhi"));
		listOfEmployee.add(new Employee(4,"Aakash"));
		System.out.println("Employee Before SOrting :"+listOfEmployee);
		Collections.sort(listOfEmployee, (e1,e2)->(e1.getEmpName().length() > e2.getEmpName().length())?-1:(e1.getEmpName().length() < e2.getEmpName().length())?1:0);
		System.out.println("Employee After SOrting :"+listOfEmployee);
		
		idemo.m1();
		demo2.getLength("Hello");
		demo2.getLength(2);
		multiplication.multiply(4);
		Thread t = new Thread(r);
		t.start();
		
	}
	
	public static int m2() {
		System.out.println("From m2()");
		return 5;
	}

}
