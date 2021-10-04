import java.io.*;

class MyThread extends Thread
{
  public void run()
   {
    System.out.println("Child Thread Started");
    for (int i=0;i<=5;i++)
    System.out.println("Value of i = "+i);
    System.out.println("Child Thread Finish");
    
   }
}

class TestThread7
{
     
  public static void main(String Args[])
  {
    System.out.println("Main Thread Started");
    MyThread mt = new MyThread();
    mt.start();
    boolean A =  mt.isAlive();
    System.out.println(A);

 try{
    mt.join();

    }
    catch (Exception e)
    {

    }
   System.out.println("Main Thread Finished");    
    boolean B =  mt.isAlive();
    System.out.println(B);    
 }
  
  
}