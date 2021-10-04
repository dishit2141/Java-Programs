import java.io.*;

class MyThread extends Thread
{
  public void run()
   {
    System.out.println("Child Thread Started");
    for (int i=0;i<=10;i++)
    {
       System.out.println("Value of i = "+i);
    }
    System.out.println("Child Thread Finish");
   }
}


// Demon Thread
class TestThread1
{
  public static void main(String Args[])
  {
     System.out.println("Main Thread Started");
     MyThread mt = new MyThread();
     mt.start();
     MyThread mt1= new MyThread();
     mt1.start();
  
     System.out.println("Main Thread Finished");
  }
}