package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profilepage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!-- NEED TO ADD these attributes to load this page:\n");
      out.write("    annoucement\n");
      out.write("    name\n");
      out.write("    dob\n");
      out.write("    yog\n");
      out.write("    city\n");
      out.write("    email\n");
      out.write("    phonenum\n");
      out.write("    events\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <link rel=\"shortcut icon\" href=\"./favicon.ico\">\n");
      out.write("  <link rel=\"icon\" href=\"./favicon.ico\">\n");
      out.write("  \n");
      out.write("<head>\n");
      out.write("    <style>\n");
      out.write("        .img{\n");
      out.write("        background-size: cover; \n");
      out.write("\tbackground-image: url(\"./manipaltwo.jpg\");//url(http://www.engineering.careers360.com/careers360_cms/newsimages/image/June2010/manipal.jpg);\n");
      out.write("\tbackground-size: cover;\n");
      out.write("\t//-webkit-filter: blur(5px);\n");
      out.write("\tz-index: -1;\n");
      out.write("        background-repeat: no-repeat;\n");
      out.write("        background-attachment: fixed;\n");
      out.write("        \n");
      out.write("}\n");
      out.write(".btn {\n");
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
      out.write("    </style>\n");
      out.write("<title>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("'s Profile Page</title>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"img\" style=\"margin: 0px; padding: 0px; font-family: 'Trebuchet MS',verdana;\">\n");
      out.write("    <div style=\"z-index:1;\">\n");
      out.write("<table width=\"100%\" height=\"100%\" cellpadding=\"5\" cellspacing=\"0\" border=\"0\">\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<!-- ============ HEADER SECTION ============== -->\n");
      out.write("<td colspan=\"3\" valign=\"center\" style=\"height: 80px;\"  >\n");
      out.write("    <h1>&nbsp;&nbsp;");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("    \n");
      out.write("</td></tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- ============ NAVIGATION BAR SECTION ============== !!!!!!!!!! ADD annoucement TO THE PAGE REQUEST WHEN LOADING --> \n");
      out.write("\n");
      out.write("<tr style=\"height:75px\">\n");
      out.write("    <td width=\"100px\" align=\"center\" valign=\"bottom\" ><h4>Annoucements</h4></td>\n");
      out.write("    <td colspan=\"2\"><marquee scrollamount=\"15\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${annoucement}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</marquee></td>\n");
      out.write("</tr>\n");
      out.write("<tr style=\"height:50px;\" >    \n");
      out.write("<!-- ============ LEFT COLUMN (MENU) ============== -->\n");
      out.write("<td width=\"25%\" valign=\"top\" >\n");
      out.write("    <h2>About</h2><br>\n");
      out.write("    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${student}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br><br>\n");
      out.write("    Date of birth: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dob}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br><br>\n");
      out.write("    Year of Graduation: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${yog}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br><br>\n");
      out.write("    Current City: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${city}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br><br>\n");
      out.write("    Email address: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br><br>\n");
      out.write("    Phone number: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phonenum}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" <br><br>\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("<!-- ============ MIDDLE COLUMN (CONTENT) ============== -->\n");
      out.write("<td width=\"45%\" valign=\"top\" >\n");
      out.write("\n");
      out.write("<h2>Want to communicate?</h2>\n");
      out.write("\n");
      out.write("<form action='Send_Message'>\n");
      out.write("        \n");
      out.write("        <h3>Send a message to ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(":</h3>\n");
      out.write("        <textarea name='ename' style=\"height:250px;width:410px;\"/></textarea><br><br>\n");
      out.write("        <input class=\"btn\" type='submit' value='Send!'><br><br><br><br>\n");
      out.write("    </form>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("<td valign=\"top\">\n");
      out.write("    <h2>Events ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" is attending:-</h2><br>\n");
      out.write("    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${events}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<!-- ============ FOOTER SECTION ============== -->\n");
      out.write("<tr><td colspan=\"3\" align=\"right\" height=\"20\" bgcolor=\"#2B2B2B\"><a href=\"index.jsp\">Logout</a></td></tr>\n");
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
