package com.bilgeadam.boost.marathon2;

public enum Lessons {
	
	MATH("Math"),PHYSICS("Physics"),CHEMICAL("Chemical");
   
	private String lesson;
	
    Lessons(String lesson) {
		this.lesson=lesson;
	}

	public String getLesson() {
		return this.lesson;
	}
    

}
