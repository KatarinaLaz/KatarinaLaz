package d12_8_2021;

public class Zadatak3 {

	public static void main(String[] args) {

//	Napisati program koji racuna x po formuli. Vrednosti a, b i c su poznate vrednosti vece od nule. X JE REALAN BROJ!
//	x = a+ba+c 1cb + a

		int a = 2;
		int b = 3;
		int c = 4;
		double x;

		x = (1.0 * (a + b) / (a + c)) * (1.0 / (c * b + a));

		System.out.println("x je jednako " + x);

	}

}
