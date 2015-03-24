------------------------------------------------------------

	Transmission Control Protocol (TCP) - A connection oriented 
protocol that is used to transmit packets of data across the
network. It is commonly used protocol.

-------------------------------------------------------------

javac *.java - Compilation of all program in the folder.

java [filename] - will run the repective java program

--------------------------------------------------------------

	TCP_Client_File and TCP_Server_File the files will be read
from the current directory and will transferred into the uploads
folder that is present in the current directory. The created file
will be [upload.txt].

---------------------------------------------------------------

	socket - End point of a two-way connection (Terminals) 
which is given a port number. 
	Client side socket is given a host address.
	Socket socket = new Socket( String host, int port ) ;
	Server side socket is bound by a ServerSocket.
	ServerSocket server = new ServerSocket ( int port ) ;
	Socket socket = server.accept() ;

------------------------------------------------------------------
	To read input from socket :
	DataInputStream
	To write to a socket :
	DataOutputStream
	
-------------------------------------------------------------------
	
	Closing the socket after communication :
	socket.close()
	Closing the server after communication :
	server.close()

--------------------------------------------------------------------
