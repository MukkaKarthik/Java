public class GarbageCollection {

	public void finalise()
	{
		System.out.println("Finalise method called from main method");
	}
	
	public static void main(String[] args)
	{
		
		GarbageCollection t1 = new GarbageCollection();
		GarbageCollection t2 = new GarbageCollection();
	
		System.gc();
	}
	
}
