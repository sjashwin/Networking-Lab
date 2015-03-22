/*
* ClientChat is a program that implements creation of client 
* that connects to ServerChat.
*
* @author Ashwin
* @version 1.1
* @since 19-03-2014 
*/
import java.io.* ;
import java.net.* ;
class ClientChat {
	static Socket socket = null ;
	static BufferedReader console_reader = null ;
	static DataOutputStream output = null ;
	static DataInputStream input = null ;
	public static void main( String args[] )throws IOException {
		socket = new Socket( "127.0.0.1", 8080 ) ;
		console_reader = new BufferedReader( new InputStreamReader( System.in ) ) ;
		output = new DataOutputStream( socket.getOutputStream() ) ;
		input = new DataInputStream( socket.getInputStream() ) ;
		System.out.println( "Client has started\n--------------------------") ;
		String data = null ;
		while( true ){
			System.out.print( "Client : " ) ;
			data = console_reader.readLine() ;
			output.writeUTF( data ) ;
			if( data.equalsIgnoreCase( "exit" ) )	//Typing exit in the console would close the communication. 
				break ;
			System.out.println( "Server : " ) ;
			data = input.readUTF() ;
			System.out.println( data ) ;
		}
		output.close() ;
		input.close() ;
		socket.close() ;
	}
}