
public class RoterWichtel extends Wichtel{

	/**
	 * Wichtel mit zufälligem Namen erzeugen
	 */
	public RoterWichtel() {
		super();
	}

	/**
	 * Wichtel mit selbst eingegebenen Namen erzeugen
	 * @param name Name des Wichtels
	 */
	public RoterWichtel(String name) {
		super(name);
	}

	/**
	 * Benötigt für die Kopie eines Wichtels
	 * @param wichtel Wichtel der kopiert werden soll
	 */
	public RoterWichtel(RoterWichtel wichtel) {
		super(wichtel);
	}
	
	/**
	 * Vorschrift, wie ein Wichtel ein Geschenk bearbeiten soll
	 * @param g Geschenk an dem der Wichtel arbeiten soll
	 */
	public void arbeite(Geschenk g){
		setGeschenkeGefertigt(getGeschenkeGefertigt() + 1);

		if (g instanceof Spielzeug)
			setDauer((int)Math.round(g.schwierigkeit()));
		else
			setDauer((int)Math.round(g.schwierigkeit()) - 2);
	}
	
	/**
	 * Ausgabe der Farbe und des Namens eines Wichtels
	 */
	public String toString(){
		return "Roter Wichtel "  + this.getName();
	}
	
}
