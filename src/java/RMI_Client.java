

import java.awt.Desktop;
import java.io.File;
import java.rmi.*;

public class RMI_Client{
    public int callServerRMI2(){
        try{
        //Runtime.getRuntime().exec("cmd /c ./RMI_Commands.bat", null, new File("./"));
            //Desktop.getDesktop().open(new File("C:\\Users\\USER\\Documents\\Sid\\College Stuff\\Sem 7 IT\\Advanced Java Programming - AJP Lab\\Sid_Sur_AlumniPortal\\src\\java\\RMI_Commands.bat"));
            
            String addServerURL = "rmi://localhost/RMI_Server";
            RMI_ServerIntf addServerIntf = (RMI_ServerIntf)Naming.lookup(addServerURL);
            
            return addServerIntf.newPort();
            
        }catch(Exception e){
            e.printStackTrace();
        }
      return 9999;
    }
    public String callServerRMI(String value){
        try{
            //Runtime.getRuntime().exec(new String[] { "cmd.exe", "/c", "./RMI_Commands.bat" } );
            //Runtime.getRuntime().exec("cmd.exe", "/c", "./RMI_Commands.bat");
            //File file = new File("./RMI_Commands.bat");
            //Desktop.getDesktop().open(file);
            //Runtime.getRuntime().exec("cmd /c .\\RMI_Commands.bat");
            //Runtime.getRuntime().exec("cmd /c ./RMI_Commands.bat", null, new File("./"));
            //Runtime.getRuntime().exec(new String[] {"cmd.exe", "/C", "./RMI_Commands.bat"});    
            //Desktop.getDesktop().open(new File("C:\\Users\\USER\\Documents\\Sid\\College Stuff\\Sem 7 IT\\Advanced Java Programming - AJP Lab\\Sid_Sur_AlumniPortal\\src\\java\\RMI_Commands.bat"));
            
            String addServerURL = "rmi://localhost/RMI_Server";
            RMI_ServerIntf addServerIntf = (RMI_ServerIntf)Naming.lookup(addServerURL);
            
            return addServerIntf.increment(value);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
/*
HOW TO EXECUTE:-
1. javac *.java
2. rmic ___ServerImpl
3. start rmiregistry
4. java ___Server
5. java ___Client [In another prompt window!]
*/