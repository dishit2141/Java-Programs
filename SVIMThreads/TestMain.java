class TestSynch
{
  public  synchronized void printMessage(String msg)
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

class TestMain
{
  public static void main(String[] args)
  {
    TestSynch t = new TestSynch();
    MyThread obj1 = new MyThread(t,"great");
    MyThread obj2 = new MyThread(t,"cool");  
    MyThread obj3 = new MyThread(t,"hot");
  
   /* try
    {
       obj1.th.join();
       obj2.th.join();
       obj3.th.join();
    }
    catch(Exception e)
    {} */
  }
}



class MyThread implements Runnable
{
  TestSynch t;
  Thread th;
  String msg;
  
  public MyThread(TestSynch ob,String m)
  {
    t=ob;
    msg=m;
    th=new Thread(this);
    th.start();
  }
  public void run()
  {
   t.printMessage(msg);
  }
}
