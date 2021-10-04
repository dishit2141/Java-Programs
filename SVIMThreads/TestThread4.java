import java.io.*;

class MyThread extends Thread
{
  public void run()
  {
    System.out.println("Child Thread Started");
    for (int i=0;i<=2;i++)
    {
      System.out.println(this.getName()+"Value of i = "+i);    
    }
    //System.out.println("The name of Thread is : "+this.getName());
    System.out.println("Child Thread Finish");
   }
}

class TestThread4
{
     
  public static void main(String Args[])
  {
     System.out.println("MAIN STARTED ................ STARTED");
     MyThread mt = new MyThread();
     mt.start();
     MyThread mt1 = new MyThread();
     mt1.start();
    System.out.println("The name of Thread is : "+mt.getName());
    System.out.println("The name of Thread is : "+mt1.getName());
     mt.setName("MYio THREAD");
     System.out.println("At first The name of Thread is : "+mt.getName());
     System.out.println("MAIN FINISHED ..............FINISHED ");
  }
}