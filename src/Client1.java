
import java.io.OutputStream;
import java.net.Socket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Client1 
{
    public static void main(String[] args) 
    {
        try 
        {
               Socket s=new Socket("192.168.43.81",101);
                System.out.println("Client Sending...");
                OutputStream out=s.getOutputStream();
                String msg="Stop Hello";
                out.write(msg.getBytes());
                out.close();
                s.close();
               
               System.out.println("client sent");   
            
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
        
    }
    
}
