public class Watch{


	public String type;
	public int stock;

	public Watch(){
		
		System.out.println("Fossil");
		type = "Men";
		stock = 4;

	}


	public Watch(String type) {
		this.type = type;

		System.out.println("New Fossil");

	}

	
	public Watch (String type, int stock) {
		this();

		System.out.println("new new Fossil");
	
	}

	
}