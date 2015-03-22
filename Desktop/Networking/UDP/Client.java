import java.io.* ;
import java.net.* ;
class Client {
	static DatagramSocket socket = null ;
	static DatagramPacket packet = null ;
	static BufferedReader console_reader = null ;
	static byte[] send_data = new byte[ 1024 ] ;
	static InetAddress ip_address = null ;
	static int port = 8080 ;
	static String data = null ;
	public static void main(String args[])throws IOException {
		socket = new DatagramSocket() ;
		console_reader = new BufferedReader(new InputStreamReader( System.in ) ) ;
		ip_address = InetAddress.getByName( "127.0.0.1" ) ;		//Sets the destination ip address.
		data = console_reader.readLine() ;	//Gets the input data.
		send_data = data.getBytes() ;	//Converts string into bytes.
		packet = new DatagramPacket( send_data, send_data.length, ip_address, port ) ;
		socket.send( packet ) ;		//Sends the packet across the network.
		console_reader.close() ;
		socket.close() ;
	}
}