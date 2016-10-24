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
@WebServlet(urlPatterns = {"/Search_ShowAll"})
public class Search_ShowAll extends HttpServlet {

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
          String studentid = request.getParameter("userid");
         //String searchfor = request.getParameter("searchfor");
         
         String sql = "select name , studentid from student where name like '%' and studentid <> 'admin';"; //add clause so user cant search for himself
         System.out.println(sql);
         try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/alumniportal","root","student");
                        Statement stmt = conn.createStatement();
                        ResultSet rs = stmt.executeQuery(sql);
                        System.out.println("REACHED HERE THREE");
                        String people="<h4>Here are all registered users:- </h4>";
                        if(!rs.first()){
                            people = "No results found. Try using an asterisk in your search for wildcard search.";
                        }else{
                            rs.first();
                        while(rs.next()){
                            people = people + " <form action='ProfilePage_Intermediate' method='post'> <input style=\"background:transparent; border:transparent; color:black;\" class=\"btn\" type=\"submit\" value='"+rs.getString("name")+"'/><input type=\"hidden\" value='"+rs.getString("studentid")+"' name='studentid' /><input type=\"hidden\" value='"+studentid+"' name='fromstudentid' /></form>";
                        }
                        }
                        sql = "select password from login where studentid='"+studentid+"';";
                        rs = stmt.executeQuery(sql);
                        rs.first();
                        System.out.println(studentid+rs.getString("password"));
                        request.setAttribute("user", studentid);
                        request.setAttribute("password", rs.getString("password"));
                        request.setAttribute("people", people);
                        request.getRequestDispatcher("HomePage_Student").forward(request, response);
       
         }catch(Exception e){
         
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
