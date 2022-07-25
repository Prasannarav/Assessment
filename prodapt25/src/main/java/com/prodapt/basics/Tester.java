package com.prodapt.basics;

public class Tester {
	public static void main(String[] args) {
		Employee e1 = new Employee("prasanna R", 21, "Associate Software Engineer");
		Employee e2 = new Employee("Janani S", 21, "Associate Software Engineer");
		Employee e3 = new Employee("Nivetha M", 21, "Associate Software Engineer");
		 
		HR_Manager hr = new HR_Manager();
		hr.process_Records(e1.name, e1.age, e1.designation);
		hr.process_Records(e2.name, e2.age, e2.designation);
		hr.process_Records(e3.name, e3.age, e3.designation);
	}
}
	