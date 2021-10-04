class Customer
{
 int amt = 10000;
 
 synchronized void withdraw(int amt)
 {
   System.out.println("going to withdraw....");

   if (this.amt < amt)
   { 
      System.out.println("less balance; U can't");
      try
      {
        wait();        
      }
      catch(Exception ee)
      {}
   }
   this.amt-=amt;
   
   System.out.println("Withdraw Completed, Remaining Amount is "+amt);
   
 }

  
 synchronized void deposit(int amt)
 { 
   System.out.println("going to be deposit");
   this.amt+=amt; 
   System.out.println("deposit completed");
   notify();
 }
}

class TestThread20
{
  public static void main(String args[])
  {  
      Customer c = new Customer();
      Thread1 t1 = new Thread1(c);
      Thread2 t2 = new Thread2(c);   
      t1.start();
      t2.start();
     
      
  }
}


class Thread1 extends Thread
{
 
  Customer c; 
  Thread1(Customer c)
  {
    this.c = c;
  }
  public void run()
  {
    c.withdraw(13000);
  }
}

class Thread2 extends Thread
{
  Customer c;  
  Thread2(Customer c)
  {
    this.c = c;
  }
  public void run()
  {
    c.deposit(10000);
  }
}
   
