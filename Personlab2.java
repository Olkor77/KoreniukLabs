
public class Person {
	
     private String FirstName;
     private String LastName;
     private int year;
     
     public Person(String n1, String n2, int y) {
    	 FirstName = n1;
    	 LastName = n2;
    	 year = y;
     }
     
     public String getFirstName() {
    	 return FirstName;
     }
     
     public String getLastName() {
    	 return LastName;
     }
     
     public int GetYear() {
    	 return year;
     }
     
     public boolean equals(Object obj) { 

    	   // однакові адреси
    	   //if (obj == this) { return true; }   
    	 
    	   // перевірка на null
    	   if (obj == null) { return false; } 

    	   // чи об'єкти одного типу
    	   if (obj.getClass() != this.getClass()) { return false; } 

    	   // створюємо наш об'єкт
    	   Person guest = (Person) obj;   	   

    	   if(year != guest.year) {
    		   return false;    		   
    	   }

    		   
    	   // для рядків додаткова перевірка
    	   if (FirstName != guest.FirstName
    	            || !(FirstName != null && FirstName.equals(guest.FirstName)))
    	   { 
    		   return false;
    	   }
    	   // для рядків додаткова перевірка
    	   if (LastName != guest.LastName
    	            || !(LastName != null && LastName.equals(guest.LastName)))
    	   { 
    		   return false;
    	   }
    	   
    	   return true;
    	}
}
