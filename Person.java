package in.nit.workshop;

public class Person {

//static variables
	
	public static String country;
	public static String state;
	
	//instance variables or non-static variables
	public  String personName;
	public  String qualification;
	public  String pancardNumber;
	public  String AadharcardNumber;
	
	
	//static methods
	public static void displayInfo() {
		System.out.println("display method is invoked");
	}
	
	//non-static methods
	public void getInformation() {
		System.out.println("invoking non-static method");
	}






}
