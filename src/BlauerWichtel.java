
public class BlauerWichtel extends Wichtel{

	public BlauerWichtel() {
		super();
	}

	public BlauerWichtel(String name) {
		super(name);
	}

	public void arbeite(Geschenk g){
		if (g instanceof Spielzeug)
			setDauer((int)(g.schwierigkeit() / 2)); //TODO: Double zu int cast, möglicherweise ein Fehler...
		else
			setDauer((int)g.schwierigkeit + 3);
	}
	
	public String toString(){
		return "Blauer Wichtel "  + this.getName();
	}
}
