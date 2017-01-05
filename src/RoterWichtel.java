
public class RoterWichtel extends Wichtel{

	public RoterWichtel() {
		super();
	}

	public RoterWichtel(String name) {
		super(name);
	}
	
	public void arbeite(Geschenk g){
		setGeschenkeGefertigt(getGeschenkeGefertigt() + 1);

		if (g instanceof Spielzeug)
			setDauer((int)Math.round(g.schwierigkeit()));
		else
			setDauer((int)Math.round(g.schwierigkeit()) - 2);
	}
	
	public String toString(){
		return "Roter Wichtel "  + this.getName();
	}
	
}
