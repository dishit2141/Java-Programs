class MyThread extends Thread
{
  public MyThread(String tname)
  {
    super(tname);
    start();
  }
  public void run()
  {
    System.out.println("Thread"+" "+getName()+" "+"STARTED");
    try
    { 
       for (int i=0;i<=4;i++)
       {
         System.out.println("From child Thread = "+i);
         Thread.sleep(1000);
       }
              
       System.out.println("Thread"+" "+getName()+" "+"FINISHED");
    }
    catch(Exception ee)
    {
      System.out.println(ee);
    }
  }
}

class TestThread5
{
  public static void main(String Args[])
  {
     new MyThread("Child");
	System.out.println("Main thread started");  
     try
     { 
       for (int i=0;i<=4;i++)
       {
         System.out.println(" From main Thread = "+i);
         Thread.sleep(500);
       } 
     }    
     catch (Exception e)
     {
       System.out.println(e);
     }
     System.out.println("Main thread finished");
  }
}