class Six
{
  public static void main(String args[])
  {
     String s1 = "AORE";
     String s2 = "BORE";
     String s3 = "CORE";
     String s4 = "AORE";

     System.out.println(s1.compareTo(s2)); // 65 - 66 = -1
     System.out.println(s1.compareTo(s3)); // 65 - 67 = -2
     System.out.println(s3.compareTo(s1)); //  67 - 65 = 2
     System.out.println(s1.compareTo(s4)); //  65 - 65 = 0
}
}

/*A - 65
B - 66
C - 67 */