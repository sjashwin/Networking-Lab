/*
*
*
*
* @author Ashwin
* @version 1.1
* @since 19-03-2014 
*/
import java.io.*;
import java.net.*;
class ServerChat{
		static byte[] recv_data = new byte[1024]; 
		static byte[] send_data = new byte[1024]; 
		static BufferedReader console_reader ;
		static InetAddress ip_address = null ;
		static int port = 0 ;
		static DatagramSocket socket = null ;
		static DatagramPacket packet = null ;
	public static void main(String args[])throws IOException{
		socket = new DatagramSocket(8089) ;
		console_reader = new BufferedReader(new InputStreamReader(System.in));
		while( true ){
			System.out.print("Client : ") ;
			packet = new DatagramPacket(recv_data, recv_data.length) ;
			socket.receive(packet) ;
			String data = new String( packet.getData(), 0, packet.getLength() ) ;
			if( data.equalsIgnoreCase("exit")){
				System.out.println("\nclient has left.....");
				break ;
			}
			System.out.println( data ) ;
			System.out.print( "Server : " ) ;
			ip_address = packet.getAddress() ;
			port = packet.getPort() ;
			data = console_reader.readLine() ;
			send_data = data.getBytes() ;
			packet = new DatagramPacket( send_data, send_data.length, ip_address, port );
			socket.send( packet );
		}
		socket.close();
	}
}