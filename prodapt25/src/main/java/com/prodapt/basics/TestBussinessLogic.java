package com.prodapt.basics;

public class TestBussinessLogic {
	public static void main(String[] args) {
	
	BusinessLogic bl=new BusinessLogic();
	
	bl.addBooks(); 
	
	System.out.println("\nAfter adding the Books ");
	bl.displayBooks(); 
	
	bl.updateBooks(3,4001,"Stuart Little","E.B.White"); 
	
	System.out.println("\nAfter Updating the book ");
	bl.displayBooks();
	
	
	
	System.out.println("\nAfter Deleting the book ");
	bl.displayBooks();
	
	}
	
}




