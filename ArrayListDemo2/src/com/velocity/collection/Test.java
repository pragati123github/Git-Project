package com.velocity.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("Ram", 101, 10000, "Pune"));
		emp.add(new Employee("sham", 102, 20000, "Mumbai"));
		emp.add(new Employee("Sapna", 103, 20500, "Pune"));
		emp.add(new Employee("Sakshi", 104, 30000, "Vijaypur"));
		
		Iterator<Employee> it = emp.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
