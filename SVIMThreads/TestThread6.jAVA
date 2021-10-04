class MyThread extends Thread
{
   public void run()
   {
     System.out.println("Child Thread Started");
     for (int i=0;i<=10;i++)
     {
        System.out.println("Value of i = "+i);    
     }
     System.out.println("The name of Thread is : "+this.getName());
     System.out.println("Child Finished");
   }
}

class TestThread6
{
  public static void main(String Args[])
  {
     System.out.println("MAIN STARTED ................ STARTED");
     MyThread mt = new MyThread();
     mt.start();

     //mt.setName("MY THREAD");
     System.out.println("At first The name of Thread is : "+mt.getName());
 
     Thread T = Thread.currentThread(); 
     System.out.println(" The name of SECOND Thread is : "+T.getName());
 
     T.setName("NEW MAIN");
     System.out.println("After changing the name of main thread is  : "+T.getName());
 
     System.out.println("MAIN FINISHED.......FINISHED");
  }
}