package d26_8_2021;

public class SmartAirConditioning {

//	atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//	atribut za potrosnju elektricne energije dok hladi (npr 1kW/h)
//	atribut za potrosnju elektricne energije dok greje (npr 2kW/h)
//	atribut za izabranu temperaturu (minimum je 16, maksimum 35)
//	atribut za mod (hladi/greje)

		public String marka;
		public int potrosnjaDokHladi;
		public int potrosnjaDokGreje;
		public int temperatura;
		public String mod;
	
//	1. metodu za stampu - stampa u formatu 
//	marka - mod - termperatura
	
		public void stampa() {
		System.out.println(this.marka + " - " + this.mod + " - " + this.temperatura + "°C");
		}
	
//	2. metodu koja racuna mesecnu potrosnju u kW/h, po formuli:
//	30 * 15 * potrosnja po satu ( zavisi da li greje ili hladi)
	
		public int mesecnaPotrosnja() {
			int potrosnja = 0;
			if (this.mod.equals("hladi")) {
				potrosnja = 30 * 15 * this.potrosnjaDokHladi;
			} else {
				potrosnja = 30 * 15 * this.potrosnjaDokGreje;
			}
			return potrosnja;
		}
		
//	3. metodu koja racuna koliko klima novca potrosi za mesec dana
//	Prvih 350 kW/h su u zelenoj zoni i 1 kW/h kosta 6din
//	Sve ostalo se racuna kao u plavoj zoni, gde 1kW/h kosta 9 dinara
//	Metoda vraca ukupnu cenu za taj mesec
	
		public int mesecniTrosak() {
			int trosak = 0;
			if (this.mod.equals("hladi")) {
				for (int i = 0; i < 30 * 15 * this.potrosnjaDokHladi; i++) {
					if (i <= 350) {
						trosak = trosak + 6;
					} else {
						trosak = trosak + 9;
					}
				}
			} else {
				for (int i = 0; i < 30 * 15 * this.potrosnjaDokGreje; i++) {
					if (i <= 350) {
						trosak = trosak + 6;
					} else {
						trosak = trosak + 9;
					}
				}
			}
			return trosak;
		}	
	
	
}
