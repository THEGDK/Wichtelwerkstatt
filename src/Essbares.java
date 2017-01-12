
public class Essbares extends Geschenk{

	private String gesund;
	
	/**
	 * Erzeugt ein Essbares Geschenk
	 */
	public Essbares(){
		super(Zufall.essbares(), 15);
		gesund = (int)(schwierigkeit())%2==0?"ja":"nein";
	}
	
	/**
	 * Ausgabe des Geschneks mit name schwierigkeit und dem Attribut gesund
	 */
	public String toString(){
		return name + " [" + schwierigkeit + "]" + "(Gesund :" + gesund + ")";
	}
}
