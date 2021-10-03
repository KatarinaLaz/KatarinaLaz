package d24_8_2021;

public class Zadatak2 {

	public static void main(String[] args) {

//		Napisati funkciju koja proverava da li je kliknuto u okviru login forme za web stranicu.
//		Funkcija kao parametre prima x i y koordinate za T1, T2 i M i vraca da li je tacka u tom regionu.
//		
//		Napomena: Funkcija prima 6 broja, i vraca true/false.
//
//		T1 i T2 su pozicije login forme. M je pozicija na kojoj je kliknuto

		int x1 = 1, y1 = 4; // T1
		int x2 = 4, y2 = 1; // T2
		int x3 = 3, y3 = 4; // M

		boolean jeUOkviru = provera(x1, y1, x2, y2, x3, y3);

		if (jeUOkviru == true) {
			System.out.println("Kliknuto je u okviru login forme.");
		} else {
			System.out.println("Nije kliknuto je u okviru login forme.");
		}

	}

	public static boolean provera(int x1, int y1, int x2, int y2, int x3, int y3) {
		boolean jeUOkviru = false;
		if (x3 >= x1 && x3 <= x2 && y3 <= y1 && y3 >= y2) {
			jeUOkviru = true;
		}
		return jeUOkviru;
	}

}
