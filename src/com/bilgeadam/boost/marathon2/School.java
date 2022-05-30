package com.bilgeadam.boost.marathon2;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class School {
	
	private List<Employee> employeeList;
	private HashMap<String, Lesson> lessonList;
	private HashMap<String, Teacher> teacherList;
	private HashMap<String, Student> studentList;
	private List<Employee> oldEmployeeList = new ArrayList<>();
	
	public School() {
		this.employeeList = new ArrayList<>();
		this.teacherList = new HashMap<>();
		this.studentList = new HashMap<>();
		this.lessonList = new HashMap<>();
	}
	
    public void addEmployee() {
    	
    	Officers o1=new Officers("Hande","Ayse","Demir",Gender.FEMALE,true,LocalDate.of(2020, 12, 15),LocalDate.of(2022, 8, 24),LocalDate.of(2000, 11, 16),"",134.97,"27485","95669");
    	Teacher t1=new Teacher("Ayse","Leyla","Yildirim",Gender.FEMALE,false,LocalDate.of(2021, 6, 18),LocalDate.of(2022, 9, 12),LocalDate.of(1990, 5, 8),"",560.87,"12345","34566");
		Janitor j1=new Janitor("Hakan","Ali","Demir",Gender.FEMALE,false,LocalDate.of(1999, 10, 12),LocalDate.of(2010, 6, 8),LocalDate.of(1980, 11, 6),"",234.0844,"23455","2455");
		
		employeeList.add(o1);
		employeeList.add(j1);
		employeeList.add(t1);
	}
    public void showEmployee() {
    	System.out.println(employeeList);
    }
    
   public void addStudent() {
	   
	   Student s1= new Student ("Eda","Ece","Say",Gender.FEMALE,false,LocalDate.of(2018, 2, 10),LocalDate.of(2022, 8, 10),LocalDate.of(2000, 8, 9),"","274747","939393","93939");
	   Student s2= new Student ("Eda","Ece","Say",Gender.FEMALE,false,LocalDate.of(2018, 2, 10),LocalDate.of(2022, 8, 10),LocalDate.of(2000, 8, 9),"","274747","939393","93939");
	   Student s3= new Student ("Eda","Ece","Say",Gender.FEMALE,false,LocalDate.of(2018, 2, 10),LocalDate.of(2022, 8, 10),LocalDate.of(2000, 8, 9),"","274747","939393","93939");
	   Student s4= new Student ("Eda","Ece","Say",Gender.FEMALE,false,LocalDate.of(2018, 2, 10),LocalDate.of(2022, 8, 10),LocalDate.of(2000, 8, 9),"","274747","939393","93939");
	   
	   studentList.put(s1.getRegsNumber(), s1);
	   studentList.put(s2.getRegsNumber(), s2);
	   studentList.put(s3.getRegsNumber(), s3);
	   studentList.put(s4.getRegsNumber(), s4);
	   System.out.println(studentList);
   }
	
   public void addTeacher() {
	   
	   HashMap<String, Teacher> teacherList = new HashMap<String, Teacher>();
	   
	   Teacher t1=new Teacher("Ali","Hakan","Demir",Gender.MALE,true,LocalDate.of(2020, 7, 12),LocalDate.of(2021, 8, 12),LocalDate.of(2000, 5, 9),"",1234.87,"26277","020229");
	   Teacher t2=new Teacher("Ali","Hasan","Demir",Gender.MALE,true,LocalDate.of(2020, 8, 2),LocalDate.of(2022, 8, 12),LocalDate.of(1999, 5, 19),"",1234.87,"26277","020229");
	   Teacher t3=new Teacher("Mehmet","Hakan","Demir",Gender.MALE,true,LocalDate.of(2019, 8, 12),LocalDate.of(2021, 10, 12),LocalDate.of(2000, 12, 9),"",1234.87,"26277","020229");
	   Teacher t4=new Teacher("Ali","Hakan","Servet",Gender.MALE,true,LocalDate.of(2020, 9, 12),LocalDate.of(2021, 8, 4),LocalDate.of(2000, 6, 9),"",1234.87,"26277","020229");
	   
	   teacherList.put(t1.getRegsNumber(), t1);
	   teacherList.put(t2.getRegsNumber(), t2);
	   teacherList.put(t3.getRegsNumber(), t3);
	   teacherList.put(t4.getRegsNumber(), t4);
	  System.out.println(teacherList);
	   
	   
   }
   
   public void showTeacher() {
	   System.out.println(teacherList);
   }
   
  
   public HashMap<Integer, String> initMenu() {
		HashMap<Integer, String> menu = new HashMap<Integer, String>();
		
		menu.put(1, "NEW_EMPLOYEE");
		menu.put(2, "EMPLOYEE_LIST");
		menu.put(3, "OLD_EMPLOYEES");
		menu.put(4, "NEW_CLASS");
		menu.put(5, "ASSIGN_STUDENTS");
		menu.put(6, "LIST_OF_CLASSES");
		menu.put(7, "CLASSES_OF_STUDENT");
		menu.put(8, "SYSTEM.GIFT_LIST");
		menu.put(9, "SYSTEM.WAGE_LIST");
		menu.put(10, "SYSTEM.EXIT_APPLICATION");
		return menu;
	}
   
   public void processMenu(int selection) {
		
		switch (selection) {
			case 1:
				this.addEmployee();
				break;
			case 2:
				this.employeeList();
				break;
			case 3:
				this.oldEmployeeList();
				break;
			case 4:
				//this.newClass();
				break;
			case 5:
				// this.assignStudent();
				;
				break;
			case 6:
				// this.studentList();
				break;
			case 7:
				// this.studentsClasses();
				break;
			case 8:
				// this.giftRecipients();
				break;
			case 9:
				// this.salaryInfo();
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + selection);
		}
	
	

}
   private void oldEmployeeList() {
	   
	   
	   System.out.println("Old employees list:");
		
		for (Employee employee : employeeList) {
			if (employee.getFinishDate().isBefore(LocalDate.now())) {
				oldEmployeeList.add(employee);
			} else {
				System.out.println(oldEmployeeList);
			}
			
		}
		
	}

   private void employeeList() {
	
	System.out.println(employeeList);
	
}
   private static boolean endProcess() {
	   return false;
   }

   
		
		
	}




