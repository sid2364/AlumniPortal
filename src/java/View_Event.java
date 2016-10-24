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
@WebServlet(urlPatterns = {"/View_Event"})
public class View_Event extends HttpServlet {

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
     System.out.println("Inside VIEWEVENTS Servlet");
        String studentid = (String)request.getParameter("studentid");
        request.setAttribute("studentid", studentid);
        
        
        try{
            String sql="select * from event;";
            
            System.out.println(sql);
            //String sql="select * from student where firstname='Sid' and lastname='Sahay'";
                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/alumniportal","root","student");
                        Statement stmt = conn.createStatement();
                        ResultSet rs = stmt.executeQuery(sql);
                       ResultSet rs2, rs3;
                        Statement stmt3 = conn.createStatement();
                        Statement stmt2 = conn.createStatement(); 
                        String block="<table width='400px'><th><tr><td><u><b>Name of Event</b></u></td><td>&nbsp;&nbsp;&nbsp;&nbsp;</td></tr></th>";
                        
                        while(rs.next()){
                            block += "<tr><td><u>"+ rs.getString("eventname")+"</u><br>"+rs.getString("time")+"<br>"+rs.getString("location")+"<br>"+rs.getString("date")+"</td>";
                            String sql2="select distinct * from attending where eventid='"+rs.getString("eventid")+"' and studentid='"+studentid+"';";
                            rs2=stmt2.executeQuery(sql2);
                            System.out.println(sql2);
                            String sql3 = "select * from attending join student on student.studentid=attending.studentid where eventid='"+rs.getString("eventid")+"';";
                            String names = "People attending this event: ";
                            rs3 = stmt3.executeQuery(sql3);
                            if(!rs3.first()){
                                System.out.println("Nobody attending this event..");
                                names = "Currently nobody is attending this event!";
                            }else{
                                rs3.beforeFirst();
                                while(rs3.next()){
                                    System.out.println("THERE ARE PEOPLE ATTENDING THIS EVENT");
                                    names+="<form action='ProfilePage_Intermediate' method='post'> <input style=\"background:transparent; border:transparent; color:black;\" class=\"btn\" type=\"submit\" value='"+rs3.getString("student.name")+"'/><input type=\"hidden\" value='"+rs3.getString("student.studentid")+"' name='studentid' /><input type=\"hidden\" value='"+studentid+"' name='fromstudentid' /></form>";
                                }
                            }
                            if(!rs2.first()){
                                 block += "<td><form action='View_Event' method='post'> <input style=\"background:transparent; border:transparent; color:black;\" class=\"btn\" type=\"submit\" value='Not Going'/><input type=\"hidden\" value='"+rs.getString("eventid")+"' name='eventid' /><input type=\"hidden\" value='"+studentid+"' name='studentid' /><input type=\"hidden\" value='notgoing' name='going' /></form></td><td>"+names+"</td></tr>";
                            }else{
                                 block += "<td><form action='View_Event' method='post'> <input style=\"background:transparent; border:transparent; color:black;\" class=\"btn\" type=\"submit\" value='Going'/><input type=\"hidden\" value='"+rs.getString("eventid")+"' name='eventid' /><input type=\"hidden\" value='"+studentid+"' name='studentid' /><input type=\"hidden\" value='going' name='going' /></form></td><td>"+names+"</td></tr>";
                            }
                        }
                        block = block + "</table>";
                        
                        sql = "select post from annoucement order by annid desc;";
			rs = stmt.executeQuery(sql);
			String ann="";
			while(rs.next()){
				ann = ann + " &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<bold>" + rs.getString("post") + "</bold> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
                        }
                       request.setAttribute("annoucement", ann);
                       request.setAttribute("block", block);
                       request.setAttribute("studentid", studentid);
                        
                       request.getRequestDispatcher("/viewevents.jsp").forward(request, response);
                        

			
                    }catch(Exception e){
                        System.out.println(e);
                        //JOptionPane.showMessageDialog(this, e.getMessage());
                    }
           // out.println("</body></html>");
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
        //String studentid = (String)request.getParameter("studentid");
        String eventid = (String)request.getParameter("eventid");
        String going = request.getParameter("going");
        String studentid = (String)request.getParameter("studentid");
        System.out.println(going+studentid);
        
        try{
            String sql;
            
            
            try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/alumniportal","root","student");
                        Statement stmt = conn.createStatement();
                      //  ResultSet rs = stmt.executeQuery(sql);
                      
                        if(going.equals("notgoing")){
                            sql = "insert into attending values('"+eventid+"', '"+studentid+"');";
                            stmt.executeUpdate(sql);
                        }
                        else if(going.equals("going")){
                            sql = "delete from attending where eventid='"+eventid+"' and studentid='"+studentid+"';";
                            stmt.executeUpdate(sql);

                        }

                    }catch(Exception e){
                        System.out.println(e);
                        //JOptionPane.showMessageDialog(this, e.getMessage());
                    }
            //out.println("</body></html>");
        }finally{
           // out.close();
        }
        try{
            String sql="select * from event;";
            
            System.out.println(sql);
            //String sql="select * from student where firstname='Sid' and lastname='Sahay'";
                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/alumniportal","root","student");
                        Statement stmt = conn.createStatement();
                        ResultSet rs = stmt.executeQuery(sql);
                       ResultSet rs2, rs3;
                        
                        Statement stmt2 = conn.createStatement(); 
                        Statement stmt3 = conn.createStatement(); 
                        String block="<table width='400px'><th><tr><td><u><b>Name of Event</b></u></td><td>&nbsp;&nbsp;&nbsp;&nbsp;</td></tr></th>";
                        /*                       
                        while(rs.next()){
                            block += "<tr><td><u>"+ rs.getString("eventname")+"</u><br>"+rs.getString("time")+"<br>"+rs.getString("location")+"<br>"+rs.getString("date")+"</td>";
                            String sql2="select distinct * from attending where eventid='"+rs.getString("eventid")+"' and studentid='"+studentid+"';";
                            System.out.println(sql2);
                            rs2=stmt2.executeQuery(sql2);
                            System.out.println(sql2);
                            if(!rs2.first()){
                                 block += "<td><form action='View_Event' method='post'> <input style=\"background:transparent; border:transparent; color:black;\" class=\"btn\" type=\"submit\" value='Not Going'/><input type=\"hidden\" value='"+rs.getString("eventid")+"' name='eventid' /><input type=\"hidden\" value='"+studentid+"' name='studentid' /><input type=\"hidden\" value='notgoing' name='going' /></form></td></tr>";
                            }else{
                                     block += "<td><form action='View_Event' method='post'> <input style=\"background:transparent; border:transparent; color:black;\" class=\"btn\" type=\"submit\" value='Going'/><input type=\"hidden\" value='"+rs.getString("eventid")+"' name='eventid' /><input type=\"hidden\" value='"+studentid+"' name='studentid' /><input type=\"hidden\" value='going' name='going' /></form></td></tr>";
                            }
                           
                        }
                        block = block + "</table>";
                        */
                         while(rs.next()){
                            block += "<tr><td><u>"+ rs.getString("eventname")+"</u><br>"+rs.getString("time")+"<br>"+rs.getString("location")+"<br>"+rs.getString("date")+"</td>";
                            String sql2="select distinct * from attending where eventid='"+rs.getString("eventid")+"' and studentid='"+studentid+"';";
                            rs2=stmt2.executeQuery(sql2);
                            System.out.println(sql2);
                            String sql3 = "select * from attending join student on student.studentid=attending.studentid where eventid='"+rs.getString("eventid")+"';";
                            String names = "People attending this event: ";
                            rs3 = stmt3.executeQuery(sql3);
                            if(!rs3.first()){
                                System.out.println("Nobody attending this event..");
                                names = "Currently nobody is attending this event!";
                            }else{
                                rs3.beforeFirst();
                                while(rs3.next()){
                                    System.out.println("THERE ARE PEOPLE ATTENDING THIS EVENT");
                                    names+="<form action='ProfilePage_Intermediate' method='post'> <input style=\"background:transparent; border:transparent; color:black;\" class=\"btn\" type=\"submit\" value='"+rs3.getString("student.name")+"'/><input type=\"hidden\" value='"+rs3.getString("student.studentid")+"' name='studentid' /><input type=\"hidden\" value='"+studentid+"' name='fromstudentid' /></form>";
                                }
                            }
                            if(!rs2.first()){
                                 block += "<td><form action='View_Event' method='post'> <input style=\"background:transparent; border:transparent; color:black;\" class=\"btn\" type=\"submit\" value='Not Going'/><input type=\"hidden\" value='"+rs.getString("eventid")+"' name='eventid' /><input type=\"hidden\" value='"+studentid+"' name='studentid' /><input type=\"hidden\" value='notgoing' name='going' /></form></td><td>"+names+"</td></tr>";
                            }else{
                                 block += "<td><form action='View_Event' method='post'> <input style=\"background:transparent; border:transparent; color:black;\" class=\"btn\" type=\"submit\" value='Going'/><input type=\"hidden\" value='"+rs.getString("eventid")+"' name='eventid' /><input type=\"hidden\" value='"+studentid+"' name='studentid' /><input type=\"hidden\" value='going' name='going' /></form></td><td>"+names+"</td></tr>";
                            }
                        }
                        block = block + "</table>";
                        
                       /////////////////////////////////
                        sql = "select post from annoucement order by annid desc;";
			rs = stmt.executeQuery(sql);
			String ann="";
			while(rs.next()){
				ann = ann + " &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<bold>" + rs.getString("post") + "</bold> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
                        }
                       request.setAttribute("annoucement", ann);
                       request.setAttribute("block", block);
			request.setAttribute("studentid", studentid);
                        
                        request.getRequestDispatcher("/viewevents.jsp").forward(request, response);
                        

			
                    }catch(Exception e){
                        System.out.println(e);
                        //JOptionPane.showMessageDialog(this, e.getMessage());
                    }
            //out.println("</body></html>");
        }finally{
            //out.close();
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
