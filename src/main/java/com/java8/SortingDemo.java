package com.java8;

import java.util.ArrayList;
import java.util.List;

public class SortingDemo {

	public static void main(String[] args) {
		
		
		List<Book> books = new ArrayList<>();
		books.add(new Book(1, "Java * In Action"));
		books.add(new Book(2,"Finance Freedom"));
		books.add(new Book(3, "Java 8 In Action"));
		books.add(new Book(4,"Finance Freedom SIP"));
		
		books.forEach((b) -> {System.out.println(b);});
		
		
	}

}
