import java.util.Scanner;

public class OOPAplication{
	
	public static void main(String[] args) {
	/*	Scanner scanner = new Scanner(System.in);
	
		Trui mijnTrui = new Trui();
		Trui jouwTrui = new Trui();

		



		mijnTrui.typeSweater();
		


		mijnTrui.teKoop = false;
		mijnTrui.prijs = 19.95;
		mijnTrui.kleur = 1; //Blauw
		mijnTrui.maat = 'L';


		jouwTrui.teKoop = true;
		jouwTrui.prijs = 15.95;
		jouwTrui.kleur = 2; //Groen
		jouwTrui.maat = 'S';

		
		System.out.println("Is deze trui te koop?");
		boolean teKoop = scanner.nextBoolean();
		mijnTrui.teKoop = teKoop;
		
		System.out.println("Wat is de prijs?");
		double prijs = scanner.nextDouble();
		mijnTrui.prijs = prijs;

		System.out.println("Welke kleur heeft de trui?");
		int kleur = scanner.nextShort();
		mijnTrui.kleur = kleur;

		System.out.println("Welke maat heeft de trui?");
		char maat = scanner.next().charAt(0);
		mijnTrui.maat = maat;	


		mijnTrui.setTeKoop(true);
		System.out.println(mijnTrui.getTeKoop());

		mijnTrui.setPrijs(19.95);
		System.out.println(mijnTrui.getPrijs());

		mijnTrui.setKleur(1);
		System.out.println(mijnTrui.getKleur());

		mijnTrui.setMaat('L');
		System.out.println(mijnTrui.getMaat());


	//public boolean teKoop;
	//public double prijs;
	//public short kleur;
	//public char maat;
	*/
	
	Bank nieuweBank = new Bank();

	nieuweBank.setSize(8);
	System.out.println(nieuweBank.getSize());

	nieuweBank.setColor("Dark Gray");
	System.out.println(nieuweBank.getColor());

	nieuweBank.setComfortClass('A');
	System.out.println(nieuweBank.getComfortClass());

	nieuweBank.setPrize(4999.99);
	System.out.println(nieuweBank.getPrize());

	nieuweBank.setAvalible(true);
	System.out.println(nieuweBank.getAvalible());

	
	}



}