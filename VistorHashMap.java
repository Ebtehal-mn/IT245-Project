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
  //check if the visitor name is already exisist in the list
   if (visitors.containsKey(visitorName)) {
     visitors.remove(visitorName); //remove it so it can be added again as most recent visitor 
   }
  //if the list reaches its maximum capcaity, remove the oldest visitor
  if (visitor.size() >= MAX_VISITORS) {
    String oldestKey = visitors.KeySet().iterator().next();
    visitors.remove(oldestKey); // remove the oldest visitor from the list 
  }
