
public class Kleidung extends Geschenk{

	private int eleganz;
	
	public Kleidung(){
		super(Zufall.kleidung(), 5);
		eleganz = name().length();
	}
	
	public String toString(){
		return name + " [" + schwierigkeit + "]" + "(Eleganz: " + eleganz + ")";
	}
}
