public class ExexuteThread extends Thread{
	
	void startThread()
	{
		start();
	}
	
	public void run()
	{
		try
		{
			for(int i=80;i<=90;i++)
			{
				System.out.println("Executing child thread "+i);
				Thread.sleep(1000);
			}
		}
	
		 catch(Exception e)
		{
			System.out.println("Exception is "+e);
		}
	}
	
	public static void main(String[] args)
	{
		ExexuteThread t = new ExexuteThread();
		t.startThread();
		
		try
		{
			for(int i=80;i<=90;i++)
			{
				System.out.println("Executing main thread "+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception is "+e);
		}
	}

}
