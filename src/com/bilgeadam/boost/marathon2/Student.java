package com.bilgeadam.boost.marathon2;

import java.time.LocalDate;

public class Student extends Person {
	
	private static int studentCounter;
	private String phoneNoS;
	private String phoneNoM;
	private String phoneNoF;
	
	
	public Student(String firstName, String middleName, String lastName, Gender gender, boolean married,
			LocalDate startDate, LocalDate finishDate, LocalDate birthDate, String regsNumber, String phoneNoS,
			String phoneNoM, String phoneNoF) {
		super(firstName, middleName, lastName, gender, married, startDate, finishDate, birthDate, regsNumber);
		this.phoneNoS = phoneNoS;
		this.phoneNoM = phoneNoM;
		this.phoneNoF = phoneNoF;
	}


	@Override
	public String getRegsNumber() {
		
		String num = String.format("%03d", ++studentCounter);
		return "2022" + num;
	}
	
	public boolean isMarried() {
		
		return isMarriedStatus();
		
	}
	
	private boolean isMarriedStatus() {
		// TODO Auto-generated method stub
		return false;
	}


	public void setMarriedStatus() throws stuException {
		 if(isMarried())
		 {
			  throw new stuException("NOT ALLOWED. WRONG INFORMATION");
		 }
		
	}
	

}
