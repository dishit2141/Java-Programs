import java.io.*;

class Eleven
{
  public static void main(String args[])
  {
     String s = "   COrE JaVa";
     
     System.out.println(s.toUpperCase()); 
     System.out.println(s.toLowerCase());
     System.out.println(s);
   
     System.out.println("The TRIM METHOD CALLS HERE");
     System.out.println(s.trim());
   

     System.out.println("The StartsWith() and endsWith() METHOD CALLS HERE");
     System.out.println(s.startsWith("CO"));
     System.out.println(s.endsWith("Va"));  


   }
}