/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.37
 * Generated at: 2020-12-07 02:29:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class week_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t})\r\n");
      out.write("</script>\r\n");
      out.write("<style>\r\n");
      out.write("\t#container {\r\n");
      out.write("\t\tposition: relative;\r\n");
      out.write("\t\tmargin: 0 auto;\r\n");
      out.write("\t\tmax-width: 1250px;\r\n");
      out.write("\t\ttext-align: center;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\ttable {\r\n");
      out.write("\t\tposition: relative;\r\n");
      out.write("\t\tborder: border-box;\r\n");
      out.write("\t\tmax-width: 1250px;\r\n");
      out.write("\t\tmargi: 0 auto;\r\n");
      out.write("\t\tbox-sizing: border-box;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\ttr {\r\n");
      out.write("\t\twidth: 100%;\r\n");
      out.write("\t\theight: 100px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tth, td {\r\n");
      out.write("\t\twidth: 300px ;\r\n");
      out.write("\t\theight: 100px;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"container\">\r\n");
      out.write("\t<div class=\"nav\">\r\n");
      out.write("\t\t\t\t<button class=\"nav-btn go-prev\" onclick=\"prevWeek()\">&lt;</button>\r\n");
      out.write("\t\t\t\t<button class=\"nav-btn go-today\" onclick=\"goToday()\">Today</button>\r\n");
      out.write("\t\t\t\t<button class=\"nav-btn go-next\" onclick=\"nextWeek()\">&gt;</button>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"week\">\r\n");
      out.write("\t\t<table class=\"weekTable\">\r\n");
      out.write("\t\t\t<tr class=tableHead></tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("\t\r\n");
      out.write("\tlet date = new Date();\r\n");
      out.write("\r\n");
      out.write("\tconst renderWeek = () => {\r\n");
      out.write("\t\tconst thisYear = date.getFullYear();\r\n");
      out.write("\t\tconst thisMonth = date.getMonth();\r\n");
      out.write("\t\tconst thisDate = date.getDate();\r\n");
      out.write("\t\tconst thisDay = date.getDay();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tconst preLast = new Date(thisYear, thisMonth, 0);\r\n");
      out.write("\t\tconst thisLast = new Date(thisYear, thisMonth+1, 0);\r\n");
      out.write("\t\tconst nextLast = new Date(thisYear, thisMonth+2, 0);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tconst preMonth = preLast.getMonth()+1;\r\n");
      out.write("\t\tconst nextMonth = nextLast.getMonth()+1;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tconst PLDate = preLast.getDate();\r\n");
      out.write("\t\tconst TLDate = thisLast.getDate();\r\n");
      out.write("\t\tconst NLDate = nextLast.getDate();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tconst weekStart = new Date(thisYear, thisMonth, thisDate-thisDay);\r\n");
      out.write("\t\tconst weekEnd = new Date(thisYear, thisMonth, thisDate + (6-thisDay));\r\n");
      out.write("\t\r\n");
      out.write("\t\tconst startDate = weekStart.getDate();\r\n");
      out.write("\t\tconst endDate = weekEnd.getDate();\t\r\n");
      out.write("\t\tconst startMonth = weekStart.getMonth()+1;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tconst weekDate = [];\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(endDate < 7) {\r\n");
      out.write("\t\t\tif(startMonth !== thisMonth+1){\r\n");
      out.write("\t\t\t\tfor(let i = startDate; i < PLDate+1; i++){\r\n");
      out.write("\t\t\t\t\tweekDate.push(preMonth+'.'+i);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tfor(let i = 1; 1 < 7-weekDate.length+1; i ++){\r\n");
      out.write("\t\t\t\t\tweekDate.push((thisMonth+1)+'.'+i);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif(startMonth === thisMonth+1) {\r\n");
      out.write("\t\t\t\tfor(let i = startDate; i < TLDate+1; i++){\r\n");
      out.write("\t\t\t\t\tweekDate.push((thisMonth+1)+'.'+i);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tfor(let i = 1; 1 < 7-weekDate.length+1; i ++){\r\n");
      out.write("\t\t\t\t\tweekDate.push(nextMonth+'.'+i);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(startDate >= 1 && startDate <= TLDate-6 ){\r\n");
      out.write("\t\t\tfor(let i = startDate; 1 < 7-weekDate.length+1; i ++){\r\n");
      out.write("\t\t\t\tweekDate.push((thisMonth+1)+'.'+i);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar html = '';\r\n");
      out.write("\t\tfor(let i = 8; i < 20; i++) {\r\n");
      out.write("\t\t\thtml += '<tr><td time=\"'+i+'\" >'+i+'시'+'</td>'\r\n");
      out.write("\t\t\tfor(let j = 0; j < 7; j++) {\r\n");
      out.write("\t\t\t\thtml += '<td date=\"'+weekDate[j]+'\" time=\"'+i+'\"></td>'\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\thtml += '</tr>'\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tconsole.log(html);\r\n");
      out.write("\t\r\n");
      out.write("\t\t$('.weekTable').append(html);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tweekDate.forEach((date, i) => {\r\n");
      out.write("\t\t\tvar spDate = date.split('.');\r\n");
      out.write("\t\t\tweekDate[i] = '<td class=\"date\">' + date + '</td>';\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\tweekDate.unshift('<td></td>')\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\tdocument.querySelector('.tableHead').innerHTML = weekDate.join('');\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t/* weekDate.unshift('<td></td>'); \r\n");
      out.write("\t\tvar html = '';\r\n");
      out.write("\t\tfor(let i = 0; i < weekDate.length: i ++ ) {\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t} */\r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\trenderWeek();\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\tconst prevWeek = () => {\r\n");
      out.write("\t\tdate.setDate(date.getDate()-7);\t\r\n");
      out.write("\t\trenderWeek();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tconst nextWeek = () => {\r\n");
      out.write("\t\tdate.setDate(date.getDate()+7);\r\n");
      out.write("\t\trenderWeek();\r\n");
      out.write("\t} \r\n");
      out.write("\t\r\n");
      out.write("\tconst goToday = () => {\r\n");
      out.write("\t\tdate = new Date();\r\n");
      out.write("\t\trenderWeek();\r\n");
      out.write("\t}  \r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
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
