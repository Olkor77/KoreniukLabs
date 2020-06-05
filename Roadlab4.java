import java.util.ArrayList;
import java.util.List;

public class Road {
	
	public List<Vehicle> carsInRoad = new ArrayList<>();
	
	public int getCountOfHumans(){
		int count = 0;
		for (int i = 0; i < carsInRoad.size(); i++) { 
		    count += carsInRoad.get(i).CountPassangers();
		}
		return count;
	}
	
	public void addCarToRoad(Vehicle x){
		carsInRoad.add(x);
	}
	
	public void RemoveCarFromRoad(Vehicle x){
		for (int i = 0; i < carsInRoad.size(); i++) { 
		    if(carsInRoad.get(i) == x) {
		    	carsInRoad.remove(x);
		    };
		}
	}
	
}
