
public class Kleidung extends Geschenk{

	private int eleganz;
	
	/***
	 * Erzeugt ein Geschnek der Kategorie Kleidung mit Zuf�lligen Namen, der Schwierigkeit 5 und eleganz
	 */
	public Kleidung(){
		super(Zufall.kleidung(), 5);
		eleganz = name().length();
	}
	
	/**
	 * Gibt den Namen, die Schwierigkeit und die Eleganz als String zur�ck
	 */
	public String toString(){
		return name + " [" + schwierigkeit + "]" + "(Eleganz: " + eleganz + ")";
	}
}
