
public abstract class Wichtel implements Comparable<Wichtel>{
	private String name;
	private int gearbeiteteZeit;
	private int geschenkeGefertigt;
	private int dauer;
	
	/**
	 * Erzeugt einen Wichtel mit zuf�lligem Namen
	 */
	protected Wichtel(){
		this.name = Zufall.koboldname();
	}
	
	/**
	 * Erzeugt einen Wichtel mit vorgegebenen Namen
	 * @param name
	 */
	protected Wichtel(String name){
		this.name = name;
	}

	/**
	 * Erzeugt eine Kopie des Wichtels other
	 * @param other zu kopierender Wichtel
	 */
	protected Wichtel(Wichtel other) {
		name = other.name;
		gearbeiteteZeit = other.gearbeiteteZeit;
		geschenkeGefertigt = other.geschenkeGefertigt;
		dauer = other.dauer;
	}


	/**
	 * Gibt zur�ck, wie viele Geschenke gefertig wurden
	 * @return Anzahl gefertigter Geschenke
	 */
	public int getGeschenkeGefertigt() {
		return geschenkeGefertigt;
	}

	/**
	 * Setze das Attribut geschenkeGefertig auf einen neuen Wert
	 * @param geschenkeGefertigt neuer Wert
	 */
	public void setGeschenkeGefertigt(int geschenkeGefertigt) {
		this.geschenkeGefertigt = geschenkeGefertigt;
	}

	/**
	 * Gibt die gearbeitete Zeit zur�ck
	 * @return gearbeitete Zeit
	 */
	public int getGearbeiteteZeit() {
		return gearbeiteteZeit;
	}

	/**
	 * Setzen des Attributs gearbeiteteZeit
	 * @param gearbeiteteZeit neuer Wert
	 */
	public void setGearbeiteteZeit(int gearbeiteteZeit) {
		this.gearbeiteteZeit = gearbeiteteZeit;
	}

	/**
	 * Gibt den Wert des Attributs dauer zur�ck
	 * @return Wert des Attributs dauer
	 */
	public int getDauer() {
		return dauer;
	}

	/**
	 * Setter des Attributs dauer 
	 * @param dauer neuer Wert
	 */
	public void setDauer(int dauer) {
		this.dauer = dauer;
	}

	/**
	 * Getter des Attributs Name
	 * @return Name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Gibt den Namen des Wichtels zur�ck
	 * @return name
	 */
	public String toString(){
		return name;
	}

	/**
	 * Gibt zur�ck, ob ein Wichtle noch arbeitet
	 * @return true wenn er noch arbeitet, false andernfalls
	 */
	public boolean arbeitetNoch() {
		return dauer > 0;
	}

	/**
	 * Ein Arbeitsschritt des Wichtels
	 */
	public void arbeiteWeiter() {
		gearbeiteteZeit++;
		dauer--;
	}

	//Jeder Wichtel arbeitet anders
	public abstract void arbeite(Geschenk g);

	/**
	 * Berechnet die Effizienz eines Wichtels.
	 * @return Gibt die Effizienz als Ganzzahl zurück.
	 */
	public double effizienz() {
		return (double)(geschenkeGefertigt) / gearbeiteteZeit;
	}

	/**
	 * Implementation des Comparable<Wichtel> Interfaces. Vergleicht dieses Objekt mit einem anderen Wichtel.
	 *
	 * @param o Der zu vergleichende Wichtel
	 * @return Eine negative Zahl, falls die Effizienz von o gr��er als die von diesem Wichtel ist,
	 * 0, falls sie gleich effizient sind und
	 * eine positive Zahl, falls die Effizienz von diesem Wichtel gr��er als die von o ist.
	 */
	public int compareTo(Wichtel o) {
		if (effizienz() - o.effizienz() < 0){
			return -1;
		}
		if (effizienz() - o.effizienz() > 0){
			return 1;
		}
		return 0;
	}
}
