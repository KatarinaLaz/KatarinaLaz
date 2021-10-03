package d20_8_2021;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {

//		3. Napisati program koji ucitava niz A duzine N i broj X.
//		Nakon unosa treba ispisati indekse onih clanova niza koji su jednaki broju X
//		
//		Primer izvrsenja:
//		Unesite broj: 1
//		Unesite broj: 3
//		Unesite broj: 7
//		Unesite broj: 3
//		Unesite broj: 9
//		Unesite X: 3
//
//		Rezultat: Elementi niza A koji su jednaki broju X imaju indekse: 
//		1, 3

		Scanner s = new Scanner(System.in);

		int[] niz = { 0, 0, 0, 0, 0 };
		System.out.println("Unesite broj koj zelite da izvucete iz niza: ");
		int x = s.nextInt();
		int a;

		for (int i = 0; i < niz.length; i++) {
			System.out.print("Unesite broj za niz: ");
			a = s.nextInt();
			niz[i] = a;
		}
		System.out.print("Elementi niza koji su jedanki broju x imaju indekse: ");
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] == x) {
				System.out.print(i + ", ");
			}
		}
		s.close();
	}

}
