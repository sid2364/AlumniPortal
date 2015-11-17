/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USER
 */
@WebServlet(urlPatterns = {"/Send_Message"})
public class Send_Message extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        response.setContentType("text/html;charset-UTF-8");
        String tostudentname = (String)request.getParameter("tostudentname");
        String fromstudentid = (String)request.getParameter("fromstudentid");
        String message = (String)request.getParameter("message");
        
        
            
            try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/alumniportal","root","student");
                        Statement stmt = conn.createStatement();
                        ResultSet rs;
                        System.out.println("REACHED HERE TWO");
                        
                        String sql="select studentid from student where name='"+tostudentname+"';";
                        rs = stmt.executeQuery(sql);
                        System.out.println(sql);
                        rs.first();
                        String tostudentid = rs.getString("studentid");
            
                        TCP_Client client = new TCP_Client();
                        
                        String messageFromServer = client.callServer(tostudentid+"###"+fromstudentid+"###"+message);
                        
                        
                        sql="select * from student where studentid='"+tostudentid+"';";
            
                        rs = stmt.executeQuery(sql);
                        System.out.println("REACHED HERE TWO");
                        
                        rs.first();
                        
                        request.setAttribute("dob", rs.getString("dob"));
                        request.setAttribute("yog", rs.getString("yearofgrad"));
                        request.setAttribute("city", rs.getString("currentcity"));
                        request.setAttribute("phonenum", rs.getString("phonenum"));
                        request.setAttribute("email", rs.getString("emailaddress"));
                        
                        
                        sql = "select post from annoucement order by annid desc;";
			rs = stmt.executeQuery(sql);
			String ann="";
			while(rs.next()){
				ann = ann + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<bold>" + rs.getString("post") + "</bold> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ";
                        }
                                                
                        request.setAttribute("annoucement", ann);
                        
                        sql = "select name from student where studentid='"+tostudentid+"';";
                        rs = stmt.executeQuery(sql);
                        rs.first(); 
                        request.setAttribute("name",rs.getString("name"));
                        
                        sql=" select eventname, time, date from event where eventid in (select eventid from attending where studentid='"+tostudentid+"')";
                        rs = stmt.executeQuery(sql);
			String events="";
			while(rs.next()){
				events = events + "<bold><u><font size='4' >" + rs.getString("eventname") + "</font></u></bold> <br>"+rs.getString("time")+"<br>"+rs.getString("date")+"<br><br>";
                        }
                        if(events.equals(""))events="This person is not attending any upcoming events.";
                        sql="select role from login where studentid='"+tostudentid+"';";
                        rs = stmt.executeQuery(sql);
                        rs.first();
                        String t2="Now an ", t = rs.getString("role");
                        
                        if(t.equals("student"))t2="Currently a ";
                        
                        
                        request.setAttribute("student", t2+(""+(rs.getString("role").charAt(0))).toUpperCase()+rs.getString("role").substring(1));
                        request.setAttribute("message", messageFromServer);
                        request.setAttribute("events", events);
                        request.setAttribute("fromstudentid", fromstudentid);
                        request.setAttribute("studentid", tostudentid);
                        request.getRequestDispatcher("/profilepage.jsp").forward(request, response);
                        
                        
                    }catch(Exception e){
                        System.out.println(e);
                        //JOptionPane.showMessageDialog(this, e.getMessage());
                    }
        
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
