package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en-US\">\n");
      out.write("    <style>\n");
      out.write("        .body{\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop: -20px;\n");
      out.write("\tleft: -20px;\n");
      out.write("\tright: -40px;\n");
      out.write("\tbottom: -40px;\n");
      out.write("\twidth: auto;\n");
      out.write("\theight: auto;\n");
      out.write("\tbackground-image: url(\"./manipaltwo.jpg\");//url(http://www.engineering.careers360.com/careers360_cms/newsimages/image/June2010/manipal.jpg);\n");
      out.write("\t//background-size: cover;\n");
      out.write("\t-webkit-filter: blur(5px);\n");
      out.write("\tz-index: 0;\n");
      out.write("        \n");
      out.write("}\n");
      out.write(".theme-table{\n");
      out.write("    background-image: url(\"./manipaltwo.jpg\");//url(http://www.engineering.careers360.com/careers360_cms/newsimages/image/June2010/manipal.jpg);\n");
      out.write("\t//background-size: cover;\n");
      out.write("\t//-webkit-filter: blur(5px);\n");
      out.write("        background-repeat: no-repeat; \n");
      out.write("        background-size: cover;\n");
      out.write("        background-attachment: fixed;\n");
      out.write("}\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html\">\n");
      out.write("  <title>Alumni Portal Registration</title>\n");
      out.write("  <meta name=\"author\" content=\"Jake Rocheleau\">\n");
      out.write("  <link rel=\"shortcut icon\" href=\"http://static.tmimgcdn.com/img/favicon.ico\">\n");
      out.write("  <link rel=\"icon\" href=\"http://static.tmimgcdn.com/img/favicon.ico\">\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"css/styles.css\">\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"css/switchery.min.css\">\n");
      out.write("  <script type=\"text/javascript\" src=\"js/switchery.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("  <div id=\"wrapper\">\n");
      out.write("  \n");
      out.write("  <h1>Registration</h1>\n");
      out.write("  \n");
      out.write("  <form onsubmit=\"return false\">\n");
      out.write("  <div class=\"col-2\">\n");
      out.write("    <label>\n");
      out.write("      Name\n");
      out.write("      <input placeholder=\"What is your full name?\" id=\"name\" name=\"name\" tabindex=\"1\">\n");
      out.write("    </label>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"col-2\">\n");
      out.write("    <label>\n");
      out.write("      Login ID\n");
      out.write("      <input placeholder=\"What would you like to use to log in?\" id=\"studentid\" name=\"studentid\" tabindex=\"2\">\n");
      out.write("    </label>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <div class=\"col-3\">\n");
      out.write("    <label>\n");
      out.write("      Password\n");
      out.write("      <input placeholder=\"Enter your password here.\" id=\"password\" name=\"password\" tabindex=\"3\">\n");
      out.write("    </label>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"col-3\">\n");
      out.write("    <label>\n");
      out.write("      Email\n");
      out.write("      <input placeholder=\"What is your e-mail address?\" id=\"email\" name=\"email\" tabindex=\"4\">\n");
      out.write("    </label>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"col-3\">\n");
      out.write("    <label>\n");
      out.write("      Year of Graduation\n");
      out.write("      <select tabindex=\"5\" name=\"yearofgrad\">\n");
      out.write("        <option>1955</option>\n");
      out.write("<option>1956</option>\n");
      out.write("<option>1957</option>\n");
      out.write("<option>1958</option>\n");
      out.write("<option>1959</option>\n");
      out.write("<option>1960</option>\n");
      out.write("<option>1961</option>\n");
      out.write("<option>1962</option>\n");
      out.write("<option>1963</option>\n");
      out.write("<option>1964</option>\n");
      out.write("<option>1965</option>\n");
      out.write("<option>1966</option>\n");
      out.write("<option>1967</option>\n");
      out.write("<option>1968</option>\n");
      out.write("<option>1969</option>\n");
      out.write("<option>1970</option>\n");
      out.write("<option>1971</option>\n");
      out.write("<option>1972</option>\n");
      out.write("<option>1973</option>\n");
      out.write("<option>1974</option>\n");
      out.write("<option>1975</option>\n");
      out.write("<option>1976</option>\n");
      out.write("<option>1977</option>\n");
      out.write("<option>1978</option>\n");
      out.write("<option>1979</option>\n");
      out.write("<option>1980</option>\n");
      out.write("<option>1981</option>\n");
      out.write("<option>1982</option>\n");
      out.write("<option>1983</option>\n");
      out.write("<option>1984</option>\n");
      out.write("<option>1985</option>\n");
      out.write("<option>1986</option>\n");
      out.write("<option>1987</option>\n");
      out.write("<option>1988</option>\n");
      out.write("<option>1989</option>\n");
      out.write("<option>1990</option>\n");
      out.write("<option>1991</option>\n");
      out.write("<option>1992</option>\n");
      out.write("<option>1993</option>\n");
      out.write("<option>1994</option>\n");
      out.write("<option>1995</option>\n");
      out.write("<option>1996</option>\n");
      out.write("<option>1997</option>\n");
      out.write("<option>1998</option>\n");
      out.write("<option>1999</option>\n");
      out.write("<option>2000</option>\n");
      out.write("<option>2001</option>\n");
      out.write("<option>2002</option>\n");
      out.write("<option>2003</option>\n");
      out.write("<option>2004</option>\n");
      out.write("<option>2005</option>\n");
      out.write("<option>2006</option>\n");
      out.write("<option>2007</option>\n");
      out.write("<option>2008</option>\n");
      out.write("<option>2009</option>\n");
      out.write("<option>2010</option>\n");
      out.write("<option>2011</option>\n");
      out.write("<option>2012</option>\n");
      out.write("<option>2013</option>\n");
      out.write("<option>2014</option>\n");
      out.write("<option>2015</option>\n");
      out.write("<option>2016</option>\n");
      out.write("<option>2017</option>\n");
      out.write("<option>2018</option>\n");
      out.write("<option>2019</option>\n");
      out.write("      </select>\n");
      out.write("    </label>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <div class=\"col-4\">\n");
      out.write("    <label>\n");
      out.write("      Date of Birth\n");
      out.write("      <input placeholder=\"When were you born?\" id=\"dob\" name=\"dob\" tabindex=\"6\">\n");
      out.write("    </label>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"col-4\">\n");
      out.write("    <label>\n");
      out.write("      Current City\n");
      out.write("      <input placeholder=\"How many years of experience?\" id=\"currentcity\" name=\"currentcity\" tabindex=\"7\">\n");
      out.write("    </label>\n");
      out.write("  </div>\n");
      out.write("      \n");
      out.write("    \n");
      out.write("  <div class=\"col-4\">\n");
      out.write("    <label>\n");
      out.write("      Phone Number\n");
      out.write("      <input placeholder=\"Where do we call you?\" id=\"phonenum\" name=\"phonenum\" tabindex=\"6\">\n");
      out.write("    </label>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"col-4 switch\">\n");
      out.write("    <label>Are you currently studying?</label>\n");
      out.write("    <center style=\"position:relative;margin-bottom:8px;\"><input type=\"checkbox\" class=\"js-switch\"></center>\n");
      out.write("  </div>    \n");
      out.write("  \n");
      out.write("  <div class=\"col-submit\">\n");
      out.write("    <button class=\"submitbtn\">Create User</button>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  </form>\n");
      out.write("  </div>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("var elems = Array.prototype.slice.call(document.querySelectorAll('.js-switch'));\n");
      out.write("\n");
      out.write("elems.forEach(function(html) {\n");
      out.write("  var switchery = new Switchery(html);\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
