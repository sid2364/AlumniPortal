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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USER
 */
@WebServlet(urlPatterns = {"/HomePage_Admin"})
public class HomePage_Admin extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset-UTF-8");
        
        try{
            String sql;
            //String dept;
            //System.out.println(sql);
            //String sql="select * from student where firstname='Sid' and lastname='Sahay'";
                    try{
                        System.out.print("Reached admin");
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/alumniportal","root","student");
                        Statement stmt = conn.createStatement();
                        ResultSet rs;// = stmt.executeQuery(sql);
                        
                        sql = "select post from annoucement order by annid desc;";
			rs = stmt.executeQuery(sql);
			String ann="";
			while(rs.next()){
				ann = ann + " &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<bold>" + rs.getString("post") + "</bold> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
                        }
                        //
                        
                        sql = "select student.studentid, name, blocked from student join login on student.studentid=login.studentid where name <> 'Administrator';";
                        rs = stmt.executeQuery(sql);
                        rs.beforeFirst();
                        String block="<table width='400px'><th><tr><td><u>Name of User</u></td><td>&nbsp;&nbsp;&nbsp;&nbsp;<u>Status</u></td></tr></th>";
                        
                        while(rs.next()){
                            block += "<tr><td>"+ rs.getString("name")+"</td>";
                            block += "<td><form action='HomePage_Admin' method='post'> <input style=\"background:transparent; border:transparent; color:black;\" class=\"btn\" type=\"submit\" value='"+(rs.getString("blocked").equals("1")?"Blocked":"Unblocked")+"'/><input type=\"hidden\" value='"+rs.getString("blocked")+"' name='status' /><input type=\"hidden\" value='"+rs.getString("studentid")+"' name='name' /></form></td></tr>";
                        }
                        block = block + "</table>";
                        System.out.println(block);
                        
                        //request.setAttribute("userid", firstname);
                        request.setAttribute("username", "Admin");
                        request.setAttribute("block", block);
                        request.setAttribute("annoucement", ann);
			
                        request.getRequestDispatcher("/adminhome.jsp").forward(request, response);
                        

			
                    }catch(Exception e){
                        System.out.println(e);
                        //JOptionPane.showMessageDialog(this, e.getMessage());
                    }
            out.println("</body></html>");
        }finally{
            out.close();
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
        System.out.println("GET");
            
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
        System.out.println("TOGGLE VALUES");
        String studentid = request.getParameter("name");
        String blocked = request.getParameter("status");
        System.out.println(studentid+" "+blocked);
        
        String newb = blocked.equals("1")?"0":"1";
        try {
            Class.forName("com.mysql.jdbc.Driver");
        
                        Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/alumniportal","root","student");
                        Statement stmt = conn.createStatement();
                        ResultSet rs;// = stmt.executeQuery(sql);
                        
        String sql="update login set blocked='"+newb+"' where studentid='"+studentid+"';";
            System.out.println(sql);
            
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
        } catch (Exception ex) {
            Logger.getLogger(HomePage_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
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
