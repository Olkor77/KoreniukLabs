import java.util.ArrayList;
import java.util.List;

public class Bus extends Vehicle {
	
	private List<Human> list;
	
    public Bus() {
		list = new ArrayList<>();
	}

	public void Add(Human x) {   
		if (getMax() > list.size()) {
			list.add(x);
			AddPassangers();
		} else {
			throw new NullPointerException("No seat. Wait another vehicle!"); 
		}    	
    }
	
	public void Remove(String x) { 
		
		for (int i = 0; i < list.size(); i++) { 
			if (list.get(i).name.equals(x)) {
				list.remove(i);
				System.out.println(x + " is get off!");
				MinusPassangers();
				return;
			}		
		}		

		throw new NullPointerException("No passanger with this name");  	
    }
	
	
}
