package d12_8_2021;

public class Zadatak6 {

	public static void main(String[] args) {

//	(Za vezbanje) Napisati program koji preko dva broja a i b (smatrati da je broj a trocifreni broj, dok je b jednocifreni)
//	formira novu vrednost c tako sto se na mesto druge cifre  broja a postavlja cifra b. 
//	Npr: a = 142, b =  7
//	N kraju c = 172, a = 142, b = 7
//	Za ovaj zadatak ce vam biti potrebani operatori % i /

		int a = 396;
		int b = 7;
		int c;

		c = a - (a % 100) + 10 * b + (a % 10);

		System.out.println("Dobijena cifra je: " + c);

	}

}
