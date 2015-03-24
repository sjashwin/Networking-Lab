-------------------------------------------------------------
	
	User Datagram Protocol(UDP) is connectionless protocol
whereas TCP is connection-oriented protocol. UDP uses Datagra-
Socket class to create a socket between the client and server.
The packet is created using the DatagramPacket class. The 
packet is sent and received by calling the send() and receive()
procedures provided by the DatagramSocket class.

--------------------------------------------------------------

javac *.java - Compiles all the files in the current folder.

---------------------------------------------------------------

	In file transfer the file will be created in the folder 
named file.

----------------------------------------------------------------

	Creation of Socket :
	DatagramSocket socket = new DatagramSocket( int port ) ; //Client side.
	DatagramSocket socket = new DatagramSoket() ; //Server side.
	
-----------------------------------------------------------------

	Creation of DatagramPacket :
	//Sending a packet .
	DatagramPacket packet = new DatagramPacket( Byte[] data, int dataLength, InetAddress host, int port ) ;
	//Receiving a packet .
	DatagramPacket packet = new DatagramPacket( Byte[] data, int dataLength) ;
	
---------------------------------------------------------------------

	Packets are send and received through binding the receive( DatagramPacket packet ) 
and send( DatagramPacket packet ) ;

-----------------------------------------------------------------------
