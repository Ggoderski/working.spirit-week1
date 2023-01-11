import java.util.Scanner;

public class Trui{
	
	public boolean teKoop;
	public double prijs;
	public int kleur;
	public char maat;
	  
		
	public void typeSweater() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Is het een trui, sweater of hoodie?");
		String sweater = scanner.nextLine();

	}
	

	public boolean isTeKoop(){
		return teKoop;
		
	} 

	public double getPrijs(){
		return prijs;
		
	} 

	public int getKleur(){
		return kleur;
		
	} 

	public char getMaat(){
		return maat;
		
	}

	
	public void setTeKoop(boolean teKoop){
		this.teKoop = teKoop;
	}

	public void setPrijs(double prijs){
		this.prijs = prijs;
	}

	public void setKleur(int kleur){
		this.kleur = kleur;
	}

	public void setMaat(char maat){
		thismaat = maat;
	}



	

}

//maak 4 methods om de lokale properties in te stellen

//in eigen class ga je alle properties vullen
//de methodes ga je aanroepen en ga je checken 
//met sytem.out.println of het goed gevuld


//eigen class 4 methods die de lokale properties terug geven

// eigen class -> 2 objecten van aanmaken en die ga je vullen


//byte short int long -> 0
//float double -> 0.0
//boolean -> false
//String -> \u0000
//Class/object -> null

//bedenk een eigen class met 5 properties die een boolean, int
// short, double, char property bevat en ga die compileren