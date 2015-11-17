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
 * @author student
 */
@WebServlet(urlPatterns = {"/HomePage_Student"})
public class HomePage_Student extends HttpServlet {

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
        doPost(request, response);
        
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
        //processRequest(request, response);
        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset-UTF-8");
     
        String firstname = (String)request.getAttribute("user");
        String password = (String)request.getAttribute("password");
        System.out.println(firstname+password);
        try{
            String people = (String)request.getAttribute("people");
            request.setAttribute("people", people);
        }catch(Exception e ){
            System.out.println("Did not receive value for 'people'");
        }
        
        try{
            String sql="select * from login where studentid='"+firstname+"' and password='"+password+"';";
            String dept;
            System.out.println(sql);
            //String sql="select * from student where firstname='Sid' and lastname='Sahay'";
                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/alumniportal","root","student");
                        Statement stmt = conn.createStatement();
                        ResultSet rs = stmt.executeQuery(sql);
                        if(!rs.first()){
                            String message = "Invalid user. Please try again.";
                            request.setAttribute("message", message); // This will be available as ${message}
                            request.getRequestDispatcher("/index.jsp").forward(request, response);
                            return;
                        }else{
                            if(firstname.equals("admin") && password.equals("admin")){
                               response.sendRedirect("HomePage_Admin");
                               return;
                            }
                        }
                        sql = "select blocked from login where studentid='"+firstname+"'";
                        rs = stmt.executeQuery(sql);
                        rs.first();
                        if(rs.getString("blocked").equals("1")){    
                            String message = "Your account has been blocked. Please try again later.";
                            request.setAttribute("message", message);
                            request.getRequestDispatcher("/index.jsp").forward(request, response);
                            return;
                        }
                        System.out.println("REACHED HERE");
                        //TODO - retrieve news feed, annoucements, username, 
                        
                        sql="select feed.post as f, student.name as n from feed inner join student on feed.studentid=student.studentid order by postid desc;";
                        rs = stmt.executeQuery(sql);
                        String feed="";
                        while(rs.next()){
                            feed = feed + "<h4>" +rs.getString("n") + "</h4>";
                            feed = feed + rs.getString("f") +" <br><br>";                            
                        }
                     	sql = "select post from annoucement order by annid desc;";
			rs = stmt.executeQuery(sql);
			String ann="";
			while(rs.next()){
				ann = ann + " &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<bold>" + rs.getString("post") + "</bold> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
                        }
                        sql = "select name from student where studentid='"+firstname+"';";
                        rs = stmt.executeQuery(sql);
                        rs.first(); 
                        System.out.println(ann);
                        
                        
                        request.setAttribute("userid", firstname);
                        request.setAttribute("username", rs.getString("name"));
                        request.setAttribute("feed", feed);
			request.setAttribute("annoucement", ann);
			
                        request.getRequestDispatcher("/homepage.jsp").forward(request, response);
                        

			
                    }catch(Exception e){
                        System.out.println(e);
                        //JOptionPane.showMessageDialog(this, e.getMessage());
                    }
            out.println("</body></html>");
        }finally{
            out.close();
        }
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
