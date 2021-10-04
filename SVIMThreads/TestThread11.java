class Multi extends Thread
{
  public void run()
  {
    System.out.println("Name: "+Thread.currentThread().getName());
    System.out.println("Name: "+Thread.currentThread().isDaemon());
	      System.out.println("running thread priority is"+Thread.currentThread().getPriority());
  }
}

class TestThread11
{
  public static void main(String args[])
  {
     Multi m1 = new Multi();
     Multi m2 = new Multi();
	

     m1.start();
	m2.start();
	  try{
     m2.join();
  }
  catch (Exception e)
  {}}
}