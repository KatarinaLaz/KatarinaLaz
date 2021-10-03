package d24_8_2021;

public class Zadatak1 {

	public static void main(String[] args) {

//	Napisati funkciju koja vraca indeks trazenog broj K u nizu N.
//	Niz i K su parametri funkcije. Napomena ukoliko se vrednost K ne nalazi u nizu vratiti -1.	
//
//	Primer: 
//	niz = {8,3,4, 5, 0} i K = 33 => vraca -1
//	niz = {8,3,4, 5, 0} i K = 3 => vraca 1

		int[] niz = { 8, 3, 4, 5, 0 };
		int trazeniBroj = 0;

		int jeUNizu = pretraga(niz, trazeniBroj);

		if (jeUNizu == 1) {
			System.out.println("Broj " + trazeniBroj + " jeste u nizu.");
		} else {
			System.out.println("Broj " + trazeniBroj + " nije u nizu.");
		}

	}

	public static int pretraga(int[] niz, int broj) {
		int jeUNizu = -1;
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] == broj) {
				jeUNizu = 1;
			}
		}
		return jeUNizu;
	}

}
