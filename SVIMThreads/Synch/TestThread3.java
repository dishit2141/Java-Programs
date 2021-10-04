
class Demo
{
   public static   void print()
   {
     
     System.out.println("Child Thread Started");
     for (int i=0;i<=10;i++)
     {
        System.out.println("Value of i = "+i);
     }
     System.out.println("Child Thread Finish");
   }
}

class MyThread implements Runnable
{
  
  public void synchronized run()
   {
  
     Demo.print();      
   }
}

class TestThread3
{
  public static void main(String Args[])
  {
     System.out.println("Main Thread Started");
     MyThread mt = new MyThread();
     Thread t = new Thread(mt);
     Thread t1 = new Thread(mt);
     t.start();
     t1.start();
     try{
     // t.join();
     }
     catch(Exception ee)
     {
        System.out.println("join");
      }
     System.out.println("Main Thread Finished");    
  }
}