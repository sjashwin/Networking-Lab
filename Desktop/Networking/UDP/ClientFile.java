/*
* ClientFile is a program that implements the cration of a 
* client that is used to transfer a file using UDP.
*
* @author Ashwin
* @version 1.1
* @since 19-03-2014 
*/
import java.io.* ;
import java.net.* ;

class ClientFile {
	static DatagramPacket packet = null ;
	static DatagramSocket socket = null ;
	static InetAddress ip_address = null ;
	static int port = 9000 ;
	static byte[] send_data = new byte[ 1024 ];
	static File file = null ;
	static StringBuffer buf = new StringBuffer( 1024 ) ;
	static FileReader reader = null ;
	static BufferedReader console_reader = null ;
	public static void main(String args[]) throws IOException {
		socket = new DatagramSocket() ;
		ip_address = InetAddress.getByName( "127.0.0.1" ) ;
		file = new File( "client.txt" ) ;
		reader = new FileReader( file ) ;
		console_reader = new BufferedReader( reader ) ;
		String data = null ;
		while ( (data = console_reader.readLine() ) != null ) 
			buf.append( data ) ;
		data = buf.toString() ;
		System.out.println( data ) ;
		send_data = data.getBytes() ;
		packet = new DatagramPacket( send_data, send_data.length, ip_address, port ) ;
		socket.send( packet ) ;
		reader.close() ;
		socket.close() ;
	}
}