import java.io.* ;
import java.net.* ;
class Server {
	static DatagramSocket socket = null ;
	static DatagramPacket packet = null ;
	static byte[] recv_data = new byte[ 1024 ] ;
	static String data = null ;
	public static void main( String args[] )throws IOException {
		socket = new DatagramSocket( 8080 ) ;	//This server listens to port 8080 only.
		packet = new DatagramPacket( recv_data, recv_data.length ) ;
		socket.receive( packet ) ;	//Receives the packet from the network.
		data = new String( packet.getData(), 0, packet.getLength() ) ;	//Getting the data from the packet.
		System.out.println( data ) ;
		console_reader.close() ;
		socket.close() ;
	}
}