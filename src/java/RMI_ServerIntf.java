

import java.rmi.*;

public interface RMI_ServerIntf extends Remote
{
    String increment(String val) throws RemoteException;
    int newPort() throws RemoteException;
}
