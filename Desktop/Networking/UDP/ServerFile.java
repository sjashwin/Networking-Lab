/*
* ServerFile is a program that implements creation of
* a server that is used to transfer file using UDP.
*
* @author Ashwin
* @version 1.1
* @since 19-03-2014 
*/
import java.io.* ;
import java.net.* ;
class ServerFile {
	static DatagramSocket socket = null ;
	static DatagramPacket packet = null ;
	static byte[] recv_data = new byte[ 1024 ] ;
	static BufferedReader console_reader = null ;
	static File file = null ;
	static FileWriter writer = null ;
	public static void main( String args[] )throws IOException {
		socket = new DatagramSocket( 9000 ) ;
		file = new File( "file/uploaded.txt" ) ;
		writer = new FileWriter( file ) ;
		packet = new DatagramPacket( recv_data, recv_data.length ) ;
		socket.receive( packet ) ;
		String data = new String( packet.getData(), 0, packet.getLength() ) ;
		writer.write( data ) ;
		writer.close() ;
		System.out.println( "Completed writing the file." ) ;
		writer.close() ;
		socket.close() ;
	}
}