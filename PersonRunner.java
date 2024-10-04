package in.nit.workshop;

public class PersonRunner {

	public static void main(String[] args) {
		
		System.out.println("main method is started");
		//assign the value 
		Person.country = "India";
        Person.state = "karnataka";		 
		
		System.out.println("country is:"+Person.country);
		System.out.println("state is:"+Person.state);
		
        //create object
		Person person = new Person();
		person.personName = "karthik";
        person.qualification = "BE";	
		person.pancardNumber = "234524255";
		person.AadharcardNumber = "356347346";
		
		System.out.println("personName is:"+person.personName);
		System.out.println("qualification is:"+person.qualification);
		System.out.println("pancardNumber is:"+person.pancardNumber);
		System.out.println("AadharcardNumber is:"+person.AadharcardNumber);
		
         //invoke the method
		Person.displayInfo();
		person.getInformation();
		
		
		

	}

}
