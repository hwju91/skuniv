/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.33
 * Generated at: 2016-09-09 16:05:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.mypage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class passwordupdateform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1469857023168L));
    _jspx_dependants.put("jar:file:/C:/bit/work/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/0903.2/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../header_basic.jsp", out, false);
      out.write(' ');
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../nav.jsp", out, false);
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../menu_project.jsp", out, false);
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"page-head-line\">password update</h4>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t  \t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t                        <div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t                        <div class=\"panel-heading\">\r\n");
      out.write("\t\t\t                          PASSWORD UPDATE FORM \r\n");
      out.write("\t\t\t                        </div>\r\n");
      out.write("\t\t\t                        <div class=\"panel-body\">\r\n");
      out.write("                            \t\t\t<form action=\"passwordupdate\" method=\"post\">\r\n");
      out.write("                                        \r\n");
      out.write("                                        <div class=\"form-group has-success\">\r\n");
      out.write("                                            <label class=\"control-label\" for=\"success\">before password.</label>\r\n");
      out.write("                                            <input type=\"password\" class=\"form-control\" name=\"beforepassword\" id=\"beforepassword\" />\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group has-success\">\r\n");
      out.write("                                            <label class=\"control-label\" for=\"success\">Update password. : </label>\r\n");
      out.write("                                            <input type=\"password\" class=\"form-control\" name=\"updatepassword\" id=\"updatepassword\" />\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group has-success\">\r\n");
      out.write("                                            <label class=\"control-label\" for=\"success\">Update password again. : </label>\r\n");
      out.write("                                            <input type=\"password\" class=\"form-control\" name=\"updatepassword2\" id=\"updatepassword2\" />\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        \r\n");
      out.write("                                        \r\n");
      out.write("                                        <hr/>\r\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-info\"><span class=\"glyphicon glyphicon-user\"></span> &nbsp;update</button>&nbsp;\r\n");
      out.write("                                    </form>\r\n");
      out.write("                            <hr />\r\n");
      out.write("                            \r\n");
      out.write("                            \r\n");
      out.write("                           \r\n");
      out.write("                            For more customization for this template or its components please\r\n");
      out.write("                             visit official bootstrap website i.e <strong> getbootstrap.com </strong> or\r\n");
      out.write("                            <a href=\"http://getbootstrap.com/css/#forms\" target=\"_blank\">click here</a>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                         <div class=\"col-md-6\">\r\n");
      out.write("                    <div class=\"alert alert-info\">\r\n");
      out.write("                        This is a free bootstrap admin template with basic pages you need to craft your project. \r\n");
      out.write("                        Use this template for free to use for personal and commercial use.\r\n");
      out.write("                        <br />\r\n");
      out.write("                         <strong> Some of its features are given below :</strong>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                Responsive Design Framework Used\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                Easy to use and customize\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                Font awesome icons included\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                Clean and light code used.\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                       \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"alert alert-success\">\r\n");
      out.write("                         <strong> Instructions To Use:</strong>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li>\r\n");
      out.write("                               Lorem ipsum dolor sit amet ipsum dolor sit ame\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                 Aamet ipsum dolor sit ame\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                               Lorem ipsum dolor sit amet ipsum dolor\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                 Cpsum dolor sit ame\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                       \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
