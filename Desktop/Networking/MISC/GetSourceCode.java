/*
* GetSourceCode program is used demonstrate 
* HTTP connection in java. This program can
* used to download the source code of any
* webpage on the internet.
*
* @author Ashwin
* @version 1.1
* @since 19-03-2014 
*/
import java.net.*;
import java.io.*;
class GetSourceCode {
	static URL site = null ;
	static URLConnection connect = null ;
	static Proxy proxy = null ;
	static BufferedReader reader = null ;
	static FileWriter file_writer = null ;
	static File file = null ;
	static StringBuffer buf = null ;
	static String webpage = null ;
	static String site_name = null ;
    public static void main(String args[])throws IOException {
		reader = new BufferedReader( new InputStreamReader( System.in ) );
		webpage = reader.readLine() ;
		site = new URL( webpage ) ;		//creates a url object.
		buf = new StringBuffer( 1024 ) ;
		site_name = get_file_name( webpage );
		file = new File( site_name );
		proxy = new Proxy( Proxy.Type.HTTP, new InetSocketAddress("172.16.0.02", 8080) );	//used where proxy is required.
		connect = site.openConnection( proxy );		//opens a connection to the webpage.
		file_writer = new FileWriter( file );
		String data = null ;
		reader = new BufferedReader( new InputStreamReader( connect.getInputStream() ) ) ;
		while( ( data = reader.readLine() ) !=null )
			buf.append( data ) ;
		data = buf.toString() ;
		file_writer.write( data ) ;
		System.out.println( "Success" ) ;
		file_writer.close() ;
		reader.close() ;
	}
	private static String get_file_name(String site_name) {
		String site = new String(site_name);
		if(site.startsWith("http://www.")){
			site = site.replace("http://www.", "");
		}
		else if(site.startsWith("www.")){
			site = site.replace("www.","");
		}
		else{
			site  =site.replace("http://","");
		}
		if(site.endsWith(".com")){
			site = site.replace(".com","");
		}
		else if(site.endsWith(".co.in")){
			site = site.replace(".co.in", "");
		}
		site = ("uploads/"+site+".txt") ;
		return site ;
	}
}
