
public class Spielzeug extends Geschenk{

	private double spannung;
	
	public Spielzeug(){
		super(Zufall.spielzeug(), 10);
		spannung = (double)(schwierigkeit()*name().length()/10);
	}
	
	public String toString(){
		return name + " [" + schwierigkeit + "]" + "(Spannung: " + spannung + ")";
	}
}
