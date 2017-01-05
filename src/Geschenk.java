
public class Geschenk {

	protected String name;
	protected double schwierigkeit;
	
	public Geschenk(){
		name = Zufall.geschenkartikel();
		schwierigkeit = Zufall.schwierigkeit(25);
	}
	
	public Geschenk(String name, int maxSchwierigkeit){
		this.name = name;
		schwierigkeit = Zufall.schwierigkeit(maxSchwierigkeit);
	}
	
	public String name(){
		return name;
	}
	
	public double schwierigkeit(){
		return schwierigkeit;
	}
	
	public String toString(){
		return name + " [" + schwierigkeit + "]";
	}
}
