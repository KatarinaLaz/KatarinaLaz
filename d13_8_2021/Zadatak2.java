package d13_8_2021;

public class Zadatak2 {

	public static void main(String[] args) {

//		Napisati program koji ima informacije koje cuva:
//		Ime 
//		Prezime
//		godinu rodjenja
//		I stampa informaicije u formatu:
//		[ime] [prezime] - [startost] god
//
//		Primer izvrsenja: 
//		Ako je ime = Milan, prezime = Jovanovic i godina rodjenja 1995 stapaju se informacije
//		Milan Jovanovic - 26 god

		String ime = "Milan";
		String prezime = "Jovanovic";
		int godinaRodjenja = 1995;
		int starost = 2021 - godinaRodjenja;

		System.out.println(ime + " " + prezime + " - " + starost + " god");

	}

}
