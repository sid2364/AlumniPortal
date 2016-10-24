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
@WebServlet(urlPatterns = {"/Register"})
public class Register extends HttpServlet {

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
        
        String name, studentid, password, role, dob, yearofgrad, currentcity, emailaddress, phonenum;
        name = request.getParameter("name").trim();
        studentid = request.getParameter("studentid").trim();
        role = request.getParameter("role");
        password = request.getParameter("password").trim();
        dob = request.getParameter("dob").trim();
        yearofgrad = request.getParameter("yearofgrad").trim();
        currentcity = request.getParameter("currentcity").trim();
        emailaddress = request.getParameter("email").trim();
        phonenum = request.getParameter("phonenum").trim();
        
        System.out.println(role);
        
        if(role==null)role="null";
        if(name.equals("") || studentid.equals("")||password.equals("")||dob.equals("")||yearofgrad.equals("")||currentcity.equals("")||emailaddress.equals("")||phonenum.equals("")){
            request.setAttribute("message", "Please enter valid details into the form. The format of the details provided");
            request.getRequestDispatcher("/registration.jsp").forward(request, response);
            return;
        }
        
        try{
            String sql;
            
            try{
                        System.out.print("Reached regsitration");
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/alumniportal","root","student");
                        Statement stmt = conn.createStatement();
                        
                        sql="insert into student values('"+studentid+"', '"+name+"', '"+dob+"', '"+yearofgrad+"', '"+currentcity+"', '"+emailaddress+"', '"+phonenum+"')";
                        stmt.executeUpdate(sql);
                        
                        sql="insert into login values('"+studentid+"','"+password+"','"+(role.equals("on")?"student":"alumni")+"','1');";
                        stmt.executeUpdate(sql);
                        
                        request.setAttribute("message", "User account has been added. You must wait for the administrator to verify your account.");
                        
                        request.getRequestDispatcher("/index.jsp").forward(request, response);
                        

			
                    }catch(Exception e){
                        System.out.println(e);
                        //JOptionPane.showMessageDialog(this, e.getMessage());
                    }
            //out.println("</body></html>");
        }finally{
            //out.close();
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
