package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>AlumniPortal</title>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body style=\"margin: 0px; padding: 0px; font-family: 'Trebuchet MS',verdana;\">\n");
      out.write("\n");
      out.write("<table width=\"100%\" style=\"height: 100%;\" cellpadding=\"10\" cellspacing=\"0\" border=\"0\">\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<!-- ============ HEADER SECTION ============== -->\n");
      out.write("<td colspan=\"3\" style=\"height: 80px;\" bgcolor=\"#343434\">\n");
      out.write("    <h1>AlumniPortal</h1>\n");
      out.write("    \n");
      out.write("</td></tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- ============ NAVIGATION BAR SECTION ============== -->\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td bgcolor=\"#bbbbbb\" align='center' height=\"85px\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username=\"Username\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("<td height=\"85px\" bgcolor=\"#bbbbbb\" align='center'><br> <a href=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${homepagelink=\"Homepage\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${homepage=\"Homepage\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></td> \n");
      out.write("<td height=\"85px\" bgcolor=\"#bbbbbb\" align='center'> <a href=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inbox=\"Check Inbox\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inbox=\"Check Inbox\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<!-- ============ LEFT COLUMN (MENU) ============== -->\n");
      out.write("<td width=\"20%\" valign=\"top\" bgcolor=\"#F6F6F6\">\n");
      out.write("    <form action='Search_Student'>\n");
      out.write("        <h3>Search for student/alumni:</h3><input type='text' name='name'/><Br>\n");
      out.write("        <input type='submit' value='Search!'>\n");
      out.write("    </form>\n");
      out.write("    \n");
      out.write("    <form action='Search_Event'>\n");
      out.write("        \n");
      out.write("        <h3>Search for event:</h3><input type='text' name='ename'/><br>\n");
      out.write("        <input type='submit' value='Search!'>\n");
      out.write("    </form>\n");
      out.write("    <form action='Create_Event'>\n");
      out.write("        \n");
      out.write("        <h3>Create an event!</h3>\n");
      out.write("        Event name:<input type='text' name='ename'/><br>\n");
      out.write("        Event time:<input type='text' name='ename'/><br>\n");
      out.write("        Event date:<input type='text' name='ename'/><br>\n");
      out.write("        Event location:<input type='text' name='ename'/><br>\n");
      out.write("       \n");
      out.write("        <input type='submit' value='Search!'>\n");
      out.write("    </form>\n");
      out.write("    \n");
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
      out.write("<td width=\"55%\" valign=\"top\" bgcolor=\"#FDF3E7\">\n");
      out.write("\n");
      out.write("<h2>News Feed</h2>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div style=\"overflow:auto;height:350px\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${feed=\"SOME FEED <br> ANOTHER <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>  AND ANOTHER\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("  \n");
      out.write("<br>\n");
      out.write("\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("<td width=\"25%\" valign=\"top\" bgcolor=\"#999f8e\">\n");
      out.write("    <h2>Annoucements</h2>\n");
      out.write("    <div style=\"overflow:auto;height:350px\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${feed=\"SOME FEED <br> ANOTHER <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>  AND ANOTHER\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<!-- ============ FOOTER SECTION ============== -->\n");
      out.write("<tr><td colspan=\"3\" align=\"right\" height=\"20\" bgcolor=\"#2B2B2B\"><a href=\"index.jsp\">Logout</a></td></tr>\n");
      out.write("</table>\n");
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
