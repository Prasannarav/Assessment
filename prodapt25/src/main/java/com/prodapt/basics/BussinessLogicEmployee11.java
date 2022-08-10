package com.prodapt.basics;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class BussinessLogicEmployee11 {
ArrayList<Employee11> addDetails() {
 
 ArrayList<Employee11> details= new ArrayList<Employee11>();
 details.add(new Employee11(8001, "prasanna",21, 100000f, "SSE"));
 details.add(new Employee11(8002, "Saranya",19, 75000f, "SE"));
 details.add(new Employee11(8003, "riyana",20, 50000f, "ASE"));
 details.add(new Employee11(8004, "merji",18, 40000f, "ASE"));
 details.add(new Employee11(8005, "Vishnu",18, 60000f, "ASE")); 
 details.stream().forEach((i)->System.out.println(i));
 return details;
 }
 void processDetails(ArrayList<Employee11> details) {
 System.out.println(":::::::Details After Sorting:::::::");
 
 List < Employee11 > Employee11SortedList = details.stream().sorted(Comparator.comparing(Employee11::getSalary)).collect(Collectors.toList()); 
 Employee11SortedList.forEach(i -> System.out.println(i));
 } 
}



