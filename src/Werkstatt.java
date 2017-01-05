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

		geschenke = WerkstattTools.generiereGeschenke(anzahlGeschenke);
		wichtel = WerkstattTools.generiereWichtel(anzahlWichtel);
	}
	
	private Geschenk naechstesGeschenk(){
		if(geschenknummer < geschenke.length)
			return geschenke[geschenknummer++];
		return null;
	}

	private boolean sindAlleFertig() {
		if(geschenknummer < geschenke.length)
		{
			//System.out.print("################################\nGeschenke wurden noch nicht alle bearbeitet. \n");
			return false;
		}

		else
			for(int i = 0; i < wichtel.length; i++){
				if(wichtel[i].arbeitetNoch())
				{
					//System.out.print("################################\nMindestens ein Wichtekl ist noch nicht fertig. \n");
					return false;
				}
			}
		return true;
	}
	
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
	
	private void zeigeLeistungen() {
		System.out.println("----------------------------------------");
		System.out.println("Leistungsindex: ");
		for(int i = wichtel.length - 1; i >= 0; i--) {
			if(i == wichtel.length - 4)
				System.out.println("----------------------------------------");
			Wichtel w = wichtel[i];
			System.out.println(wichtel.length - i + ". Platz: " + w + " mit einer Effizienz von " + w.effizienz() + " GpR.");
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
		
		// TODO e): Klonen der drei besten Wichtel
		// Wichtel roterSuperWichtel = ...;
		// Wichtel blauerSuperWichtel = ...;
		// Wichtel gelberSuperWichtel = ...;
	}
	
}