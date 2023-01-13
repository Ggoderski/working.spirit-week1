public class Car{


	public String brand;
	public String color;
	

	//Constructor
	public Car(){
		//Default constructor
		System.out.println("In constructor");
		brand = "Mitshubishi";
		color = "Matalic black";
		
	
	
	}



	//Constructor
	public Car(String brand) {

		System.out.println("Mitshubishi");
		this.brand = brand;
	}



	{
		System.out.println("In initializer block");
	}


}