package webshop;
import webshop.Klant;

public class Webshop{


	private Klant klant;
	private int age;

	public double height; 



	public Klant getKlant(){
		return this.klant;
	}

	public int getAge(){
		return this.age;

	}

	public double getHeight(){
		return this.height;
	}



	public void setKlant(Klant klant){
		this.klant = klant;
	}

	public int setAge(int age){
		this.age = age;
	}

	public double setHeight(double height){
		this.height = height;
	}
}


