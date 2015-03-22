/*
* RMIServer is a program that implements the creation of a server
* that can connect to a RMIClient.
*
* @author Ashwin
* @version 1.1
* @since 19-03-2014 
*/
import java.rmi.*;
import java.io.*;
import java.rmi.registry.*;
abstract class RMIServer {
	public static void main(String args[]) {
		try {
		CallProcedureInf stub = new RMIRemoteServer() ;
		Naming.rebind( "rmi://localhost:5000/add", stub ) ;
		}catch(IOException e){
			System.out.println( "Error Occurred\t"+e ) ;
		}
	}
}