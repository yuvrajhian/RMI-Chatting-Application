
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class RMClient 
{
    public static void main(String[] args) throws NotBoundException 
    {
       RemoteeTestInterface rti;
        Registry registry;
        try {
            registry=LocateRegistry.getRegistry("127.0.0.1",2001);
            rti=(RemoteeTestInterface) registry.lookup("Nish");
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter calc/notpad/shutdown to call method");
            String choice=sc.next();
            if(choice.equals("calc"))
             {
                 rti.showCalc();
                
            }
            else if(choice.equals("notepad"))
             {
                 rti.showNotepad();
                
            }
            else if(choice.equals("shutdown"))
             {
                 rti.shutodwn();
                
            }
            else
            {
                System.out.println("Illegal Choice");
            }
        }
        catch (RemoteException e) 
        {
            System.out.println(e);
        }
        
    }
    
}
