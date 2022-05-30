package com.bilgeadam.boost.marathon2;

import java.time.LocalDate;

public abstract class Person {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private Gender gender;
	private boolean married;
	protected LocalDate startDate;
	private LocalDate finishDate;
	private LocalDate birthDate;
	private static String regsNumber;
	

	
	
	public Person(String firstName, String middleName, String lastName, Gender gender, boolean married,
			LocalDate startDate, LocalDate finishDate,LocalDate birthDate,String regsNumber) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.gender = gender;
		this.married = married;
		this.startDate = startDate;
		this.finishDate = finishDate;
		this.birthDate = birthDate;
		this.regsNumber=getRegsNumber();
		
	}
	
	

	public Person(String firstName, String lastName, Gender gender, boolean married, LocalDate startDate,
			LocalDate finishDate, LocalDate birthDate, String regsNumber) {
		// TODO Auto-generated constructor stub
	}



	public abstract String getRegsNumber();
	
    
	public String getLastName() {
		return this.lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public boolean isMarried() {
		return this.married;
	}



	public void setMarried(boolean married) {
		this.married = married;
	}



	public LocalDate getFinishDate() {
		return this.finishDate;
	}



	public void setFinishDate(LocalDate finishDate) {
		this.finishDate = finishDate;
	}



	



	public String getFirstName() {
		return this.firstName;
	}



	public String getMiddleName() {
		return this.middleName;
	}



	public LocalDate getStartDate() {
		return this.startDate;
	}



	public LocalDate getBirthDate() {
		return this.birthDate;
	}



	@Override
	public String toString() {
		return "Person [firstName=" + this.firstName + ", middleName=" + this.middleName + ", lastName=" + this.lastName
				+ ", gender=" + this.gender + ", married=" + this.married + ", startDate=" + this.startDate
				+ ", finishDate=" + this.finishDate + ", birthDate=" + this.birthDate + ", regsNumber="
				+ this.getRegsNumber() + "]";
	}




	


	

}
