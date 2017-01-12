import java.io.*;
import java.util.*;

public class Werkstatt {
	
	private final int anzahlGeschenke = 1000;
	private final int anzahlWichtel = 30;
	
	// Die gesamte Wunschliste
	private Geschenk[] geschenke;
	
	// derzeitig bearbeitetes Geschenk
	private int geschenknummer = 0;
	
	// Alle arbeitenden Wichtel
	private Wichtel[] wichtel;
	
	// Basiszeiteinheit der Wichtel
	private int runde = 1;
	
	
	public Werkstatt(){
		
		// Wir leiten die ganze Ausgabe in eine Datei um.
		try{
			System.setOut(new PrintStream(new FileOutputStream("Werkstattlog.txt")));	
		}
		catch (Exception e) {System.out.println(e);}

		//Generiert geschenke und Wichtel
		geschenke = WerkstattTools.generiereGeschenke(anzahlGeschenke);
		wichtel = WerkstattTools.generiereWichtel(anzahlWichtel);
	}
	
	/**
	 * gibt das nächste zu bearbeitende Geschenk zurück
	 * @return nächstes Geschenk
	 */
	private Geschenk naechstesGeschenk(){
		if(geschenknummer < geschenke.length)
			return geschenke[geschenknummer++];
		return null;
	}

	/**
	 * Gibt Wahrheitswert wahr zurück, wenn alle Wichtel fertig sind.
	 * @return true wenn alle fertig sind, false andernfalls 
	 */
	private boolean sindAlleFertig() {
		if(geschenknummer < geschenke.length)
		{
			System.out.print("################################\nGeschenke wurden noch nicht alle bearbeitet. \n");
			return false;
		}

		else
			for(int i = 0; i < wichtel.length; i++){
				if(wichtel[i].arbeitetNoch())
				{
					System.out.print("################################\nMindestens ein Wichtekl ist noch nicht fertig. \n");
					return false;
				}
			}
		return true;
	}
	
	/**
	 * Lässt alle Wichtel arbeiten
	 * @return Solange true, bis keine Geschenke mehr zu bearbeiten sind
	 */
	private boolean arbeit() {
		System.out.println("----------------------------------------");
		System.out.println("Runde " + runde++);
		for(int i = 0; i < wichtel.length; i++){
			Wichtel w = wichtel[i];
			if(w.arbeitetNoch())
				w.arbeiteWeiter();
			else {
				int gNr = geschenknummer;
				Geschenk g = naechstesGeschenk();
				if(g != null) {
					System.out.println(w + " bearbeitet nun #" + gNr + " \n --> " + g);
					w.arbeite(g);
					
				}
			}
		}	
		return !sindAlleFertig();
	}
	
	/**
	 * Zeigt die Leistung der einzelnen Wichtel
	 */
	private void zeigeLeistungen() {
		System.out.println("----------------------------------------");
		System.out.println("Leistungsindex: ");
		for(int i = wichtel.length - 1; i >= 0; i--) {
			if(i == wichtel.length - 4)
				System.out.println("----------------------------------------");
			Wichtel w = wichtel[i];
			System.out.println(wichtel.length - i + ". Platz: " + w + " mit einer Effizienz von " + (double)(w.effizienz()) + " GpR.");
		}
	}
	
	private void sortiere(){
		Arrays.sort(wichtel);
	}
	
	// Eine Werkstatt wird angelegt, dann werden alle Geschenke bearbeitet, 
	// bis die Liste durch ist. Dann sortieren wir die Wichtel nach Effizienz
	// und geben sie entsprechend aus.
	// Momentan auskommentiert, sollte am Schluss alles kompilieren und dem Logfile gleichen.
	// Erstellen Sie bis dahin eigenen Testaufrufe von Methoden.
	public static void main(String[] args) {
		 Werkstatt werkstatt = new Werkstatt();
		 while(werkstatt.arbeit());
		 werkstatt.sortiere();
		 werkstatt.zeigeLeistungen();
		
		 Wichtel[] w = werkstatt.wichtel;
		 
		 Wichtel gelberSuperWichtel = null;
		 Wichtel blauerSuperWichtel = null;
		 Wichtel roterSuperWichtel = null;
		 
		 // Die Liste wird von unten nach oben durchgegangen. Somit ist der Letzte Wichtel der effizienteste seiner Farbklasse
		 for (int i = w.length-1; i > 0; i--){
			 if (roterSuperWichtel == null && w[i] instanceof RoterWichtel) {
			 	roterSuperWichtel = new RoterWichtel((RoterWichtel) w[i]);
			 }

			 if (blauerSuperWichtel == null && w[i] instanceof BlauerWichtel) {
			 	blauerSuperWichtel = new BlauerWichtel((BlauerWichtel)w[i]);
			 }

			 if (gelberSuperWichtel == null && w[i] instanceof GelberWichtel) {
			 	gelberSuperWichtel = new GelberWichtel((GelberWichtel)w[i]);
			 }
		 }
	}
	
}