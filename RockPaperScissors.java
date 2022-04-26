package com.bilgeadam.sinifcagri;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		
		int gamer,pc;
		
		System.out.println("0.Rock");
		System.out.println("1.Paper");
		System.out.println("2.Scissors");
		System.out.println("3.Quit.");
		Scanner scanner = new Scanner(System.in);

		
		
		while(true) {
			System.out.print("Enter a number: ");
		
		gamer=scanner.nextInt();
		
		
		if (!(gamer==0 || gamer==1 || gamer==2 || gamer==3) ) {
			System.out.println("Invalid login");
		    }
		
		
		Random rnd=new Random();
		pc = rnd.nextInt(3);
		System.out.println("pc: "+pc);
		
		if ((gamer==0 && pc==0) || (gamer==1 && pc==1) || (gamer==2 && pc==2) ) {
			System.out.println("Draw!"); }
			
			else if ((gamer==0 && pc==2) || (gamer==1 && pc==0) || (gamer==2 && pc==1)) {
				System.out.println("You won!");
			}
			else if ((gamer==0 && pc==1) || (gamer==1 && pc==2) || (gamer==2 && pc==0)) {
				System.out.println("You lost!");
		    }
		 if (gamer==3) {
			System.out.println("Exiting.");
			System.exit(0);
			
			
		    }
		
	        }
	}
}
		    
	        
	
            


		



