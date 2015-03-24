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
Socket socket = new Socket( InetAddress host, int port ) ;
//Server side.
ServerSocket server = new ServerSocket( int port ) ;
```
