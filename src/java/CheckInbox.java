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
@WebServlet(urlPatterns = {"/CheckInbox"})
public class CheckInbox extends HttpServlet {

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
           String studentid = (String)request.getParameter("studentid");
        request.setAttribute("studentid", studentid);
        
        
        try{
            String sql="select * from inbox where studentid='"+studentid+"';";
            
            System.out.println(sql);
            //String sql="select * from student where firstname='Sid' and lastname='Sahay'";
                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/alumniportal","root","student");
                        Statement stmt = conn.createStatement();
                        Statement stmt2 = conn.createStatement();
                        ResultSet rs = stmt.executeQuery(sql);
                       ResultSet rs2;
                        String block="<table width='100%'><th><tr><td><u><b>From</b></u></td><td><u><b>Message</u></b></td></tr></th>";
                        String sql2;
                        while(rs.next()){
                            sql2="select name from student where studentid='"+rs.getString("frm")+"';";
                            System.out.println(sql2);
                            rs2 = stmt2.executeQuery(sql2);
                            rs2.first();
                            block += "<tr><td><u>"+ rs2.getString("name")+"</u><br></td><td>"+rs.getString("message")+"<br></td></tr>";
                           
                        }
                        block = block + "</table>";
                        
                        System.out.println(block);
                        sql = "select post from annoucement order by annid desc;";
			rs = stmt.executeQuery(sql);
			String ann="";
			while(rs.next()){
				ann = ann + " &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<bold>" + rs.getString("post") + "</bold> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
                        }
                       request.setAttribute("annoucement", ann);
                       request.setAttribute("block", block);
                       request.setAttribute("studentid", studentid);
                        
                       request.getRequestDispatcher("/inbox.jsp").forward(request, response);
                        

			
                    }catch(Exception e){
                        System.out.println(e);
                        //JOptionPane.showMessageDialog(this, e.getMessage());
                    }
           
        }finally{
           
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
