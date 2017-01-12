
public class GelberWichtel extends Wichtel{
	
	/**
	 * Erzeugen eines Wichtels mit zufälligem Namen
	 */
	public GelberWichtel(){
		super();
	}

	/**
	 * Benötigt für die Kopie eines Wichtels
	 * @param wichtel Wichtel der kopiert werden soll
	 */
	public GelberWichtel(GelberWichtel wichtel) { super(wichtel);}
	
	/**
	 * Wichtel mit selbst eingegebenen Namen erzeugen
	 * @param name Name des Wichtels
	 */
	public GelberWichtel(String name){
		super(name);
	}
	
	/**
	 * Vorschrift, wie ein Wichtel ein Geschenk bearbeiten soll
	 * @param g Geschenk an dem der Wichtel arbeiten soll
	 */
	public void arbeite(Geschenk g){
		setGeschenkeGefertigt(getGeschenkeGefertigt() + 1);
		if (g instanceof Kleidung){
			setDauer((int)Math.round(g.schwierigkeit())+2);
		} else {
			setDauer((int)Math.round(g.schwierigkeit())+1);
		}
	}

	/**
	 * Ausgabe der Farbe und des Namens eines Wichtels
	 */
	public String toString(){
		return "Gelber Wichtel "  + this.getName();
	}
	
}
