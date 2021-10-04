class Thirteen
{
  public static void main(String args[])
  {
  /*  StringBuffer sb = new StringBuffer();
    System.out.println(sb.capacity()); //16
    System.out.println(sb.length());  // 0
	  
    sb.append("Java"); 
    System.out.println(sb); // Java
    System.out.println("After"); // After
	 
    System.out.println(sb.capacity()); //16
    System.out.println(sb.length()); // 04
    
    sb.append(" is best language"); 
    System.out.println(sb); // Java
    System.out.println("After adding one more statement"); // After
  
    System.out.println(sb.capacity()); //(16*2)+2 = 34  --> (34*2)+2 --> 70
    System.out.println(sb.length()); // 21
   	  System.out.println(sb);*/
	  
  
   /* StringBuffer sb = new StringBuffer();
    System.out.println(sb.capacity());
    System.out.println(sb.length());  
    System.out.println("for Sb1 is");
    StringBuffer sb1 = new StringBuffer("hello");
    System.out.println(sb1.capacity());
    System.out.println(sb1.length());  
    
    sb1.insert(2,"ELLOJAVA");
    System.out.println(sb1);
*/
    StringBuffer sb2 = new StringBuffer("Hello");
    sb2.replace(1,3,"Java");
    System.out.println(sb2); // Hvalo
    sb2.delete(1,3);
    System.out.println(sb2);

    StringBuffer sb3 = new StringBuffer("COREJAVA");
    sb3.reverse();
    System.out.println(sb3);
  }
}