public class Car{


	public String brand;

	private int wheels;
	
	
	public int getWheels(){
		this.wheels;
	}

	public int setWheels(int wheels){
		
		if (wheels > 0){
			this.wheels = wheels;
		}
	}

	








	//Constructor
	public Car(){
		//Default constructor
		System.out.println("In constructor");
		brand = "Mitshubishi";
		
	}






}