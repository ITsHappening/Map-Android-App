package main;

public class LongLat {
	
	private double longitude;
	private double latitude;
	
	public LongLat(double longitude, double latitude) {
		this.latitude=latitude;
		this.longitude=longitude;
	}
	
	public double getLng() {
		return this.longitude;
	}
	
	public double getLat() {
		return this.latitude;
	}
}
