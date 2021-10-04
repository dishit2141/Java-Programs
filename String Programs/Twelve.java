class Twelve
{
  public static void main(String args[])
  {
    String s = new String("Emp");
    String s1 = "     Core Java     ";
    String s2 = s1.intern();
    System.out.println(s2);
  }
}