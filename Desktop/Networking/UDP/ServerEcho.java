/*
*
* @author Ashwin
* @version 1.1
* @since 19-03-2014 
*/
import java.io.*;
import java.net.*;
class ServerEcho {
	static DatagramSocket socket = null ;
	static DatagramPacket packet = null ;
	static byte[] recv_data = new byte[1024] ;
	static byte[] send_data = new byte[1024] ;
	static InetAddress ip_address = null ;
	static int port = 0 ;
	public static void main( String args[] )throws IOException{
		socket = new DatagramSocket( 8089 ) ;
		packet = new DatagramPacket( recv_data, recv_data.length ) ;
		socket.receive( packet );
		String data = new String( packet.getData(), 0, packet.getLength());
		System.out.println( data ) ;
		ip_address = packet.getAddress() ;	//Getting address of the packet received.
		port = packet.getPort() ;	//Getting the port of the from address.
		send_data = data.getBytes() ;
		packet = new DatagramPacket( send_data, send_data.length, ip_address, port ) ;
		socket.send( packet ) ;
		socket.close() ;
	}
}