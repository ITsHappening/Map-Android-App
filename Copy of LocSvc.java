package main;
import java.util.ArrayList;

public class LocSvc implements GeneralLocationSvc {
	private ArrayList<Pin> places;
	
	public LocSvc() {
	this.places=new ArrayList<Pin>();
	}
	
	@Override
	public LongLat getCurrent() {
		// TODO Auto-generated method stub
		
		LongLat loc = new LongLat(1.500,1.600);
		
		return loc;
	}

	@Override
	public void getMap(ArrayList<Pin> nearbyPlaces) {
		// TODO Auto-generated method stub
		this.putPins(new Pin("You Are Here", this.getCurrent()));
		
	}

	@Override
	public ArrayList<Pin> getNearbyPins(LongLat loc, int radius) {
		// TODO Auto-generated method stub
		ArrayList<Pin> retVal = new ArrayList<Pin>();
		for (int i =0; i<this.places.size(); i++) {
			retVal.add(places.get(i));
		}
		
		return retVal;
	}

	@Override
	public void putPins(Pin place) {
		// TODO Auto-generated method stub
		this.places.add(place);
		
	}
}
