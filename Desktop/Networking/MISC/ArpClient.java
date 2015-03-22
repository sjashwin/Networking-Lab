/*
* ArpClient is used to get the arp table from the router.
* The command is given in client and excetion is done in
* ArpServer.
*
* @author Ashwin
* @version 1.1
* @since 19-03-2014 
*/
import java.net.*;
import java.io.*;
class ArpClient{
	static BufferedReader input = null ;
	static Socket socket = null ;
	static Process process = null ;
	static DataOutputStream output = null ;
	static Runtime run = null ;
	public static void main(String args[])throws IOException {
		socket = new Socket( "127.0.0.1", 8089 ) ;
		System.out.println( "Client has started." ) ;
		output = new DataOutputStream( socket.getOutputStream() );
		output.writeUTF("arp -a");
	}
}