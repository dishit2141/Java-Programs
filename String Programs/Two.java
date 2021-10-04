class Two
{
  public static void main(String args[])
  {
     String s1 = "Core"; //Constant Pool
     String s2 = "Core"; //Constant Pool
     String s3 = "Core"; //Constant Pool
     String s4 = new String("Core"); //Non - Constant Pool
  
     System.out.println(s1.equals(s2)); // compare content
     System.out.println(s1.equals(s3));
     System.out.println(s1.equals(s4));
	  System.out.println("==");
	System.out.println(s1==s2); // compare reference
     System.out.println(s1==s3);
     System.out.println(s1==s4);
	    
	  
  }
}