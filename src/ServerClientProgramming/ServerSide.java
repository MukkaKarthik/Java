package ServerClientProgramming;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.*;

public class ServerSide {

	private Socket socket = null;
	private ServerSocket server = null;
	private DataInputStream in = null;
	
	//constructor with port 
	public ServerSide(int port)
	{
		//starts server and wait for connection
		try
		{
			server = new ServerSocket(port);
			System.out.println("Server started");
			
			System.out.println("Waiting for client");
			
			socket=server.accept();
			System.out.println("Client accepted");
			
			//takes input from the client socket
			in= new  DataInputStream(
				new BufferedInputStream(socket.getInputStream()));
				
				String line="";
				
				//reads message from Client until Over 
				while(!line.equals("Over"))
				{
					try
					{
						line=in.readUTF();
						System.out.println(line);
					}
					catch(IOException i)
					{
						System.out.println(i);
					}
				}
		
				//close connection 
				socket.close();
				in.close();
			
		}
				catch(IOException e)
				{
					System.out.println(e);
				}
		
		}
	
	
	public static void main(String args[])
	{
		ServerSide server1 = new ServerSide(5000);
	}
	
	
}

