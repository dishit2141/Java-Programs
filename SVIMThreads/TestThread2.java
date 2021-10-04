class MyThread implements Runnable
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

class TestThread2
{
  public static void main(String Args[])
  {
     System.out.println("Main Thread Started");
     MyThread mt = new MyThread();
     Thread t = new Thread(mt);
     t.start();
     for (int i=0;i<=10;i++)
     {
        System.out.println("inside main thread");
     }
     System.out.println("Main Thread Finished");    
  }
}