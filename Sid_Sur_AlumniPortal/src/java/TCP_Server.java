import java.io.*;
import java.net.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Timer;

class TCP_Server{

public void makeServer(int port)throws Exception{

    System.out.println("Running Server, before ServerSocket");
    
    ServerSocket ss=new ServerSocket(port);
    Socket s=ss.accept();
    
    System.out.println("Running the TCP_Server");
        
    DataInputStream din=new DataInputStream(s.getInputStream());
    DataOutputStream dout=new DataOutputStream(s.getOutputStream());
    
    
    String messageold="",sendToClient="";
    String[] message = new String[3];

    messageold=din.readUTF();
    message = messageold.split("###");
    for(int i=0;i<3;i++)System.out.print(message[i]);
    
    //add message to database
    RMI_Client client = new RMI_Client();
    
    
    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/alumniportal","root","student");
                        Statement stmt = conn.createStatement();
                        ResultSet rs;
                        String sql = "select max(messageid) as max from inbox;";
                        System.out.println(sql);
                        rs = stmt.executeQuery(sql);
                        rs.first();
                        sql = "insert into inbox values('"+client.callServerRMI(rs.getString("max"))+"', '"+message[0]+"', '"+message[1]+"', '"+message[2]+"');";
                        
                        stmt.executeUpdate(sql);
			
                        sendToClient = "success";
                        

                        
                    }catch(Exception e){
                        System.out.println(e);
                         sendToClient = "failure";
                    }finally{
                         dout.writeUTF(sendToClient);
                        dout.flush();
                    }
    
                        din.close();
                        s.close();
                        ss.close();
   
}
}