

import java.net.*;
import java.rmi.*;

public class RMI_Server{
    public static void main(String args[]){
        try{
            RMI_ServerImpl addServerImpl = new RMI_ServerImpl();
            Naming.rebind("RMI_Server", addServerImpl);
        }catch(Exception e){
            e.printStackTrace();
        }
}
}
