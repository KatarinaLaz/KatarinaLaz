package d20_8_2021;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {

//		5. (Za vezbanje) Napisati program koji ucitava niz stringova duzine N,
//		tako da ucitavanje elemenata u niz a bude obrnuto. 
//		
//		Primer:
//		Unesite N: 4
//		Unesite string: xxx1
//		Unesite string: xxx4
//		Unesite string: xxx6
//		Unesite string: xxx9
//
//		Niz a: xxx9, xxx6, xxx4, xxx1
//		Komentar: Stanje niza a u memoriji je:
//			a[0]="xxx9",
//			a[1]="xxx6",
//			a[2]="xxx4",
//			a[3]="xxx1",

		Scanner s = new Scanner(System.in);

		String[] niz = { "0", "0", "0", "0", "0" };
		String rec;

		for (int i = niz.length - 1; i >= 0; i--) {
			System.out.print("Unesite rec za niz: ");
			rec = s.next();
			niz[i] = rec;
		}

		System.out.println("Niz: ");
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + ", ");
		}
		s.close();
	}

}
