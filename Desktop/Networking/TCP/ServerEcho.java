/*
* ServerEcho is a program that implements creation of 
* a server that can accept connection from ClientEcho.
*
* @author Ashwin
* @version 1.1
* @since 19-03-2014 
*/
import java.io.*;
import java.net.*;

class ServerEcho{
		static ServerSocket server = null;
		static Socket socket = null;
		static DataOutputStream output = null ;
		static DataInputStream input = null ;
	public static void main(String args[])throws IOException{
		server = new ServerSocket( 6000 ) ;	//Creating Server Socket.
		socket = server.accept() ;			//Accepting the client connection.
		System.out.println( "Server has started...." ) ;
		output = new DataOutputStream( socket.getOutputStream() ) ;
		input = new DataInputStream( socket.getInputStream() ) ;
		String data = input.readUTF() ;
		System.out.println( data ) ;
		output.writeUTF( data ) ;			//Data sent to client.
		output.close() ;
		socket.close() ;
	}
}