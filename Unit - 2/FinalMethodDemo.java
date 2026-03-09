class FinalMethodClass 
{ 
 final void method1() 
 { 
  System.out.println("This is method 1"); 
 } 
} 
 
 
public class FinalMethodDemo extends FinalMethodClass{ 
 
 public static void main(String args[]) 
 { 
  FinalMethodClass obj = new FinalMethodClass(); 
  obj.method1(); 
 } 
 /* 
  * void method1() { System.out.println("Overriding method"); } 
  */ 
} 