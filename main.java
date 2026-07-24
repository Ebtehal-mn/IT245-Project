///Data Structure Project:  Recent Profile Visitors System (Social Media Context)


//Student 1
import java.util.Stack;
puplic class VisitorStack {
  private Stack<String> visitors;
  public VisitorStack() {
    visitors =new Stack<>();
  }
  // Add a new visitor
  puplic void addVisitor(String visitorName) { 
    visitors.push(visitorName);
    System.outprintln(visitorName + " was added to the recent visitors list.");
  }
  // Remove the most recent visitor 
  public void removeLastVisitor() {
    if (!visitors.isEmpty()) {
      String removed = visitors.pop();
      System.out.println(removed + was removed from the list.");
    } else {
      Sysrem.out.println("The visitors list is empty.");
    }
  }
  // Display all recent visitors
  public void displayVisitors() {
    if (visitors.isEmpty()) {
      System.out.println("No recent visitors.");
      return;
    }
    System.out.println("Recent Profile Visitors:");
    for (int i = visitor.size() - 1; i >= 0; i--) {
      System.out.println("- " + visitors.get(i));
    }
  }
}
  

//Student 2
import java.util.HashMap;
public class VistorHashMap { 
  //creat a HashMap to store visitor name
  private HashMap<string, string> visitors;
  public visitorHashMap() {
    visitors = new Hashmap<>();
  }
  // Add a visitor 
  //Time complexty:O(1)
  public void addVisitor(string visitorName, string visitTime) {
    visitors.put(visitorName, visitTime); 
    System.out.printin(visitorName + " was added to the visitor records."); 
  }
// search for a visitor
  public void searchVisitor(string visitorName) {
    if (visitors.containsKey(visitorName) {
      System.out.printin(visitorName + " visited at:" + visitoers.get(visitorName));
    }
    else { 
      System.out.printin("visitor not found.");
    }
  }
  //update visitor information
  public void updeteVisitor(String visitorName, String NewVisitTime) {
    if (visitors.containsKey(visitorName)) {
      visitors.put(visitorName, NewVisitTime);
      System.out.printin(visitorName + "information updated.");
    } else{
      System.out.printin("Visitor not found")
        }
  }
  //Remove a visitor
  public void removeVisitor(String visitorName) {
    if (visitors.containsKey(VisitorName)) {
      visitors.remove(visitorName);
      System.out.printin(visitorName + " removed successfully.");
    } else {
      System.out.printin("Visitor not found.");
    }
  }

  //Display all visitors
  public void displayVisitors() {
    if (visitors.isEmpty()) {
      System.out.printin("No visitors found.");
      return;
    }
    
    System.out.prinin("Visitor records:");

    for (String name : visitors.keySet()) {
      System.out.printin(name + " -> " + visitors.get(name));
    }
  }
}
    
//Student 3
