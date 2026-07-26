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
  visitors.put(visitorName, visitTime);//add the visitor to the list
  System.out.prinln(visitorName + " was added/ updated in the visitor records.");
}
  //searching operationis O(1) on average 
public void searchVisitor(String visitorName) {
  if (visitors.containsKey(visitorName)) {
    System.out.println(visitorName + " visited at: " + visitor.get(visitorName));
  } else {
    System.out.println(visitorName + " is not found. ");
  }
}
//updateing visitor information is O(1) on average
public void updateVisitor(String visitorName, String NewVisitTime) {
  if (visitors.containsKey(visitorName)) {
    Visitor.put(visitorName, newVisitTime);
    System.out.println(visitorName + " information updated.");
  } else {
    System.out.println(" visitor not found.");
  }
}  

//removing a visitor is O(1) on average
public void removVisitor(String visitorName) {
  if (visitors.containsKey(visitorName)) {
    visitors.remove(visitorName);
    System.out.println(visitorName + "removed successfully.");
  } else {
    System.out.println(" visitor not found.");
  }
}

//displaying all visitors is O(n)
  public void displayVisitors() {
    if (visitors.isEmpty()) {
      System.out.println(" No visitors found, the list is empty.");
      return;
    }
    System.out.println(" Visitor recoreds (Max limit:" + MAX_VISITORS +"):);
    for (Map.Entry<String, String> entry : visitors.entrySet()) {
      System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
  }
}
