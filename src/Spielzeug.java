
public class Spielzeug extends Geschenk{

	private double spannung;
	
	/**
	 * Erzeugt ein Geschenk der Kategorie Spielzeug mit zuf�lligem Namen, der Schwierigkeit 10 und belegt das Attribut Spannung mit einem Wert
	 */
	public Spielzeug(){
		super(Zufall.spielzeug(), 10);
		spannung = (double)(schwierigkeit()*name().length()/10);
	}
	
	/**
	 * Gibt den Namen, die Schwierigkeit und die Spannung zur�ck
	 */
	public String toString(){
		return name + " [" + schwierigkeit + "]" + "(Spannung: " + spannung + ")";
	}
}
