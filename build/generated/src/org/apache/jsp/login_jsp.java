package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Log in</title>\n");
      out.write("        <!-- jQuery 2.1.4 -->\n");
      out.write("        <script src=\"plugins/jQuery/jQuery-2.1.4.min.js\"></script>\n");
      out.write("        <script src=\"plugins/Login/login.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"../../plugins/jQuery/jquery.leanModal.min.js\"></script>\n");
      out.write("        <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>\n");
      out.write("        <!-- Bootstrap 3.3.2 JS -->\n");
      out.write("        <script src=\"bootstrap/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!-- iCheck -->\n");
      out.write("        <script src=\"plugins/iCheck/icheck.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!-- Bootstrap 3.3.4 -->\n");
      out.write("        <link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <!-- Font Awesome Icons -->\n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <!-- Theme style -->\n");
      out.write("        <link href=\"dist/css/AdminLTE.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <!-- iCheck -->\n");
      out.write("        <link href=\"plugins/iCheck/square/blue.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"../../plugins/Login/login.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body class=\"login-page\">\n");
      out.write("        <!-- Username & Password Login form -->\n");
      out.write("        <div class=\"login-box-body\">\n");
      out.write("            <form action=\"../../index2.html\" method=\"post\" id=\"register\" class=\"styled\">\n");
      out.write("                <div class=\"form-group has-feedback\">\n");
      out.write("                    <input type=\"email\" class=\"form-control required\" placeholder=\"Email\"/>\n");
      out.write("                    <span class=\"glyphicon glyphicon-envelope form-control-feedback\"></span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group has-feedback\">\n");
      out.write("                    <input type=\"password\" class=\"form-control required\" placeholder=\"Password\"/>\n");
      out.write("                    <span class=\"glyphicon glyphicon-lock form-control-feedback\"></span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-xs-8\">    \n");
      out.write("                        <div class=\"checkbox icheck\">\n");
      out.write("                            <label>\n");
      out.write("                                <input type=\"checkbox\"> Remember Me\n");
      out.write("                            </label>\n");
      out.write("                        </div>                        \n");
      out.write("                    </div><!-- /.col -->\n");
      out.write("                    <center>\n");
      out.write("                        <div class=\"action_btns\">\n");
      out.write("                            <div class=\"row\"><a href=\"#\" class=\"btn_login btn btn_red\" style=\"width:120px\">Login</a></div>\n");
      out.write("                        </div>\n");
      out.write("                    </center>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            <a href=\"#\" class=\"forgot_password\">Forgot password?</a>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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