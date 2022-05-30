package com.bilgeadam.boost.marathon2;

import java.time.LocalDate;

public class Management {
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to school management system");
		
		School school=new School();
		school.initMenu();
		System.out.println(school.initMenu());
		school.addEmployee();
		school.showEmployee();
		school.addTeacher();
		school.showTeacher();
		
		
		
		
		System.out.println("Bye");
	}

	
		
		

}
