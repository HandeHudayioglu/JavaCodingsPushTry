package com.bilgeadam.boost.marathon2;

import java.time.LocalDate;

public class Officers extends Employee {

	
	
	private static int officersCounter;
	private double increase=0.09;
	protected String regsNumber=getRegsNumber();


	public Officers(String firstName, String middleName, String lastName, Gender gender, boolean married,
			LocalDate startDate, LocalDate finishDate, LocalDate birthDate,String ragesNumber, double salary, String phoneNo1,
			String phoneNo2) {
		super(firstName, middleName, lastName, gender, married, startDate, finishDate, birthDate,ragesNumber, salary, phoneNo1,
				phoneNo2);
		this.regsNumber=getRegsNumber();
		
		
	}

	

	
	

	@Override
	public  String getRegsNumber() {
		
		String num = String.format("%03d", ++officersCounter);
		return "O-" + num;
		
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
	public boolean isMarried() {
		
		return false;
	}

	public double getIncrease() {
		return this.increase;
	}

	public void setIncrease(double increase) {
		this.increase = increase;
	}

	public static int getOfficersCounter() {
		return officersCounter;
	}






	@Override
	public String toString() {
		return "Officers [" + super.toString() + "]";
	}
	
	

	

	
	

}
