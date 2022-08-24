package Entity.Composite;
import java.util.ArrayList;
import java.util.List;

public class DetailsEmployee {
   private String name;
   private String dept;
   private int id;
   private String location;
   private String email;
   private List<DetailsEmployee> subordinates;

   // constructor

   public DetailsEmployee(String name, String dept, int id, String location, String email) {
	super();
	this.name = name;
	this.dept = dept;
	this.id = id;
	this.location = location;
	this.email = email;
	subordinates = new ArrayList<DetailsEmployee>();
}

public void add(DetailsEmployee e) {
      subordinates.add(e);
   }

   public void remove(DetailsEmployee e) {
      subordinates.remove(e);
   }

   public List<DetailsEmployee> getSubordinates(){
     return subordinates;
   }

   public String toString(){
      return ("Employee :[ Name : " + name + ", Dept : " + dept + ", Id :" + id + ", Location " + location + ",Email" + email  + " ]");
   }   
}
