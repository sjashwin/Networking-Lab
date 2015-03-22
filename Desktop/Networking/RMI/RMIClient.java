/*
* RMIClient is a program that implements creation of client
* to demonstrate a Remote Method Invocation.
*
* @author Ashwin
* @version 1.1
* @since 19-03-2014 
*/
import java.rmi.* ;
import java.io.* ;
abstract class RMIClient {
	public static void main(String args[]) throws Exception {
		try {
		CallProcedureInf stub = (CallProcedureInf)Naming.lookup("rmi://localhost:5000/add") ;
		System.out.println( stub.sub(30, 40) ) ;
		System.out.println( stub.add(30, 0) ) ;
		System.out.println( stub.fact(5) ) ;
		}catch(Exception e){
			System.out.println( "error occurred\t"+e ) ;
		}
	}
}