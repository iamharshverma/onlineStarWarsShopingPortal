/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-11-20 04:41:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_002dregister_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>ShoppingKart</title>\n");
      out.write("<link href=\"bootstrap/css/shop-homepae.css\" rel=\"stylesheet\" />\n");
      out.write("<link href=\"bootstrap/css/bootstrap.css\" rel=\"stylesheet\" />\n");
      out.write("<link href=\"bootstrap/css/bootstrap-responsive.css\" rel=\"stylesheet\" />\n");
      out.write("<link\n");
      out.write("\thref=\"//netdna.bootstrapcdn.com/twitter-bootstrap/2.2.1/css/bootstrap-combined.min.css\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("<link\n");
      out.write("\thref=\"//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("<script src=\"bootstrap/scripts/jquery-1.7.1.min.js\"></script>\n");
      out.write("<script src=\"bootstrap/js/bootstrap.js\"></script>\n");
      out.write("<style>\n");
      out.write(".paymentinfo ul {\n");
      out.write("\tmargin: 0;\n");
      out.write("\tpadding: 0;\n");
      out.write("\tlist-style-type: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".paymentinfo ul li {\n");
      out.write("\tdisplay: inline;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<!--Header-->\n");
      out.write("\t<header> <nav class=\"navbar navbar-inverse\" role=\"navigation\">\n");
      out.write("\t<div class=\"navbar-inner\">\n");
      out.write("\t\t<a class=\"brand\" href=\"home.jsp\">The Pirate Shop</a> <a\n");
      out.write("\t\t\tclass=\"btn btn-navbar\" data-toggle=\"collapse\"\n");
      out.write("\t\t\tdata-target=\".nav-collapse\"> <span class=\"icon-bar\"></span> <span\n");
      out.write("\t\t\tclass=\"icon-bar\"></span> <span class=\"icon-bar\"></span>\n");
      out.write("\t\t</a>\n");
      out.write("\t</div>\n");
      out.write("\t</nav> </header>\n");
      out.write("\n");
      out.write("\t<!-- Section -->\n");
      out.write("\t<section>\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"breadcrumbs\">\n");
      out.write("\t\t\t<ul class=\"breadcrumb\">\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t<li class=\"active\"><a href=\"home\">Home</a> <span\n");
      out.write("\t\t\t\t\tclass=\"divider\">/</span></li>\n");
      out.write("\t\t\t\t<li class=\"active\">Login</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"loginsection\">\n");
      out.write("\t\t\t<hr class=\"soft\" />\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"span5\">\n");
      out.write("\t\t\t\t\t<div class=\"well\">\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t<h5>CREATE YOUR ACCOUNT</h5>\n");
      out.write("\t\t\t\t\t\t<form action=\"register\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"control-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"control-label\" for=\"inputEmail\">E-mail\n");
      out.write("\t\t\t\t\t\t\t\t\tAddress</label>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"span3\" type=\"text\" name=\"inputEmail\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"inputEmail\" placeholder=\"Enter you email\" />\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"control-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"control-label\" for=\"inputEmail\">Password</label>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"span3\" type=\"password\" name=\"password\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"password\" placeholder=\"Password\" />\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\">Create\n");
      out.write("\t\t\t\t\t\t\t\t\tYour Account</button>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"span1\">&nbsp;</div>\n");
      out.write("\t\t\t\t<div class=\"span5\">\n");
      out.write("\t\t\t\t\t<div class=\"well\">\n");
      out.write("\t\t\t\t\t\t<h5>ALREADY REGISTERED? LOGIN HERE</h5>\n");
      out.write("\t\t\t\t\t\t<form action=\"login\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"control-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"control-label\" for=\"inputEmail\">Email</label>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"span3\" type=\"text\" name=\"inputEmail\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"inputEmail\" placeholder=\"E-mail Address\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"control-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"control-label\" for=\"inputPassword\">Password</label>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"password\" class=\"span3\" name=\"password\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"inputPassword\" placeholder=\"Password\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"control-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\">Sign in</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"forgetpass.html\">Forgot password?</a>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<hr class=\"soft\" />\n");
      out.write("\t</div>\n");
      out.write("\t</section>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /login-register.jsp(49,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setVar("home");
    // /login-register.jsp(49,4) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/home");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /login-register.jsp(60,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.regStatus=='Fail'}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t<p class=\"warning\">Registration Unsuccessful.</p>\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }
}