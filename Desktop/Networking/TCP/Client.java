/*
* Client program implements an application the 
* creates a simple connection to the server.
*
* @author Ashwin
* @version 1.1
* @since 19-03-2014 
*/

import 	java.io.*;
import java.net.*;
class Client{
	static Socket socket = null ;
	static DataOutputStream output = null ;
	static BufferedReader console_reader = null ;
	static String data = null ;
	public static void main (String args[]) throws IOException{
		socket = new Socket( "127.0.0.1", 6000 ) ; //Creates a socket.
		output = new DataOutputStream( socket.getOutputStream() ) ;
		console_reader = new BufferedReader( new InputStreamReader( System.in ) ) ;
		data = console_reader.readLine() ;
		output.writeUTF( data ) ;		//Output to server.
		//All the streams and sockets will be closed after communication.
		output.close() ;
		socket.close() ;
	}
}