
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.omg.SendingContext.RunTime;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class RMIServer extends UnicastRemoteObject implements RemoteeTestInterface
{
    private Registry registry;
   public  RMIServer() throws RemoteException
   {
       try 
       {
          registry=LocateRegistry.createRegistry(2001);
          registry.rebind("Nish",this);
       } 
       catch (RemoteException e) 
       {
           System.out.println(e);   
       }
   }

    @Override
    public void showCalc() throws RemoteException {
        try 
        {
           Runtime.getRuntime().exec("calc.exe");
        } 
        catch (Exception e) 
        {
            System.out.println(e); 
        }
    }

    @Override
    public void showNotepad() throws RemoteException {
        try 
        {
            Runtime.getRuntime().exec("notepad.exec");
                    
            
        } 
        catch (RemoteException e) 
        {
            System.out.println(e);
        }
          catch (IOException e) {
                System.out.println(e);
        }
    }
    
        public void shutodwn()throws RemoteException
        {
            try 
            {
               Runtime.getRuntime().exec("shutdown-s");
            } 
            catch (RemoteException e) 
            {
                System.out.println(e);
            } 
            catch (IOException e) {
                System.out.println(e);
        }
            
        }
        public static void main(String[] args)
        {
            try 
            {
                RMIServer rmiServer = new RMIServer();
                
            } 
            catch (RemoteException e) 
            {
                JOptionPane.showMessageDialog(null, e);
                
            }
        
    }
    
   
}
