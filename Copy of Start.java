package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Start {

	public static void main(String args[]) throws FileNotFoundException {
		GeneralLocationSvc p = new LocSvc();
		Scanner database= new Scanner(new File("data.txt"));
		String literallyEverything="";
		int j=0;
		while(database.hasNext()) {
			if(j!=0) {
				literallyEverything=literallyEverything+"/;;;/"+database.nextLine();
			} else {
				literallyEverything=database.nextLine();
			}
			j++;
		}
		String[] sepPins = literallyEverything.split("/;;;/");
		String[] pin = null;
		for(int i=0; i<sepPins.length; i++) {
			pin = sepPins[i].split(",");
			String name = pin[0];
			double lng = Double.parseDouble(pin[1]);
			double lat = Double.parseDouble(pin[2]);
			String desc = pin[3];
			p.putPins(new Pin(name, new LongLat(lng,lat),desc));
		}
		
		ArrayList<Pin> pins = p.getNearbyPins(null, 0);
		for(int i=0; i<pins.size();i++) {
			
			System.out.println(pins.get(i).toString());
		}
	}

	
	
}
