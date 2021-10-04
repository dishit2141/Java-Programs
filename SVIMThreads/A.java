
import java.io.*;
import static java.lang.System.out;

class A
{
  int a = 5,b = 10;
  int   d = a;  
  static 
  {
   out.println("This is Static Block,,,,,,,,,");
  }
  
  
  public static void main(String args[])
  {
    B ahem = new B();
    ahem.display();
  }
  
}

class B
{
  try
  {
    int ani = 2/0;
  }
  catch(exception ee)
  {
    out.println(ee);
  }
  void display()
  {
     out.println("Display function");
  }
  static 
  {
     out.println("This is Static Block,,,,,,,,,");
  }
}
