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


//Student 3
