
public class Profile_Visitors {
  public static void main(String[] args) {//this is the main method to call and test the Two approaches we selected for the project
    System.out.println("\m=== Recent Profile Visitors Project ===\n");
    System.out.println("\m=== 1. Using Stack Solution ===\n");
    Visitorstack stackSolution = new Visitorstack();
    //Adding new visitors using Stack so;ution
    stackSolution.addVisitor("Sara");
    stackSolution.addVisitor("Ahmed");
    stackSolution.addVisitor("Noura");

    //Display the current list
    System.out.println();
    stackSolution.displayVisitors();

    //Removing the recent visitor frm the stack list
    System.out.println();
    stackSolution.removeLastVisitor();

    //Displaying who's left in the stack list
    System.out.println();
    stackSolution.displayVisitors();
    
    System.out.println("\m================================================\n");
    System.out.println("\m=== 2. Using HashMap Solution ===\n");//The start of testing the Second so;ution HashMap
    VistorHashMap mapSolution = new VistorHashMap();

    //Adding to the HashMap list
    System.out.println("--- Filling the list to its Max capacity (5 Visitors) ---");
    mapSolution.addVisitor("Sara", "10:00 AM");
    mapSolution.addVisitor("Ahmed", "10:30 AM");
    mapSolution.addVisitor("Noura", "11:00 AM");
    mapSolution.addVisitor("Khalid", "11:30 AM");
    mapSolution.addVisitor("Lama", "12:00 PM");
    
    System.out.println();
    mapSolution.displayVisitors();//to display all the list

    //Testing adding existing member to the list
    System.out.println("\n--- Addin an Existing Visitor ---");
    mapSolution.addVisitor("Noura", "01:15 PM");
    System.out.println();
    mapSolution.displayVisitors();

    //Testing to add a new member to the list, it will remove the old one and add the new instea
    System.out.println("\n--- Adding a New Visitor to a Full list --");
    mapSolution.addVisitor("Fahad", "02:00 PM");
    System.out.println();
    mapSolution.displayVisitors();

    //Searching in the list
    System.out.println("\n--- Search and Removal ---");
    mapSolution.searchVisitor("Sara");
    mapSolution.searchVisitor("Khalid");
    mapSolution.searchVisitor("Lama");

    System.out.println("\n--- Final Records ---");
    mapSolution.displayVisitors();
    
  }
}
