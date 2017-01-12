
public class WerkstattTools {

	/**
	 * Generiert eine angegebene Anzahl an Geschenken
	 * @param anzahlGeschenke Anzahl der zu generierenden Geschenke
	 * @return gefülltes GeschenkArray mit anzahlGeschnenke Elemente
	 */
	public static Geschenk[] generiereGeschenke(int anzahlGeschenke) {
		//Erzeugt Geschenke Array
		int anzahl = anzahlGeschenke;
		Geschenk[] ausgabe = new Geschenk[anzahl];
		
		//Jedes Geschenk wird einer Zufälligen Kategorie zugeordnet
		for (int i = 0; i < anzahl; i++){
			int art = Zufall.zahl(4);
			switch(art){
			case 0: ausgabe[i] = new Geschenk(Zufall.geschenkartikel(), 25); break;
			case 1: ausgabe[i] = new Kleidung(); break;
			case 2: ausgabe[i] = new Essbares(); break;
			case 3: ausgabe[i] = new Spielzeug(); break;
			}
			
		}
		
		return ausgabe;
	}

	/**
	 * Erzeugt zufällige Wichtel
	 * @param anzahlWichtel Anzahl der Wichtel die Erzeugt werden sollen
	 * @return gefülltes Array mit Wichteln
	 */
	public static Wichtel[] generiereWichtel(int anzahlWichtel) {
		int anzahl = anzahlWichtel;
		Wichtel[] ausgabe = new Wichtel[anzahl];
		
		//Erzeugt für jeden Eintrag in ausgabe einen zufällig generierten Wichtel
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
