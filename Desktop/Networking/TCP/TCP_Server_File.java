/*
* TCP_Server_File is a program that implements
* the transfer of files between server and client using 
* TCP protocol.
*
* @author Ashwin
* @version 1.1
* @since 19-03-2014 
*/
import java.io.*;
import java.net.*;

public class TCP_Server_File {
	static ServerSocket server = null ;
	static Socket socket = null ;
	static File file = null ;
	static FileWriter writer = null ;
	static DataInputStream input = null ;
	static String data = null ;
public static void main(String[] args)throws Exception 
{
	server= new ServerSocket( 8000 ) ;
	socket= server.accept() ;
	file = new File("uploads/upload.txt") ;
	writer = new FileWriter( file )	;
	input = new DataInputStream( socket.getInputStream() )	;
	data = input.readUTF() ;
	writer.write( data ) ;	//Writes into the file.
	input.close() ;
	writer.close() ;
	socket.close() ;
	}
}