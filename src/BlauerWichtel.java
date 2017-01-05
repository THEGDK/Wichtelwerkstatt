
public class BlauerWichtel extends Wichtel{

	public BlauerWichtel() {
		super();
	}

	public BlauerWichtel(String name) {
		super(name);
	}

	public void arbeite(Geschenk g){
		if (g instanceof Spielzeug)
			setDauer((int)Math.round(g.schwierigkeit() / 2));
		else
			setDauer((int)Math.round(g.schwierigkeit()) + 3);
	}
	
	public String toString(){
		return "Blauer Wichtel "  + this.getName();
	}
}
