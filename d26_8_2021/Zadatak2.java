package d26_8_2021;

public class Zadatak2 {

	public static void main(String[] args) {

//		(Za vezbanje) Kreirati klasu SmartAirConditioning koja ima:
//			
//			atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//			atribut za potrosnju elektricne energije dok hladi (npr 1kW/h)
//			atribut za potrosnju elektricne energije dok greje (npr 2kW/h)
//			atribut za izabranu temperaturu (minimum je 16, maksimum 35)
//			atribut za mod (hladi/greje)
//			
//			1. metodu za stampu - stampa u formatu 
//			marka - mod - termperatura
//			2. metodu koja racuna mesecnu potrosnju u kW/h, po formuli:
//			30 * 15 * potrosnja po satu ( zavisi da li greje ili hladi)
//			3. metodu koja racuna koliko klima novca potrosi za mesec dana
//			Prvih 350 kW/h su u zelenoj zoni i 1 kW/h kosta 6din
//			Sve ostalo se racuna kao u plavoj zoni, gde 1kW/h kosta 9 dinara
//			Metoda vraca ukupnu cenu za taj mesec
//
//			U glavnom programu krairati objekat klase SmartAirConditioning i testirati sve metode.

		SmartAirConditioning k1 = new SmartAirConditioning();
		k1.marka = "Gree";
		k1.potrosnjaDokHladi = 1;
		k1.potrosnjaDokGreje = 2;
		k1.temperatura = 22;
		k1.mod = "hladi";
		k1.stampa();
		System.out.println("Mesecna potrosnja klime u ovom modu je " + k1.mesecnaPotrosnja() + " kW/h.");
		System.out.println("Mesecni racun za klimu ce iznositi " + k1.mesecniTrosak() + " din. u ovom modu.");
		System.out.println();
		
		SmartAirConditioning k2 = new SmartAirConditioning();
		k2.marka = "Smasung";
		k2.potrosnjaDokHladi = 2;
		k2.potrosnjaDokGreje = 3;
		k2.temperatura = 25;
		k2.mod = "greje";
		k2.stampa();
		System.out.println("Mesecna potrosnja klime u ovom modu je " + k2.mesecnaPotrosnja() + " kW/h.");
		System.out.println("Mesecni racun za klimu ce iznositi " + k2.mesecniTrosak() + " din. u ovom modu.");
		System.out.println();
	}

}
