
public class Essbares extends Geschenk{

	private String gesund;
	public Essbares(){
		super(Zufall.essbares(), 15);
		gesund = (int)(schwierigkeit())%2==0?"ja":"nein";
	}
	
	public String toString(){
		return name + " [" + schwierigkeit + "]" + "(Gesund :" + gesund + ")";
	}
}
