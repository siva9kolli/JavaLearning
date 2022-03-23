package com.vit.labPractice;

public class Professor extends PHDscholar implements LabInCharge{
	public static String subject = "Core Java";
	public int emp_id = 20;
	
//	public Professor(String subject_name, int empid) {
//		this.subject = subject_name;
//		this.emp_id = empid;
//		System.out.println("Teacher teaching subject " + subject_name + " :: " + "and emp_id of the teacher is  " + empid);
//	}
//	
	

	public void teaches(String sub, int employee_id) {
		System.out.println("Teacher teaching subject " + sub + " :: " + "and emp_id is " + employee_id);
	}

	public void install() {
		System.out.println("Lab incharge install intruments for " + labName + " :: " + roomNo); 
	}


	public void help() {
		System.out.println("PHD scholar helps students "+ scholarName + " :: " + labConducted);
	}

}
