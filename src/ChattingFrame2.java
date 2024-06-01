
import java.net.Inet4Address;
import java.net.InetAddress;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class ChattingFrame2 
{
    public static void main(String[] args) 
    {
        try
        {
             InetAddress inet= InetAddress.getLocalHost();
             System.out.println("IP:"+inet.getHostAddress());
             System.out.println("IP:"+inet.getHostName());
            
        } catch (Exception e) 
        {
            System.out.println(e); 
        }
        
    }
    
}
