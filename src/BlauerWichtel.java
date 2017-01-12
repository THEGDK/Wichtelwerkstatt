
public class BlauerWichtel extends Wichtel{

	/**
	 * Erzeugen eines Wichtels mit zufälligem Namen
	 */
	public BlauerWichtel() {
		super();
	}

	/**
	 * Benötigt für die Kopie eines Wichtels
	 * @param wichtel Wichtel der kopiert werden soll
	 */
	public BlauerWichtel(BlauerWichtel wichtel) { super(wichtel);}

	/**
	 * Wichtel mit selbst eingegebenen Namen erzeugen
	 * @param name Name des Wichtels
	 */
	public BlauerWichtel(String name) {
		super(name);
	}

	
	/**
	 * Vorschrift, wie ein Wichtel ein Geschenk bearbeiten soll
	 * @param g Geschenk an dem der Wichtel arbeiten soll
	 */
	public void arbeite(Geschenk g){
		setGeschenkeGefertigt(getGeschenkeGefertigt() + 1);
		if (g instanceof Spielzeug)
			setDauer((int)Math.round(g.schwierigkeit() / 2));
		else
			setDauer((int)Math.round(g.schwierigkeit()) + 3);
	}
	
	/**
	 * Ausgabe der Farbe und des Namens eines Wichtels
	 */
	public String toString(){
		return "Blauer Wichtel "  + this.getName();
	}
}
