package main;

import java.util.ArrayList;

public interface GeneralLocationSvc {
	
	public LongLat getCurrent();
	
	public void getMap(ArrayList<Pin> nearbyPlaces);
	
	public ArrayList<Pin> getNearbyPins(LongLat loc, int radius);
	
	public void putPins(Pin place);

}
