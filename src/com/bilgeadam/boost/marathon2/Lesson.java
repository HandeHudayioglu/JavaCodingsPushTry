package com.bilgeadam.boost.marathon2;

import java.time.DayOfWeek;
import java.util.List;



public class Lesson {

		    private Teacher mainTeacher;
		    private Teacher secondaryTeacher;
		    private Lessons lessonName;
		    private int lessonYear;
		    private int lessonHours;
		    private DayOfWeek day;
		    private List<Student> studentList;

		   

		    public Lesson(Teacher mainTeacher, Teacher secondaryTeacher, Lessons lessonName, int lessonYear, int lessonHours,

		            DayOfWeek day, List<Student> studentList) {

		        super();

		        this.mainTeacher = mainTeacher;

		        this.secondaryTeacher = secondaryTeacher;

		        this.lessonName = lessonName;

		        this.lessonYear = lessonYear;

		        this.lessonHours = lessonHours;

		        this.day = day;

		        this.studentList = studentList;

		    }

		    public Lesson(Teacher mainTeacher, Teacher secondaryTeacher, List<Student> studentList) {

		        super();

		        this.mainTeacher = mainTeacher;

		        this.secondaryTeacher = secondaryTeacher;

		        this.studentList = studentList;

		    }

		    public Teacher getMainTeacher() {

		        return this.mainTeacher;

		    }


		    public void setMainTeacher(Teacher mainTeacher) {

		        this.mainTeacher = mainTeacher;

		    }

		    public Teacher getSecondaryTeacher() {

		        return this.secondaryTeacher;

		    }

		    public void setSecondaryTeacher(Teacher secondaryTeacher) {

		        this.secondaryTeacher = secondaryTeacher;

		    }
		    public Lessons getLessonName() {

		        return this.lessonName;

		    }

		    public void setLessonName(Lessons lessonName) {

		        this.lessonName = lessonName;

		    }

		    public int getLessonYear() {

		        return this.lessonYear;

		    }

		    public void setLessonYear(int lessonYear) {

		        this.lessonYear = lessonYear;

		    }

		    public int getLessonHours() {

		        return this.lessonHours;

		    }

		    public void setLessonHours(int lessonHours) {

		        this.lessonHours = lessonHours;

		    }

		    public DayOfWeek getDay() {

		        return this.day;

		    }


		    public void setDay(DayOfWeek day) {

		        this.day = day;

		    }

		    public List<Student> getStudentList() {

		        return this.studentList;

		    }

		    public void setStudentList(List<Student> studentList) {

		        this.studentList = studentList;

		    }

		    @Override

		    public String toString() {

		        return "Lesson [mainTeacher=" + this.mainTeacher + ", secondaryTeacher=" + this.secondaryTeacher

		                + ", lessonName=" + this.lessonName + ", lessonYear=" + this.lessonYear + ", lessonHours="

		                + this.lessonHours + ", day=" + this.day + ", studentList=" + this.studentList + "]";

		    }



		
	}


