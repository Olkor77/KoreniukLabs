
import com.google.gson.Gson;

import nl.jqno.equalsverifier.EqualsVerifier;


public class Main {	

	public static void main(String[] args) {		
		
	 Object t1 = null;	
	 Object t2 = "Hello";
	 
	 //System.out.println(t1);		
	// System.out.println(t2);	
	 
	 String a = "0";

	 
	 
	 
     Person obj1 = new Person("Dmytro", "Varov", 1985);     
     Person obj2 = new Person("Vanya", "Kaidash", 1990);
     Person obj3 = new Person("Vanya", "Kaidash", 1989);
          
     // equals
     if (obj2.equals(obj3)) {
		System.out.println("Rivni");
	 }
     else {
    	 System.out.println("Ne rivni"); 
     }
     
     // ToJson
     String str = ToJson(obj1);	
     System.out.println(str);	
     
     // FromJson
     Person objnew = FromJson(str);
     System.out.println(objnew.getFirstName() + " " + 
     objnew.getLastName() + " " + objnew.GetYear());	
     
     //Equals Verifier, show mistake
     //EqualsVerifier.forClass(Person.class).verify();
     
	}
	
	private static String ToJson(Person obj) {
	     Gson gson = new Gson();
	     String json = gson.toJson(obj);	     
	     return json;	     
	}
	
	private static Person FromJson(String json) {
	    Gson gson = new Gson();
		return gson.fromJson(json, Person.class);  
	}


}
