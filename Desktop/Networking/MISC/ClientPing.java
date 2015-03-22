/*
* ClientPing is a program that implements a client
* to send command to the server to run a process.
*
* @author Ashwin
* @version 1.1
* @since 19-03-2014 
*/
import java.io.* ;
import java.net.* ;
class ClientPing {
	static Socket socket = null ;
	static DataOutputStream output = null ;
	static BufferedReader console_reader = null ;
	static String data = null ;
	public static void main( String args[] )throws IOException {
		socket = new Socket( "127.0.0.1", 9090 ) ;
		output = new DataOutputStream( socket.getOutputStream() ) ;
		console_reader = new BufferedReader( new InputStreamReader( System.in ) ) ;		//Should give ping 127.0.0.1
		data = console_reader.readLine() ;
		output.writeUTF( data ) ;
		output.close() ;
		socket.close() ; 
	}
}