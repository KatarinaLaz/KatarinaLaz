package d23_8_2021;

public class Zadatak2 {

	public static void main(String[] args) {

//		Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije vraca novu vrednost koja se formira kao na primeru:
//			ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//			ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.
//		
		int a = 3;
		int b = 5;

		int rezultat = noviBroj(a, b);
		System.out.println(rezultat);

	}

	public static int noviBroj(int a, int b) {
		int rezultat = a * 10 + b;
		return rezultat;
	}

}
