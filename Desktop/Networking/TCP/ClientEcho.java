/*
* ClientEcho program implements a program
* that connects to a ClientServer.
*
* @author Ashwin
* @version 1.1
* @since 19-03-2014 
*/
import 	java.io.*;
import java.net.*;
class ClientEcho { 
		static Socket socket = null;
		static DataOutputStream output = null ;
		static DataInputStream input = null ;
		static BufferedReader console_reader = null ;
		static String data = null ;
	public static void main( String args[] )throws IOException{
		socket = new Socket( "127.0.0.1", 6000 ) ;
		output = new DataOutputStream( socket.getOutputStream() ) ;
		input = new DataInputStream( socket.getInputStream() ) ;
		console_reader = new BufferedReader( new InputStreamReader( System.in ) ) ;
		data = console_reader.readLine() ;
		output.writeUTF( data ) ;	//Output to server.
		System.out.println( input.readUTF() ) ;
		input.close() ;
		output.close() ;
		socket.close() ;
	}
}