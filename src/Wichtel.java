
public abstract class Wichtel implements Comparable<Wichtel>{
	private String name;
	private int gearbeiteteZeit;
	private int geschenkeGefertigt;
	private int dauer;
	

	public Wichtel(){
		this.name = Zufall.koboldname();
	}
	
	public Wichtel(String name){
		this.name = name;
	}

	public Wichtel(Wichtel other) {
		name = other.name;
		gearbeiteteZeit = other.gearbeiteteZeit;
		geschenkeGefertigt = other.geschenkeGefertigt;
		dauer = other.dauer;
	}


	public int getGeschenkeGefertigt() {
		return geschenkeGefertigt;
	}


	public void setGeschenkeGefertigt(int geschenkeGefertigt) {
		this.geschenkeGefertigt = geschenkeGefertigt;
	}


	public int getGearbeiteteZeit() {
		return gearbeiteteZeit;
	}


	public void setGearbeiteteZeit(int gearbeiteteZeit) {
		this.gearbeiteteZeit = gearbeiteteZeit;
	}


	public int getDauer() {
		return dauer;
	}


	public void setDauer(int dauer) {
		this.dauer = dauer;
	}


	public String getName() {
		return name;
	}
	
	public String toString(){
		return name;
	}

	public boolean arbeitetNoch() {
		return dauer > 0;
	}

	public void arbeiteWeiter() {
		// TODO Auto-generated method stub
		gearbeiteteZeit++;
		dauer--; //TODO fertig
	}

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
	 * @return Eine negative Zahl, falls die Effizienz von o größer als die von diesem Wichtel ist,
	 * 0, falls sie gleich effizient sind und
	 * eine positive Zahl, falls die Effizienz von diesem Wichtel größer als die von o ist.
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
