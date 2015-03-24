/*
* TCP_Client_File is a program that implements creation of a 
* client in transfer of file using TCP.
*
* @author Ashwin
* @version 1.1
* @since 19-03-2014 
*/

import java.io.*;
import java.net.*;

public class TCP_Client_File {
	
	static DataOutputStream output = null ;
	static DataInputStream input = null ;
	static BufferedReader reader_file = null ;
	static Socket socket = null ;
	static File file = null ;
	static FileReader reader = null ;
	static StringBuffer buf = new StringBuffer( 1024 ) ;

	public static void main( String[] args )throws IOException {
		socket = new Socket ( "127.0.0.1", 8000 ) ;
		file = new File( "client.txt" ) ;	//Creates or verifies the availability of the file.
		reader = new FileReader( file ) ;	//Used to read from the file.
		output = new DataOutputStream( socket.getOutputStream() ) ;
		reader_file = new BufferedReader( reader ) ;
		String data = null ;
		while ( ( data = reader_file.readLine() ) != null )
			/*
				Reads from the file until the 
				end of file or null data is
				encountered.
			*/
			buf.append( data ) ;	//Appends all the data into one string object.
		data = buf.toString() ;
		output.writeUTF( data ) ;
		output.close() ;
		reader.close() ;
		socket.close() ;
	}
}
