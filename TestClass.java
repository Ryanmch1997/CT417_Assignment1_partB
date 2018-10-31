package com.MyAssignment.AssignmentTest;

import Assignment.CT417.Module;



import Assignment.CT417.Course;
import Assignment.CT417.Student;

public class TestClass{
	
	public static void main(String[] args) {
	
	Student skelly = new Student("Sean", "Kelly", 1245780,21);
	Student mkehoe = new Student("May", "Kehoe", 12678889,18);
	
	Module oop = new Module("OO programming","CT2106");
	Module thermo = new Module("Thermodynamics", "CT2332");
	Course BCT = new Course("BCT");
	
	
	skelly.registerForModule(oop);
	skelly.registerForModule(thermo);
	skelly.registerForCourse(BCT);
	
	mkehoe.registerForModule(oop);
	mkehoe.registerForModule(thermo);
	mkehoe.registerForCourse(BCT);
	
	
	skelly.GetUserName();
	mkehoe.GetUserName();
	oop.list(); // Students in object orientated programming
	thermo.list(); //Students in Thermo class
	BCT.print();// people in BCT Course
	oop.print();
	thermo.print();
}

}