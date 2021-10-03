package d23_8_2021;

public class Zadatak6 {

	public static void main(String[] args) {

//		.Zadatak (Za vezbanje)
//		Napisati metodu koja vrsi konverziju metra u cm, dm, km.
//		Metoda kao parametre prima vrednost u metrima i jedinicu u kojoj treba izvrsiti konverziju.
//		
//		1 m = 100cm
//		1m = 10dm
//		1m = 0.001km
//
//		Ako se u metodu prosledi vrednost 15 i jedinica cm, metoda vraca 1500.
//		Ako se u metodu prosledi vrednost 1500 i jedinica km, metoda vraca 1.5

		int metar = 6500;
		String jedinica = "km";
		double konvert = konverzija(metar, jedinica);
		System.out.println("Konverzijom " + metar + " metra u " + jedinica + " dobijamo " + konvert + jedinica);

	}

	public static double konverzija(int a, String jedinica) {
		String jed = jedinica;
		double konvert = 0;

		switch (jed) {
		case "cm":
			konvert = a * 100;
			break;
		case "dm":
			konvert = a * 10;
			break;
		case "km":
			konvert = a * 0.001;
			break;
		default:
			System.out.println("Nije validna valuta.");
		}
		return konvert;
	}

}
