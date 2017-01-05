
public class GelberWichtel extends Wichtel{
	
	public GelberWichtel(){
		super();
	}

	public GelberWichtel(GelberWichtel wichtel) { super(wichtel);}
	
	public GelberWichtel(String name){
		super(name);
	}
	
	public void arbeite(Geschenk g){
		setGeschenkeGefertigt(getGeschenkeGefertigt() + 1);
		if (g instanceof Kleidung){
			setDauer((int)Math.round(g.schwierigkeit())+2);
		} else {
			setDauer((int)Math.round(g.schwierigkeit())+1);
		}
	}

	public String toString(){
		return "Gelber Wichtel "  + this.getName();
	}
	
}
