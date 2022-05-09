package com.bilgeadam.package2;

import java.util.Scanner;

public class shapeTest {

	public static void main(String[] args) {
		 
		
		
		shape obj= new shape();
		
		do {
			
			System.out.println("Enter the side lengths.(You can exit the program with -1)");
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the first side length: ");
			obj.side1 = input.nextDouble();
			if (obj.side1==-1) {
				System.out.println("Bye");
				break;
				
				
				
				
			}
			System.out.print("Enter the second side length: ");
			obj.side2=input.nextDouble();
			if(obj.side2==-1) {
				System.out.println("Bye");
				break;
			}
			System.out.print("Enter the third side length: ");
			obj.side3=input.nextDouble();
			if(obj.side3==-1) {
				System.out.println("Bye");
				break;
			}
			System.out.print("Enter the fourth side length: ");
			obj.side4=input.nextDouble();
			if(obj.side4==-1) {
			System.out.println("Bye");
				break;
			}
			
			else {
				
				if(obj.side1==0 || obj.side2==0 || obj.side3==0 || obj.side4==0) {
					System.out.println("The program is ended.");
					
				}
				else if  ((obj.side1!=0 && obj.side2==0)|| (obj.side1!=0 && obj.side3==0) || (obj.side1!=0 && obj.side4==0)) {
				 obj.twoSide();
				 break;
				}
				
				else if ((obj.side1==0) || (obj.side2==0) ||( obj.side3==0) || (obj.side4==0)) {
				 obj.Triangle();
				}
			 
			 
				else {
				 obj.Square();
				}
			}
			
		} while (true); 
		}
		
		}
	




	 
		
		
	    
		
		

				

	
		


	    

   
