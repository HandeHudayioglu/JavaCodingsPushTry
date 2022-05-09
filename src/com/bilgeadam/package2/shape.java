package com.bilgeadam.package2;

public class shape {
	
	 double side1;
	 double side2;
	 double side3;
	 double side4;
	 
	
	
	 void Triangle () {
		
		double perimeterTriangle=(side1+side2+side3);
		System.out.println("The length of your shape: " +perimeterTriangle);
		double areaTriangle = ((side1*side2) / 2 );
		System.out.println("The area of your shape: " +areaTriangle);
	}
		
		

	

	 void Square () {
		
		double perimeterSquare=(side1+side2+side3+side4);
		System.out.println("The length of your shape: " + perimeterSquare);
		double areaSquare=(side1*side2);
		System.out.println("The area of your shape: " +areaSquare);
		
		
	}
	 
      boolean twoSide() {
		 System.err.println("Two edges cannot be entered!");
		 return false;
	
		
	 }
	
	
		
		
	
	 
	
	

}
