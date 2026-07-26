import java.util.LinkedHashMap;
import java.util.Map;

public class VisitorHashMap {
  private static final int MAX_VISITORS = 5; //define the capacity of the list
private LinkedHashMap<String, String> visitors;

public VisitorHashMap() {
  visitors = new LinkedHashMap<>();
}
// adding a visitor, for linkedHashMap put operation is O(1)
public void addVisitor(String visitorName, String visitTime) {
  //this if is to check if the name is already in the list
   if (visitors.containsKey(visitorName)) {
     visitors.remove(visitorName); //here it will delet it to be able to add it at last one
   }
  
