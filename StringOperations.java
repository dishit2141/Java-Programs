/*class One
{
  public static void main(String args[])
  {
     String s = "Core";
     String s1 =s.concat(" Java");
     System.out.println(s1);
  }
}*/
/*class two
{
	public static void main(String args[])
	{
		String a= "Java";
		String b="Java";
		String c = new String("Java");
		System.out.println(a.equals(b));
		System.out.println(b.equals(c));
		System.out.println("==");
		System.out.println(a==b);
		System.out.println(b==c);
	}
}*/
/*class three
{
	public static void main(String []args)
	{
		String a = "Java";
		String b = "jAva";
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		
	}
}*/
/*class four
{
	public static void main(String []args)
	{
		String a="Java";
		String b="Java";
		String c = new String("Java");
		System.out.println(a==b);
		System.out.println(a==c);
	}
}*/
/*class six
{
	public static void main(String args[])
	{
		String s1= "HII";
		String s2 = "hii";
		String s3 = "Bore";
		String s4 = "HII";
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s3));
		System.out.println(s1.compareTo(s4));
	}
}
*/
/*class seven
{
	public static void main(String args[])
	{
		String s = "HELLO" + " " + "WORLD";
		String s1= "Dishit";
		String s2=s1.concat("Pandya");
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
	}
}*/
/*class eight
{
	public static void main(String args[])
	{
			String s = 40 + 10 +"Hello" + "Dishit" + 30  +20;
			System.out.println(s);
	}
}*/
/*class ten
{
	public static void main(String args[])
	{	
		String s = "Hello This is Dishit";
		System.out.println(s.substring(8));
		System.out.println(s.substring(2,8));
		
			
	}
}*/
/*class eleven
{
	public static void main(String []args)
	{
		String str = "CoRE JaVa";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println("TRIM METHOD CALLS HERE");
		System.out.println(str.trim());
		System.out.println(str.startsWith("Co"));
		System.out.println(str.endsWith("Va"));
	}
}*/
/*class twelve
{
  public static void main(String args[])
  {
    String s = new String("Emp");
    String s1 = "     Core Java     ";
    String s2 = s1.intern();
    System.out.println(s2);
  }
}*/
/*class thirteen
{
	public static void main(String []args)
	{
		StringBuffer sb1 = new StringBuffer("Hello");
		System.out.println(sb1);
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
		System.out.println("Increasing capacity");
		sb1.append("Dishit Pandya is Here...");
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
		System.out.println(sb1);
		System.out.println("Inserting string");
		sb1.insert(2,"bye");
		System.out.println(sb1);
		System.out.println("Replacing String");
		sb1.replace(2,5,"");
		System.out.println(sb1);
		System.out.println("Reversing StringBuffer");
		StringBuffer sb2 = new StringBuffer("olleh");
		sb2.reverse();
		System.out.println(sb2);
		
	}
}*/
/*class fifteen
{
	public static void main(String []args)
	{
			StringBuffer sb1 = new StringBuffer("Hello");
			System.out.println(sb1.capacity());
			System.out.println(sb1.length());
			sb1.ensureCapacity(30);
			System.out.println(sb1.capacity());
	}
}
*/