package com.bilgeadam.boost.marathon2;

import java.time.LocalDate;

public class Teacher extends Employee {
	


	private static int janitorCounter;
	private double increase=0.1;
	protected String regsNumber;
	protected Lessons lesson;
	
	
	
	public Teacher(String firstName, String middleName, String lastName, Gender gender, boolean married,
			LocalDate startDate, LocalDate finishDate, LocalDate birthDate,String ragesNumber, double salary, String phoneNo1,
			String phoneNo2) {
		super(firstName, middleName, lastName, gender, married, startDate, finishDate, birthDate, ragesNumber, salary, phoneNo1,
				phoneNo2);
		
		this.regsNumber = getRegsNumber();
	}



	@Override
	public String getRegsNumber() {
		
		String num = String.format("%03d", ++janitorCounter);
		return "J-" + num;
	}



	@Override
	protected double getSalary() {
		LocalDate halfYear=this.getStartDate().plusMonths(6);
		if(LocalDate.now()==halfYear) {
		return this.salary=salary*increase;
	}
		return this.salary;
	}

	

	
	@Override
	public String toString() {
		return "Teacher [lesson=" + this.lesson + ", " + super.toString() + "]";
	}



	public Lessons getLesson() {
		return lesson;
	}
	
	public void setLesson(Lessons lesson) {
		this.lesson = lesson;
	}
	
		
	}

	


