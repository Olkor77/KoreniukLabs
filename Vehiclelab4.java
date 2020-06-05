
public class Vehicle {
	
	//властивостi
	private int max;
	private int passangers;
	
	//Конструктор задає початкові значення властивостям
	public Vehicle() {
		passangers = 0;
		max = 0;
	}
	
	//методи:
	public void setMax(int a) {
		if(a >= 0 && a < 2000) {			
			max = a;
		}		
	}		
	
	public int getMax() {
        return max;		
	}	
	
	protected void AddPassangers() {
        passangers++;
	}	
	
	protected void MinusPassangers() {
        passangers--;
	}
	
	public int CountPassangers() {
        return passangers;
	}	


}
