package d23_8_2021;

public class Zadatak3 {

	public static void main(String[] args) {

//		Zadatak
//		Napisati metodu koja stampa podatke o korisniku u formatu:
//		JMBG: [jmbg]
//		Ime: [ime]
//		Prezime: [prezime]
//		God. rodjenja: [god]
//		Aktivan: [true/false]
//		Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.

		String jmbg = "2907994767014";
		String ime = "Katarina";
		String prezime = "Lazic";
		int godinaRodjenja = 1994;
		Boolean aktivan = true;

		stampa(jmbg, ime, prezime, godinaRodjenja, aktivan);

	}

	public static void stampa(String jmbg, String ime, String prezime, int godinaRodjenja, boolean aktivan) {
		System.out.println("JMBG: " + jmbg);
		System.out.println("Ime: " + ime);
		System.out.println("Prezime: " + prezime);
		System.out.println("God. rodjenja: " + godinaRodjenja);
		System.out.println("Aktivan: " + aktivan);
	}

}
