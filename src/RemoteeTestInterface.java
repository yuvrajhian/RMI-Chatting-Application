
import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public interface RemoteeTestInterface extends Remote
{
    public void showCalc() throws RemoteException;
    public void showNotepad() throws RemoteException;
    public void shutodwn() throws RemoteException;
    
       
}
