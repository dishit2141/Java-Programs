class TestSynch
{
  public void printMessage(String msg)
  {
     System.out.println("India is a "+msg);
     try
     {
       Thread.sleep(1000);
     }
     catch(Exception iee)
     {
     }
     System.out.println("Country");
  }
}

class TestThread8
{
  public static void main(String []args)
  {
    TestSynch T = new TestSynch();
    MyThread obj1 = new MyThread(t,"great");
    MyThread obj2 = new MyThread(t,"cool");  
    MyThread obj3 = new MyThread(t,"hot");
  
    try
    {
       ob1.th.join();
       ob2.th.join();
       ob3.th.join();
    }
    catch(Exception e)
    {} 
  }
}



class MyThread imlpements Runnable
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
