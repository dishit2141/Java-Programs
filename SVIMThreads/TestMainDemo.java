class TestSynch
{
  public void printMessage(String msg)
  {
     System.out.println("India is a "+msg);
     try
     {
       Thread.sleep(1000);
     }
     catch(InterruptedException ie)
     {}
     System.out.println("Country");
  }
}

class TestMainDemo
{
  public static void main(String[] args)
  {
    TestSynch t = new TestSynch();
    MyThread obj1 = new MyThread("great");
    MyThread obj2 = new MyThread("cool");  
    MyThread obj3 = new MyThread("hot");
  
    try
    {
       obj1.th.join();
       obj2.th.join();
       obj3.th.join();
    }
    catch(Exception e)
    {}
  }
}



class MyThread implements Runnable
{
  TestSynch t;
  Thread th;
  String msg;
  
  public MyThread(String m)
  {
    t = new TestSynch();
    
    msg=m;
    th=new Thread(this);
    th.start();
  }
  public void run()
  {
   synchronized(t) 
  {
   t.printMessage(msg);
  }}
}
