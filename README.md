# Networking Experiments Using Java
<p>It is more of a tutorial for newbies in Java and trying to learn network programming in JAVA.
This contains all the programs that are required for a newbie in network programming using JAVA.
This could be useful to all undergrad students who are willing to learn network programming in JAVA.</p>
<ol><li>Socket Communication.</li>
<li> Client Server Echo TCP and UDP.</li>
<li> Client Server chat TCP and UDP.</li>
<li> Remote Method Invocation (RMI) .</li>
<li> HTTP Connection.</li></ol>
<h2>Socket</h2>
<p>End point of a two-way connection (Terminal) 
which is given a port number. A network is combination of an ip address and a port number.  </p>
<h2>Port</h2>
<p>Port is an apartment number and a socket is an apartment.</p>
<h2>Transmission Control Protocol (TCP)</h2>
```java
  Socket socket = new Socket( String host, int port ) ;  //Client side
  Socket socket = new Socket ( int port ) ; //Server side
```
<h2>User Datagram Protocol (UDP) </h2>
```java
  DatagramSocket socket = new DatagramSocket( int port ) ; //Both client and server side.
```
<h2>Documentation</h2>
<ul>
<li>ServerSocket : http://docs.oracle.com/javase/7/docs/api/java/net/ServerSocket.html</li>
<li>Socket : http://docs.oracle.com/javase/7/docs/api/java/net/Socket.html</li>
</ul>
