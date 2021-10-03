package d23_8_2021;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {

//		(Za vezbanje)Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
//		U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.

		Scanner s = new Scanner(System.in);

		System.out.print("Unesite prvi broj: ");
		int a = s.nextInt();
		System.out.print("Unesite drugi broj: ");
		int b = s.nextInt();
		System.out.print("Unesite treci broj: ");
		int c = s.nextInt();

		int najmanjiBroj = najmanji(a, b, c);
		System.out.println("Najmanji od ova tri broja je " + najmanjiBroj);
		
		s.close();

	}

	public static int najmanji(int a, int b, int c) {
		int najmanjiBroj;
		if (a < b && a < c) {
			najmanjiBroj = a;
			return najmanjiBroj;
		} else if (b < c) {
			najmanjiBroj = b;
			return najmanjiBroj;
		} else {
			najmanjiBroj = c;
			return najmanjiBroj;
		}
	}

}
