package d16_8_2021;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {

//		4. (Za vezbanje)Napisati program koji proverava da li je kliknuto u okviru login forme za web stranicu.
//		Korisnik unosi x i y koordinate za T1, T2 i M. Ispisati odgovarajuce poruke.
//
//		T1 i T2 su pozicije login forme. M je pozicija na kojoj je kliknuto

		Scanner s = new Scanner(System.in);

		System.out.println("Unesite koordinate x,y za gornju levu ivicu: ");
		int x1 = s.nextInt();
		int y1 = s.nextInt();

		System.out.println("Unesite koordinate x,y za donju desnu ivicu: ");
		int x2 = s.nextInt();
		int y2 = s.nextInt();

		System.out.println("Unesite koordinate x,y za mesto gde je kliknuto misem: ");
		int x3 = s.nextInt();
		int y3 = s.nextInt();

		if (x3 >= x1 && x3 <= x2 && y3 <= y1 && y3 >= y2) {
			System.out.println("Kliknuto je u okviru login forme.");
		} else {
			System.out.println("Nije kliknuto u okviru login forme.");
		}

		s.close();
	}

}
