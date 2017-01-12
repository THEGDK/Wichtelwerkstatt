
public class Geschenk {

	protected String name;
	protected double schwierigkeit;
	
	/**
	 * Erzeugt ein Geschenk mit einem zufällifgem Namen und Schierigkeit
	 */
	public Geschenk(){
		name = Zufall.geschenkartikel();
		schwierigkeit = Zufall.schwierigkeit(25);
	}
	
	/**
	 * Erzeugt ein Geschenk
	 * @param name Name des Geschenks
	 * @param maxSchwierigkeit Schwierigkeit des Geschenks
	 */
	public Geschenk(String name, int maxSchwierigkeit){
		this.name = name;
		schwierigkeit = Zufall.schwierigkeit(maxSchwierigkeit);
	}
	
	/**
	 * Getter des Namen des Geschnk
	 * @return Name des Geschenks
	 */
	public String name(){
		return name;
	}
	
	/**
	 * Getter der Schwierigkeit des Geschenks
	 * @return Schwierigkeit des Geschenks
	 */
	public double schwierigkeit(){
		return schwierigkeit;
	}
	
	/**
	 * Gibt Name und Schwierigkeit zurück
	 */
	public String toString(){
		return name + " [" + schwierigkeit + "]";
	}
}
