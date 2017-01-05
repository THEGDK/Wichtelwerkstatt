
public class RoterWichtel extends Wichtel{

	public RoterWichtel() {
		super();
	}

	public RoterWichtel(String name) {
		super(name);
	}
	
	public void arbeite(Geschenk g){
		if (g instanceof Spielzeug)
			setDauer((int)Math.round(g.schwierigkeit()));
		else
			setDauer((int)Math.round(g.schwierigkeit()) - 2);
	}
	
	public String toString(){
		return "Roter Wichtel "  + this.getName();
	}
	
}
