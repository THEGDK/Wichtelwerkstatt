
public class Musiker{
	
	private String name;
	private static int anzahl = 0;
	
	private Musiker(String name){
		this.name = name;
	}
	
	public static Musiker erstelleMusiker(String name) throws IndexOutOfBoundsException{
		if (anzahl>=4){
			throw new IndexOutOfBoundsException("Zu viele Musiker erstellt!");
		} else 
		anzahl++;
		return new Musiker(name);
	}

}
