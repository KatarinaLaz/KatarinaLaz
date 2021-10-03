package d13_8_2021;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {

//		3. Napisati program koji ucitava stranicu jednakostranicnog trougla preko Scanner-a i ispisuje povrsinu i obim trougla.
//		Koren iz tri neka bude konstanta 1.73
//		Primer izvrsenja programa:
//		Unesite stranicu trougla: 10
//		Povrsina je 43.25
//		Obim je 30

		Scanner s = new Scanner(System.in);

		double korenIzTri = 1.73;

		System.out.print("Unesite stranicu trougla: ");
		int stranica = s.nextInt();

		int obim = 3 * stranica;
		double povrsina = (stranica * stranica * korenIzTri) / 4;

		System.out.println("Povrsina je " + povrsina);
		System.out.println("Obima je " + obim);

		s.close();
	}

}
