/*
*
* @author Ashwin
* @version 1.1
* @since 19-03-2014 
*/
import java.io.*;
import java.net.*;
class ClientChat {
	static DatagramSocket socket = null ;
	static DatagramPacket packet = null ;
	static InetAddress ip_address = null ;
	static int port = 0;
	static byte[] recv_data = new byte[1024] ;
	static byte[] send_data = new byte[1024] ;
	static BufferedReader console_reader = null ;
	public static void main(String args[])throws IOException{
		socket = new DatagramSocket() ;
		console_reader = new BufferedReader(new InputStreamReader(System.in)) ;
		ip_address = InetAddress.getByName("127.0.0.1") ;
		port = 8089 ;
		while( true ){
			System.out.print("Client : ") ;
			String data = (String)console_reader.readLine() ;
			send_data = data.getBytes() ;
			packet = new DatagramPacket( send_data, send_data.length, ip_address, port) ;
			socket.send( packet ) ;
			if( data.equalsIgnoreCase("exit") )
				break ;
			System.out.print("Server : ") ;
			packet = new DatagramPacket( recv_data, recv_data.length ) ;
			socket.receive( packet ) ;
			data = new String( packet.getData(), 0, packet.getLength() ) ;
			System.out.println( data );
		}
		socket.close();
	}
}