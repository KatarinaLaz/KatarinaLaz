package d23_8_2021;

public class Zadatak4 {

	public static void main(String[] args) {

//		(Za vezbanje )Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//
//		Primer izvrsenja: 
//		izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//		izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1
//
//		Napomena: Resiti bez koriscenja petlji. 

		int m = -4;
		int n = 6;
		brojevi(m, n);

	}

	public static void brojevi(int a, int b) {
		int count = b - a - 1;
		System.out.println("Ima " + count + " celih brojeva izmedju " + a + " i " + b + ".");
	}
}
