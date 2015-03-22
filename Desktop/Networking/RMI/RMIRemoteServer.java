/*
* RMIRemoteServer is a program that implements the creation of a 
* remote class that provides certain functions that can be invoked 
* by the client in RMI process.
*
* @author Ashwin
* @version 1.1
* @since 19-03-2014 
*/
import java.rmi.*;
import java.rmi.server.*;
import java.io.*;
class RMIRemoteServer extends UnicastRemoteObject implements CallProcedureInf {
	public static void main(String args[])throws IOException {
	}
		RMIRemoteServer()throws RemoteException {
			super() ;
		}
	public int add(int x, int y){
		return ( x+y ) ;
	}
	public int sub(int x, int y){
		return ( x-y ) ;
	}
	public int fact(int x){
		if( x == 1 )
			return 1;
		else
			return ( x*fact( x-1 ) );
	}
}