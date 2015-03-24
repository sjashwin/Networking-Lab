/*
* CallProcedureInf is a program that implements a interface
* which provides methods for the RMIRemoteServer class.
*
* @author Ashwin
* @version 1.1
* @since 19-03-2014 
*/
import java.rmi.*;
/*
*  This interface provides the 
*  the routines for remote object.
*/
public interface CallProcedureInf extends Remote {
	public int add( int x, int y )throws RemoteException ;
	public int sub( int x, int y )throws RemoteException ;
	public int fact( int x )throws RemoteException ;
}
