package com.vit.keywords;

public class LearningKeywords extends KeyWords{

	String automationTool = "Appium";
	
	public LearningKeywords(String name) {
		super(name);
		//this.automationTool = tool;
		
	}

	int pincode = 111;
	String city = "Vijayawada";
	
	static String state = "Andhra Pradesh";
	final String county = "India";
	
	public void  registering() {
		System.out.println("City == " + this.city);
		System.out.println("Pincode == " + this.pincode);
		
		
		System.out.println("City == " + super.city);
		System.out.println("Pincode == " + super.pincode);
	}
	
	public void launching() {
		String actualState = "Seema " + this.state;
		String actualCounty = "Bharat " + this.county; 
		
		System.out.println("actualState === " + actualState);
		System.out.println("actualCounty === " + actualCounty);
		
		System.out.println("state === " + this.state.replace("h", "H"));
		System.out.println("county === " + this.county.replace("I", "i"));
		super.test1();
		super.test2();
		
	}
	
	
	static {
		System.out.println("Static block");
	}

	
	public static void main(String[] args) {
		LearningKeywords learningKeywords = new LearningKeywords("Hydrabad");
		
		learningKeywords.launching();
	}

}
