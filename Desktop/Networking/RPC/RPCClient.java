/*
* RPCClient is a program the acts as a client in
* Remote Procedure Call.
*
* @author Ashwin
* @version 1.1
* @since 19-03-2014 
*/
import java.io.* ;
import java.net.* ;
class RPCClient{
	static Socket socket = null ;
	static BufferedReader reader = null ;
	static DataOutputStream output = null ;
	static DataInputStream input = null ;
	public static void main( String args[] )throws IOException {
		socket = new Socket( "127.0.0.1", 8081 ) ;
		reader = new BufferedReader( new InputStreamReader ( System.in ) ) ;
		output = new DataOutputStream( socket.getOutputStream() ) ;
		input = new DataInputStream( socket.getInputStream() ) ;
		String cmd = reader.readLine() ;
		output.writeUTF( cmd ) ;
		System.out.println( input.readUTF() ) ;
		socket.close() ;
	}

}