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
@WebServlet(urlPatterns = {"/Create_Event"})
public class Create_Event extends HttpServlet {

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
        
        String studentid = request.getParameter("studentid");
        String ename = request.getParameter("ename").trim();
        String etime = request.getParameter("etime").trim();
        String elocation = request.getParameter("elocation").trim();
        String edate = request.getParameter("edate").trim();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/alumniportal","root","student");
            Statement stmt = conn.createStatement();
            ResultSet rs;
        if(ename.equals("")||etime.equals("")||elocation.equals("")||edate.equals("")){
            request.setAttribute("eventmessage", "Please enter valid details for your event.");
            
            String sql = "select password from login where studentid='"+studentid+"';";
            rs = stmt.executeQuery(sql);
            rs.first();
            request.setAttribute("user", studentid);
            request.setAttribute("password", rs.getString("password"));
            request.getRequestDispatcher("HomePage_Student").forward(request, response);
            return;
        }
        //Incrementer in = new Incrementer();
        RMI_Client client = new RMI_Client();
        
        String sql = "select max(eventid) as max from event;";
        System.out.println(sql);
        rs = stmt.executeQuery(sql);
        rs.first();
        sql = "insert into event values('"+client.callServerRMI(rs.getString("max"))+"','"+ename+"','"+elocation+"','"+etime+"','"+edate+"');";
        System.out.println(sql);
        stmt.executeUpdate(sql);
        System.out.println(sql);
        sql = "select password from login where studentid='"+studentid+"';";
            rs = stmt.executeQuery(sql);
            rs.first();
        request.setAttribute("user", studentid);
        request.setAttribute("eventmessage", "Your event has been created!");
        request.setAttribute("password", rs.getString("password"));
        request.getRequestDispatcher("HomePage_Student").forward(request, response);
        return;
        
        }catch(Exception e){
                System.out.println(e);
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
