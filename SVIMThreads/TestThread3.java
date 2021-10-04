//package SVIMThreads;

import java.io.*;

class MyThread implements Runnable
{
  public void run()
  {
    System.out.println("Child Started");
    for (int i=0;i<=10;i++)
    {
      try
      {
         System.out.println("Value of I = "+i);
         Thread.sleep(1000); 
      }
      catch(Exception ee)
      {
         System.out.println(ee);}
      }
    System.out.println("Child finished");
  }
}

class TestThread3
{
  public static void main(String Args[])
  {
      System.out.println("main Started");    
      MyThread mt = new MyThread();
      Thread t = new Thread(mt);
      t.start();
      try
      {
        Thread.sleep(500);
      }
      catch(Exception e)
      {
        System.out.println(e);
      }
      System.out.println("main Finish");
  }
}