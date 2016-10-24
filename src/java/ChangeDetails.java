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
@WebServlet(urlPatterns = {"/ChangeDetails"})
public class ChangeDetails extends HttpServlet {

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
        String fromstudentid = (String)request.getParameter("fromstudentid");
        
        String studentid = (String)request.getParameter("studentid");
        System.out.println("STUDENTID: "+studentid);
        System.out.println(studentid+" CHANGE DETAILS "+fromstudentid);
        if(!fromstudentid.equals(studentid)){
        request.setAttribute("fromstudentid", fromstudentid);
       request.setAttribute("studentid", studentid);
       request.getRequestDispatcher("ProfilePage").forward(request, response);
       return;
        }
        
            String sql="select * from student where studentid='"+studentid+"';";
            
            System.out.println(sql);
            //String sql="select * from student where firstname='Sid' and lastname='Sahay'";
                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/alumniportal","root","student");
                        Statement stmt = conn.createStatement();
                        ResultSet rs = stmt.executeQuery(sql);
                        System.out.println("REACHED HERE TWO");
                        
                        rs.first();
                        
                        request.setAttribute("dob", rs.getString("dob"));
                        request.setAttribute("yog", rs.getString("yearofgrad"));
                        request.setAttribute("city", rs.getString("currentcity"));
                        request.setAttribute("phonenum", rs.getString("phonenum"));
                        request.setAttribute("email", rs.getString("emailaddress"));
                        
                        sql = "select password from login where studentid='"+studentid+"';";
                        rs = stmt.executeQuery(sql);
                        rs.first();
                        
                        request.setAttribute("password", rs.getString("password"));
                        request.setAttribute("studentid", studentid);
                        
                        request.getRequestDispatcher("/changedetails.jsp").forward(request, response);
                        
                    }catch(Exception e){
                        System.out.println(e);
                        //JOptionPane.showMessageDialog(this, e.getMessage());
                    }
           // out.println("</body></html>");
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
        //CHANGE DETAILS INTER
        System.out.println("chnageasdasdasd");
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
        String studentid = (String)request.getParameter("studentid");
        String fromstudentid = (String)request.getParameter("fromstudentid");
        String dob = (String)request.getParameter("dob");
        String yog = (String)request.getParameter("yog");
        String city = (String)request.getParameter("city");
        String email = (String)request.getParameter("email");
        String phonenum = (String)request.getParameter("phonenum");
        String password = (String)request.getParameter("password");
        
        System.out.println("STUDENTID: "+studentid);
        
        
            
        
        String sql;//="select * from student where firstname='Sid' and lastname='Sahay'";
                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/alumniportal","root","student");
                        Statement stmt = conn.createStatement();
                        //ResultSet rs = stmt.executeQuery(sql);
                        System.out.println("REACHED HERE TWO");
                        sql = "update student set dob='"+dob+"', yearofgrad='"+yog+"', currentcity='"+city+"', phonenum='"+phonenum+"',emailaddress='"+email+"' where studentid='"+studentid+"';";
                        stmt.executeUpdate(sql);
                        
                        request.setAttribute("studentid", studentid);
                        request.setAttribute("fromstudentid", fromstudentid);
                        
                        if(password.equals("")){
                            
                        }else{
                            sql = "update login set password='"+password+"' where studentid='"+studentid+"';";
                            stmt.executeUpdate(sql);
                        
                        }
                        request.getRequestDispatcher("/ForwardToHomePage").forward(request, response);
                        
                    }catch(Exception e){
                        System.out.println(e);
                        //JOptionPane.showMessageDialog(this, e.getMessage());
                    }
        
        //processRequest(request, response);
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
