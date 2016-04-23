package main;

public class Pin {
	
	private String name;
	private LongLat place;
	private String description="";
	
	public Pin(String name, LongLat place) {
		this.name=name;
		this.place=place;
	}
	
	public Pin(String name, LongLat place, String description) {
		this.name=name;
		this.place=place;
		this.description = description;
	}
	
	public String getName(){
		return this.name;
	}
	
	public LongLat getPlace() {
		return this.place; 
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public String toString() {
		String toPrintOut= name + ": LONGITUDE " + place.getLng() +" LATITUDE "+ place.getLat() + "\n"+ description;
		return toPrintOut;
	}
}
