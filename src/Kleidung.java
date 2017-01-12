
public class Kleidung extends Geschenk{

	private int eleganz;
	
	/***
	 * Erzeugt ein Geschnek der Kategorie Kleidung mit Zufälligen Namen, der Schwierigkeit 5 und eleganz
	 */
	public Kleidung(){
		super(Zufall.kleidung(), 5);
		eleganz = name().length();
	}
	
	/**
	 * Gibt den Namen, die Schwierigkeit und die Eleganz als String zurück
	 */
	public String toString(){
		return name + " [" + schwierigkeit + "]" + "(Eleganz: " + eleganz + ")";
	}
}
