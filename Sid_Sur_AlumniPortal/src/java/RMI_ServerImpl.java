

import java.rmi.*;
import java.rmi.server.*;

public class RMI_ServerImpl extends UnicastRemoteObject implements RMI_ServerIntf{
    public RMI_ServerImpl() throws RemoteException{

    }

    public String increment(String val) throws RemoteException{
        int old = Integer.parseInt(val);
        return ""+(old+1);
    }
    public int newPort() throws RemoteException{
        int randomNumber = ( int )( Math.random() * 9999 );

        if( randomNumber <= 3000 ) {
            randomNumber = randomNumber + 1000;
        }
        System.out.println(randomNumber);
        return randomNumber;
        
        
    }
}
