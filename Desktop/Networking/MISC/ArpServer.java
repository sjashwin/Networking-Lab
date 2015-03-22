/*
* ArpServer is a program that implements querying a router 
* for a MAC address by giving an ip address to the command.
*
* @author Ashwin
* @version 1.1
* @since 19-03-2014 
*/
import java.io.*;
import java.net.*;
class ArpServer {
	static DataOutputStream output = null ;
	static BufferedReader input = null ;
	static DataInputStream read = null ;
	static ServerSocket server = null ;
	static Socket socket = null ;
	static Process process = null ;
	static Runtime run = null ;
	public static void main(String args[])throws Exception{
		server = new ServerSocket( 8089 );
		socket = server.accept() ;
		System.out.println( "Server has started." ) ;
		run = Runtime.getRuntime() ;
		read = new DataInputStream( socket.getInputStream() ) ;
		String cmd = (String)read.readUTF() ;
		process = run.exec( cmd ) ;
		input  = new BufferedReader( new InputStreamReader( process.getInputStream() ) );
		String data = null ;
		while( ( data = input.readLine() ) != null ){
			System.out.println( data ) ;
		}
	}
}