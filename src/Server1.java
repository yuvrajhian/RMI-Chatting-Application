
import java.io.InputStream;
import java.net.ServerSocket;
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
public class Server1 
{
    public static void main(String[] args) 
    {
          try
        {
            while(true)
            {
                ServerSocket ss=new ServerSocket(101);
                System.out.println("waiting...");
                Socket s=ss.accept();
                InputStream in=s.getInputStream();
                
                byte[] b=new byte[100];
                in.read(b);
                String msg=new String(b);
                
                if(msg.equalsIgnoreCase("Stop"))
                {
                    break;
                }
                System.out.println("server received :"+msg);
                in.close();
                s.close();
                ss.close();
            }
        }
        catch (Exception ex) 
        {
            System.out.println(ex);
        }
}
        
    }
    

