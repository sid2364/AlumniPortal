
import java.io.*;
import java.net.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

class MyRunnable implements Runnable {

    private int port;
    public MyRunnable(int port) {
        this.port = port;
    }

    @Override
    public void run() {
        TCP_Server server = new TCP_Server();
        try {
            server.makeServer(port);
        } catch (Exception ex) {
            Logger.getLogger(MyRunnable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}

public class TCP_Client{

public String callServer(String message)throws Exception{

    
    RMI_Client client = new RMI_Client();
    int port = client.callServerRMI2();
    System.out.println("THIS IS THE NEW PORT: "+port);
    
    MyRunnable myRunnable = new MyRunnable(port);
    Thread t = new Thread(myRunnable);
    t.start();
    
    
    Socket s=new Socket("localhost",port);
    DataInputStream din=new DataInputStream(s.getInputStream());
    DataOutputStream dout=new DataOutputStream(s.getOutputStream());
    
    String str2="";
    dout.writeUTF(message);
    dout.flush();
    str2=din.readUTF();
    System.out.println("Server says: "+str2);

    dout.close();
    s.close();
    
    if(str2.equals("success")){
        return "Your message has been sent.";
    }else{
        return "Your message was not sent. Try again later.";
    }
}
}