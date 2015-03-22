/*
* RPCServer is a program that acts as Server
* in RPC.
*
* @author Ashwin
* @version 1.1
* @since 19-03-2014 
*/
import java.io.* ;
import java.net.* ;
class RPCServer {
	static ServerSocket server = null ;
	static Socket socket = null ;
	static DataInputStream input = null ;
	static DataOutputStream output = null ;
	static Process process = null ;
	static Runtime run = null ;
	public static void main( String args[] )throws IOException {
		server = new ServerSocket(8081) ;
		socket = server.accept() ;
		input = new DataInputStream( socket.getInputStream() ) ;
		output = new DataOutputStream( socket.getOutputStream() ) ;
		run = Runtime.getRuntime() ;
		String cmd = input.readUTF() ;
		process = run.exec( cmd ) ;
		output.writeUTF("Success fully executed.....") ;
		socket.close() ;
	}
}