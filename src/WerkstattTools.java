
public class WerkstattTools {

	public static Geschenk[] generiereGeschenke(int anzahlGeschenke) {
		int anzahl = anzahlGeschenke;
		Geschenk[] ausgabe = new Geschenk[anzahl];
		
		for (int i = 0; i < anzahl; i++){
			int art = Zufall.zahl(4);
			switch(art){
			case 0: ausgabe[i] = new Geschenk(Zufall.geschenkartikel(), (int)(Math.random()*100)+1); break;
			case 1: ausgabe[i] = new Kleidung(); break;
			case 2: ausgabe[i] = new Essbares(); break;
			case 3: ausgabe[i] = new Spielzeug(); break;
			}
			
		}
		
		return ausgabe;
	}

	public static Wichtel[] generiereWichtel(int anzahlWichtel) {
		int anzahl = anzahlWichtel;
		Wichtel[] ausgabe = new Wichtel[anzahl];
		
		for (int i = 0; i < anzahl; i++){
			int art = Zufall.zahl(3);
			switch(art){
			case 0: ausgabe[i] = new GelberWichtel(); break;
			case 1: ausgabe[i] = new BlauerWichtel(); break;
			case 2: ausgabe[i] = new RoterWichtel(); break;
			}
			
		}
		
		return ausgabe;
	}

}
