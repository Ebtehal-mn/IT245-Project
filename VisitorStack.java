
import java.util.Stack;
public class VisitorStack{
private Stack<String> visitors;
public VisitorStack(){
visitors = new Stack<>();
}
//Add a new visitor
//push operation takes constant time O(1)
public void addVisitor(String visitorName){
visitor.push(visitorName);
System.out.println(visitorName + " was added to the recent visitors list.");
}
  //Remove the last visitor 
//pop operation takes constant time O(1)
public void removeLastVistor(){
if (!visitors.isEmpty()){
String removed = visitors.pop();
System.out.println(removed + " was removed from the list.");
} else {
System.out.println(" The visitors list is empty.");
}
}
//Display all visitors
//It iterate and print the list O(n)
public void displayVisitors(){
if (visitors.isEmpty()){ 
System.out.println("No recent visrors.");
return;
}

