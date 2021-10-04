class Fourteen
{
  public static void main(String args[])
  {
    StringBuffer sb = new StringBuffer();
    System.out.println(sb.capacity());
    System.out.println(sb.length());

    sb.append("World of Java"); //13
    System.out.println(sb.capacity());

    sb.append(",OAK Master's Era"); // 17
    System.out.println(sb.capacity());

    sb.ensureCapacity(30);
    System.out.println(sb.capacity());

    sb.ensureCapacity(40);
    System.out.println(sb.capacity()); 
  }
} 

    