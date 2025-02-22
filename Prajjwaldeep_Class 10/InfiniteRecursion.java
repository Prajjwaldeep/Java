//: c11:InfiniteRecursion.java 
// Accidental recursion. 
// {RunByHand} 
import java.util.*; 
 
public class InfiniteRecursion { 
  public String toString() { 
    return " InfiniteRecursion address: " + this + "\n"; 
  } 
  public static void main(String[] args) { 
    List v = new ArrayList(); 
    for(int i = 0; i < 10; i++) 
      v.add(new InfiniteRecursion()); 
       } 
} ///:~ 