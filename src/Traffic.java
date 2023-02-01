
enum TrafficSignal
{
	Red("Stop"),Yellow("Wait"),Green("Go");
	
	private String action;
	
	public String action()
	{
		return this.action;
	}
	
	private TrafficSignal(String action)
	{
		this.action=action;
	}
	
}



public class Traffic {
	
	public static void main(String[] args)
	{

	TrafficSignal[] ObjectSignal = TrafficSignal.values();
	
	for(TrafficSignal InputSignal1 : ObjectSignal)
	{
		System.out.println("name: "+ InputSignal1.name() + " action: " + InputSignal1.action());
	}
	
	}

}
