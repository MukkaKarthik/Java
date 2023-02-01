package ServerClientProgramming;

import java.io.*;
import java.net.*;

public class ClientSide {

	// initialize socket and input , output streams
	private Socket socket = null;
	private DataInputStream input = null;
	private DataOutputStream out = null;

	// constructor to get IP address and port no
	public ClientSide(String address, int port) {

		// establish a connection
		try {
			socket = new Socket(address, port);
			System.out.println("Connected");

			// takes input from terminal
			input = new DataInputStream(System.in);

			// sends output to the socket
			out = new DataOutputStream(socket.getOutputStream());

		} catch (UnknownHostException u) {
			System.out.println(u);
		} catch (IOException i) {
			System.out.println(i);
		}

		// String to read message from input tab
		String line = "";

		// keep reading until over is displayed on the screen
		while (!line.equals("Over")) {
			try {
				line = input.readLine();
				out.writeUTF(line);
			} catch (IOException i) {
				System.out.println(i);
			}

		}

		// close the connection
		try {
			input.close();
			out.close();
			socket.close();
		} catch (IOException i) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		ClientSide client = new ClientSide("127.0.0.1", 5000);
	}
}
