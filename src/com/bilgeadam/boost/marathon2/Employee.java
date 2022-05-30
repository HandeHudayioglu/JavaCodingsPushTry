package com.bilgeadam.boost.marathon2;

import java.time.LocalDate;

public abstract class Employee extends Person {
	
	
	protected static double salary;
	private String phoneNo1;
	private String phoneNo2;
	
	
	public Employee(String firstName, String middleName, String lastName, Gender gender, boolean married,
			LocalDate startDate, LocalDate finishDate, LocalDate birthDate,String ragesNumber,double salary,String phoneNo1,String phoneNo2) {
		super(firstName, middleName, lastName, gender, married, startDate, finishDate, birthDate,ragesNumber);
		// TODO Auto-generated constructor stub
		this.salary=getSalary();
		this.phoneNo1=phoneNo1;
		this.phoneNo2=phoneNo2;
		
	}
	
	


	protected abstract double getSalary();

	@Override
	public String toString() {
		return "Employee [phoneNo1=" + this.phoneNo1 + ", phoneNo2=" + this.phoneNo2 + ", "
				+ super.toString() + "]";
	}

	
	
	


	
	

	
		
	
}
