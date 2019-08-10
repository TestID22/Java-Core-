/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sockettest;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author vital
 */
public class SocketTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try 
        {
            Socket s = new Socket("time-A.timefreq.bldrdoc.gov", 13);
            try 
            {
                InputStream inStream = s.getInputStream();
                Scanner in = new Scanner(inStream);
                while(in.hasNext())
                {
                    String line = in.nextLine();
                    System.out.println(line);
                }  
            } 
            finally 
            {
                s.close();
            }
        } 
        catch (IOException | Error e) 
        {
            e.printStackTrace();
        }
    }
    
}
