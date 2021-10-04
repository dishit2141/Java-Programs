class Multi extends Thread
{
  public void run()
  {
    System.out.println("running thread name is"+Thread.currentThread().getName());
    System.out.println("running thread priority is"+Thread.currentThread().getPriority());
	  
		System.out.println("Name: "+Thread.currentThread().isDaemon());
  }	
}

class TestThread10
{
  public static void main(String args[])
  {
    Multi m1 = new Multi();
    Multi m2 = new Multi();
    m1.setPriority(Thread.MIN_PRIORITY);
    m2.setPriority(Thread.MAX_PRIORITY);
    m1.setDaemon(true);
    m1.start();
    
	  
	    try{
     m1.join();
  }
  catch (Exception e)
  {}
  m2.start();
  }}
