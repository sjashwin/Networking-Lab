# Networking Experiments Using Java
<p>It is more of a tutorial for newbis in Java and trying to learn network programming in JAVA.
This contains all the programs that are required for a newbie in network programming using JAVA.
This could be useful to all undergrad students who are willing to network programming in JAVA.</p>
<ol><li>Socket Communication.</li>
<li> Client Server Echo TCP and UDP.</li>
<li> Client Server chat TCP and UDP.</li>
<li> Remote Method Invocation (RMI) .</li>
<li> HTTP Connection.</li></ol>
<h2>Transmission Contol Protocol(TCP)</h2>
```java
//Client side.
Socket socket = new Socket( String host, int port ) ;
//Server side.
ServerSocket server = new ServerSocket( int port ) ;
```
<h2>User Datagram Protocol(UDP)</h2>
```java
//creation of UDP socket.
DatagramSocket socket = new DatagramSocket( int port ) ;
//sending a packet.
DatagramPacket packet = new DatagramPacket( byte[] data, int dataLength, InetAddress ip_address, int port ) ;
socket.send( packet ) ;
//receiving a packet.
DatagramPacket packet = new DatagramPacket ( byte[] data, int dataLength ) ;
socket.send( packet ) ;
```
<h2>Socket</h2>
<p>End point of a two-way connection (Terminals) 
which is given a port number. A network is combination of an ip address and a port number.  </p>
<h2>Port</h2>
<p>Port is an apartment number and a socket is an apartment.</p>
<h2>Documentation</h2>
<p>
<ul>
<li>ServerSocket : http://docs.oracle.com/javase/7/docs/api/java/net/ServerSocket.html</li>
<li>Socket : http://docs.oracle.com/javase/7/docs/api/java/net/Socket.html</li>
</ul>
</p>
