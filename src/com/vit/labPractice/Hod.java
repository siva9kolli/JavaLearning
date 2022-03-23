package com.vit.labPractice;

public class Hod extends Professor{
	
	public static void main(String[] args) {
		Hod hod = new Hod();
		hod.install();
		hod.help();
		hod.teaches(subject, hod.emp_id);	
	}
}
