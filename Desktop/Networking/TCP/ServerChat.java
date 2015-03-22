/*
* ServerChat is a program that implements creation of server 
* that accepts connection from ClientServer.
*
* @author Ashwin
* @version 1.1
* @since 19-03-2014 
*/
import java.io.* ;
import java.net.* ;
class ServerChat {
	static ServerSocket server = null ;
	static Socket socket = null ;
	static DataOutputStream output = null ;
	static DataInputStream input = null ;
	static BufferedReader console_reader = null ;
	public static void main( String args[] )throws IOException {
		server = new ServerSocket( 8080 ) ;
		socket = server.accept() ;
		output = new DataOutputStream( socket.getOutputStream() ) ;
		input = new DataInputStream( socket.getInputStream() ) ;
		console_reader = new BufferedReader( new InputStreamReader( System.in ) ) ;
		System.out.println("Server has started\n-----------------------") ;
		String data = "";
		while ( true ) {
			/*
				This part of the code runs until
				the client exits.
			*/
			System.out.print( "Client : " ) ;
			data = input.readUTF() ;
			System.out.println( data ) ;
			if( data.equalsIgnoreCase("exit") ) //Checks for exit condition.
				break;
			System.out.print( "Server : " ) ;
			output.writeUTF( console_reader.readLine() ) ;
		}
		System.out.println( "End of communiation............" ) ;
		output.close() ;
		input.close() ;
		socket.close() ;
	}
}