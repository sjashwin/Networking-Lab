/*
* ServerPing is a program that implements a server that
* receives the command from the server and executed the command
* in the runtime.
*
* @author Ashwin
* @version 1.1
* @since 19-03-2014 
*/
import java.io.* ;
import java.net.* ;
class ServerPing {
	static ServerSocket server = null ;
	static Socket socket = null ;
	static Runtime run = null ;
	static Process process = null ;
	static DataInputStream input = null ;
	static BufferedReader process_reader = null ;
	static String command = null ;
	static String data = null ;
	public static void main( String args[] )throws IOException {
		server = new ServerSocket( 9090 ) ;
		socket = server.accept() ;
		input = new DataInputStream( socket.getInputStream() ) ;
		run = Runtime.getRuntime() ;	//Creates a runtime object.
		command = input.readUTF() ;
		process = run.exec( command ) ;		//Runs the input command on the console.
		process_reader = new BufferedReader( new InputStreamReader( process.getInputStream() ) ) ;
		while( ( data = process_reader.readLine() ) != null )	//Reads the output on running the command
			System.out.println( data ) ;
		input.close() ;
		process_reader.close() ;
		socket.close() ;
	}
}