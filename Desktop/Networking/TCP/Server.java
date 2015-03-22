/*
* Server is a program that implements creation of a server
* that can accept connection from Client
*
* @author Ashwin
* @version 1.1
* @since 19-03-2014 
*/
import java.io.*;
import java.net.*;

class Server{
		static ServerSocket server = null;
		static Socket socket = null;
		static DataInputStream input = null ;
		static String data = null ;
	public static void main( String args[] )throws IOException{
		server = new ServerSocket( 6000 ) ;	//Creating Server Socket.
		socket = server.accept() ;			//Accepting the client connection.
		System.out.println( "Server has started...." );
		input = new DataInputStream( socket.getInputStream() );
		data = input.readUTF() ;	//reads from the server.
		System.out.println( data ) ;
		input.close() ;
		socket.close() ;
	}
}