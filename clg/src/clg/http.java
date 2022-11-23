package clg;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.Builder;
import java.net.http.HttpResponse;

//import com.sun.org.apache.xerces.internal.util.URI;

public class http {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		String st="https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_confirmed_US.csv";
		var a=HttpRequest.newBuilder().GET().uri(URI.create(st)).build();
		var b=HttpClient.newBuilder().build();
		var c=b.send(a,HttpResponse.BodyHandlers.ofString());
		System.out.println(c.body());
	}

}
//String st="https://coronavirus-19-api.herokuapp.com/all";
//var str = HttpRequest.newBuilder().GET().uri(java.net.URI.create(st)).build();
//var cl=HttpClient.newBuilder().build();
//var a=cl.send(str, HttpResponse.BodyHandlers.ofString());
//System.out.println(a.body());