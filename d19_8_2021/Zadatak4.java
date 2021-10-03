package d19_8_2021;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {

//		(Za vezbanje) Napisati program koji ucitava jednocifrene brojeve dok se ne unese 0 i formira novi broj X tako sto lepe u novi broj kao na primeru.
//		X je int. Smatrati da korisnik unosi samo jednocifrene brojeve.
//		Unesite broj: 4
//		Unesite broj: 3
//		Unesite broj 7
//		Unesite broj 2
//		Unesite broj:0
//		X je 43720
//
//		Napomena: X u memoriji treba da ima tu vrednost, ne u printu!!!

		Scanner s = new Scanner(System.in);

		int a = 1;
		int broj = 0;

		while (a != 0) {
			System.out.print("Unesite broj: ");
			a = s.nextInt();
			broj = broj * 10 + a;

		}

		System.out.println("Dobijeni broj je " + broj);
		s.close();
	}

}
