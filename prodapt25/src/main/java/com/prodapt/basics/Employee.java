package com.prodapt.basics;

public class Employee {
String name;
int age;
String designation;
public Employee(String name, int age, String designation) {
this.name = name;
this.age = age;
this.designation = designation;
}
public void setName(String name) {
this.name = name;
}
public String getName() {
return name;
}
public void setAge(int age) {
this.age = age;
}
public int getAge() {
return age;
}
public void setDesignation(String designation) {
this.designation = designation;
} 
public String getDesignation() {
return designation;
} 
}
