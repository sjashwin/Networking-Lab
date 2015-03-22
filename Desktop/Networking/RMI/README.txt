-----------------------------------------------------------------------
Remote Method Invocation (RMI)
	Is a process on object-oriented implmentation of a RPC(Remote 
Procedure Call). It makes use of the remote object that is stored in the
RMI registry. 

------------------------------------------------------------------------

The following class are available :
1) CallProcedureInf - It is an interface that provides procedures.
2) RMIRemoteObject - It is a class that implements the interface.
3) RMIClient - This is the client program.
4) RMIServer - This is the server program.

Flow Chart :
 Client<----->Stub<----->Network<----->Skeleton<----->Server.

 ------------------------------------------------------------------------
 
 Execution of the program on Linux, Mac and Windows.
 1) javac *.java 
 2) rmic RMIRemoteMethod.java
 3) rmiregistry 5000
 4) java RMIServer
 5) java RMIClient

--------------------------------------------------------------------------

1) javac *.java - compiles all the file with .java extension on within the folder.

2) rmic RMIRemoteMethod - Creates a stub class.

3) rmiregistry 5000 - Open a terminal and run the command to create a rmi registry
   in the localhost with port number 5000.

4) java RMIServer - This command starts the server.

5) java RMIClient - This command starts the Client.