import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
	
        
		Human h1 = new Human("Vita");
		Policeman p1 = new Policeman("Mykola");
		Fireman f1 = new Fireman("Tom");
         		
		// Поліцейська машина
        System.out.println("- Police -");
		Police pcar1 = new Police();
		pcar1.setMax(2);
		pcar1.Add(p1);
		pcar1.Add(p1);
        pcar1.Remove("Mykola");
        System.out.println("Size: " + pcar1.getMax());
        System.out.println("Passangers: " + pcar1.CountPassangers());
        System.out.println();
        
		// Пожежна машина	
        System.out.println("- Firetrack -");
		Firetrack fcar1 = new Firetrack();
		fcar1.setMax(3);
		fcar1.Add(f1);
		fcar1.Add(f1);
        fcar1.Remove("Tom");
        System.out.println("Size: " + fcar1.getMax());
        System.out.println("Passangers: " + fcar1.CountPassangers());
        System.out.println();
        
		// Таксі	
        System.out.println("- Taxi -");
        Taxi tcar1 = new Taxi();
        tcar1.setMax(4);
        tcar1.Add(h1);
        tcar1.Add(p1);
        tcar1.Add(f1);
        tcar1.Remove("Mykola");
        System.out.println("Size: " + tcar1.getMax());
        System.out.println("Passangers: " + tcar1.CountPassangers());
        System.out.println();
        
		// Автобус
        System.out.println("- Bus -");
        Bus bcar1 = new Bus();
        bcar1.setMax(4);
        bcar1.Add(h1);
        bcar1.Add(p1);
        bcar1.Add(f1);
        bcar1.Remove("Vita");
        System.out.println("Size: " + bcar1.getMax());
        System.out.println("Passangers: " + bcar1.CountPassangers());
        System.out.println();
        
		// Вулиця
        System.out.println("- Road -");
        Road r1 =new Road();
        r1.addCarToRoad(bcar1);
        r1.addCarToRoad(fcar1);
        r1.addCarToRoad(tcar1);
        r1.RemoveCarFromRoad(tcar1);
        System.out.println("Road: " + r1.getCountOfHumans());        
	}
}
