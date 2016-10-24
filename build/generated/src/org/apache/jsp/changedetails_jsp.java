package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class changedetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<title>Change Details</title>\n");
      out.write("\n");
      out.write("    <link rel=\"shortcut icon\" href=\"./favicon.ico\">\n");
      out.write("  <link rel=\"icon\" href=\"./favicon.ico\">\n");
      out.write("  <style>\n");
      out.write("    * {\n");
      out.write("      font-family: Helvetica;\n");
      out.write("    }\n");
      out.write("  .btn {\n");
      out.write("  background: #000000;\n");
      out.write("  background-image: -webkit-linear-gradient(top, #000000, #cccccc);\n");
      out.write("  background-image: -moz-linear-gradient(top, #000000, #cccccc);\n");
      out.write("  background-image: -ms-linear-gradient(top, #000000, #cccccc);\n");
      out.write("  background-image: -o-linear-gradient(top, #000000, #cccccc);\n");
      out.write("  background-image: linear-gradient(to bottom, #000000, #cccccc);\n");
      out.write("  -webkit-border-radius: 28;\n");
      out.write("  -moz-border-radius: 28;\n");
      out.write("  border-radius: 28px;\n");
      out.write("  font-family: Arial;\n");
      out.write("  color: #ffffff;\n");
      out.write("  font-size: 12px;\n");
      out.write("  padding: 7px 17px 7px 17px;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn:hover {\n");
      out.write("  background: #79c3f2;\n");
      out.write("  background-image: -webkit-linear-gradient(top, #79c3f2, #3498db);\n");
      out.write("  background-image: -moz-linear-gradient(top, #79c3f2, #3498db);\n");
      out.write("  background-image: -ms-linear-gradient(top, #79c3f2, #3498db);\n");
      out.write("  background-image: -o-linear-gradient(top, #79c3f2, #3498db);\n");
      out.write("  background-image: linear-gradient(to bottom, #79c3f2, #3498db);\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write(".body{\n");
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
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body style=\"margin: 0px; padding: 0px; font-family: 'Trebuchet MS',verdana;\">\n");
      out.write("    <div class=\"theme-table\">\n");
      out.write("<table  class=\"theme-table\" padding=\"10\" spacing=\"10px\" width=\"100%\" height=\"100%\" cellpadding=\"5\" cellspacing=\"0\" border=\"0\">\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<!-- ============ HEADER SECTION ============== -->\n");
      out.write("<td colspan=\"3\" style=\"height: 80px; width:100%; position: fixed; z-index: 2\" bgcolor=\"#4f4f4f\" ><!-- bgcolor=\"#787878\" -->\n");
      out.write("<bold><font size=\"7\" color=\"#fefefe\" font-family=\"sans-serif\">Alumni Portal</font></bold><br>\n");
      out.write("    <bold><font size=\"4\" color=\"#000\">A place to meet, talk and discover.</font></bold>\n");
      out.write("    \n");
      out.write("</td></tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- ============ NAVIGATION BAR SECTION ============== bgcolor=\"#bbbbbb\"-->\n");
      out.write("<tr><td colspan=\"3\">This won't even be visible.</tr>\n");
      out.write("<tr><td colspan=\"3\">This won't even be visible.</tr>\n");
      out.write("<tr><td colspan=\"3\">This won't even be visible.</tr>\n");
      out.write("<tr>\n");
      out.write("<td colspan=\"2\" align='left' valign='bottom' height=\"50px\">Welcome, ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("!</td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("<tr style=\"height:75px\">\n");
      out.write("    <td colspan=\"1\" height=\"40px\" width=\"100px\"  align=\"center\"><bold><font size=\"5\">Annoucements</font></bold></td>\n");
      out.write("<td height=\"40px\" colspan=\"2\"><marquee scrollamount=\"15\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${annoucement}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</marquee></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<!-- ============ LEFT COLUMN (MENU) ============== -->\n");
      out.write("<td colspan=\"3\" width=\"50%\" valign=\"top\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("        <h3>Change details:-</h3>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("        \n");
      out.write("   \n");
      out.write("<!--<a href=\"#\">Menu link</a><br>\n");
      out.write("<a href=\"#\">Menu link</a><br>\n");
      out.write("<a href=\"#\">Menu link</a><br>\n");
      out.write("<a href=\"#\">Menu link</a><br>\n");
      out.write("<a href=\"#\">Menu link</a>\n");
      out.write("-->\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("<!-- ============ MIDDLE COLUMN (CONTENT) ============== -->\n");
      out.write("\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<!-- ============ FOOTER SECTION ============== -->\n");
      out.write("<tr style=\"postion:fixed;\"><td style=\" width:100%; height:35px; position: absolute\" colspan=\"3\" align=\"right\" height=\"20\" bgcolor=\"#2B2B2B\">\n");
      out.write("        \n");
      out.write("<form action='index.jsp'>\n");
      out.write("        <input style=\"width:150px;\" class=\"btn\" type=\"submit\" value=\"Sign out\"/>\n");
      out.write("</form></tr>\n");
      out.write("</table></div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("\n");
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
