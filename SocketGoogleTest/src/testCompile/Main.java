package testCompile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Main {
	private static Socket client;
	private static BufferedReader reader;
	public static void main(String[] args) throws IOException {
		try {
			client = new Socket("www.google.com", 80);
			reader = new BufferedReader(new InputStreamReader(System.in));
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			client.close();
		}
	}

}
