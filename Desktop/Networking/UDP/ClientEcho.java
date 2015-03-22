/*
*
* @author Ashwin
* @version 1.1
* @since 19-03-2014 
*/
import java.io.*;
import java.net.*;
class ClientEcho {
	static DatagramSocket socket = null ;
	static DatagramPacket packet = null ;
	static BufferedReader console_reader = null ;
	static byte[] recv_data = new byte[1024] ;
	static byte[] send_data = new byte[1024] ;
	static InetAddress ip_address = null ;
	static int port = 8089 ;
	static String data = null ;
	public static void main( String args[] )throws IOException {
		socket = new DatagramSocket() ;
		ip_address = InetAddress.getByName("127.0.0.1") ;
		console_reader = new BufferedReader( new InputStreamReader( System.in ) ) ;
		data = console_reader.readLine() ;
		send_data = data.getBytes() ; 
		packet = new DatagramPacket(send_data, send_data.length, ip_address, port) ;
		socket.send( packet ) ;
		packet = new DatagramPacket( recv_data, recv_data.length ) ;
		socket.receive( packet ) ;
		data = new String( packet.getData(), 0, packet.getLength() ) ;
		System.out.println( data ) ;
		socket.close() ;
	}
}