/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.90
 * Generated at: 2023-09-04 03:02:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp._06;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Arrays;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import java.util.Enumeration;

public final class requestDesc_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.Arrays");
    _jspx_imports_classes.add("java.util.Iterator");
    _jspx_imports_classes.add("java.util.Enumeration");
    _jspx_imports_classes.add("java.util.Map");
    _jspx_imports_classes.add("java.util.Map.Entry");
    _jspx_imports_classes.add("java.util.HashMap");
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write(".red{\r\n");
      out.write("	background-color: red;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("<h4>HttpServletRequest : request packaging</h4>\r\n");
      out.write("<form method=\"post\"></form>\r\n");
      out.write("<pre>\r\n");
      out.write("	1. Request Line : URL(URI), request Method\r\n");
      out.write("		Request Method : 요청의 목적이자 의도이며, 포장 규칙을 정의하는 단어\r\n");
      out.write("		 GET(default method)\r\n");
      out.write("		 POST(form 기반의 요청) : request body가 필요함\r\n");
      out.write("		 PUT/PATCH(자원의 갱신)\r\n");
      out.write("		 DELETE(자원의 삭제)\r\n");
      out.write("		 OPTION(preFlight 요청) -> 사전요청 처리\r\n");
      out.write("		 HEAD(response content가 없음)\r\n");
      out.write("		 TRACE(server tracking/debugging)\r\n");
      out.write("		 \r\n");
      out.write("		 ");

		 	StringBuffer requestURL = request.getRequestURL();
		 	String requestURI = request.getRequestURI();
		 	String requestMethod = request.getMethod();
		 
      out.write("\r\n");
      out.write("		 url : ");
      out.print(requestURL );
      out.write("\r\n");
      out.write("		 uri : ");
      out.print(requestURI );
      out.write("\r\n");
      out.write("		 method : ");
      out.print(requestMethod );
      out.write("\r\n");
      out.write("	2. Request Header : meta data (client + content), name(String)/value(String)\r\n");
      out.write("		");

			String userAgent = request.getHeader("user-agent");
		
      out.write("\r\n");
      out.write("		");
      out.print(userAgent );
      out.write("\r\n");
      out.write("	3. Request Body(Content Body, Message Body)\r\n");
      out.write("		1) parameter (String) :	\r\n");
      out.write("				String getParameter(name), String[] getParameterValues(name), getParameterMap()\r\n");
      out.write("			전달되는 방식\r\n");
      out.write("			- query string 형태 전송 (보안 취약)\r\n");
      out.write("			- content body 전송\r\n");
      out.write("		2) multipart (stream)\r\n");
      out.write("		3) payload(JSON/XML..., unmarshalling...)\r\n");
      out.write("</pre>\r\n");
      out.write("<div>\r\n");
      out.write("	<a href=\"?param1=value1&param2=한글값\">Query String 형태 전송</a>\r\n");
      out.write("	<form method=\"post\">\r\n");
      out.write("		<input type=\"text\" name=\"param3\" value=\"value3\" />\r\n");
      out.write("		<input type=\"text\" name=\"param3\" value=\"value3-1\" />\r\n");
      out.write("		<input type=\"text\" name=\"param4\" value=\"value4\" />\r\n");
      out.write("		<input type=\"date\" name=\"date1\" />\r\n");
      out.write("		<input type=\"datetime-local\" name=\"date2\" />\r\n");
      out.write("		<input type=\"submit\" value=\"전송\">\r\n");
      out.write("			</form>\r\n");
      out.write("</div>\r\n");
      out.write("<table>\r\n");
      out.write("	<thead>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<th>파라미터이름</th>\r\n");
      out.write("			<th>파라미터값</th>\r\n");
      out.write("		</tr>\r\n");
      out.write("	</thead>\r\n");
      out.write("	<tbody>\r\n");
      out.write("		");

			//파라미터를 확보하기 전에 미리 설정(POST 요청의 request body에 적용됨).
// 			request.setCharacterEncoding("utf-8");
			String ptrn = "<tr class='%3$s'><td>%1$s</td><td>%2$s</td></tr>";
			
			Map<String, String[]> paramMap =request.getParameterMap();
			if(paramMap.isEmpty()){
				out.println("<tr><td colspan='2'>파라미터 없음.</td></tr>");
			}else{
				for(Entry<String, String[]> entry : paramMap.entrySet()){
					String paramName = entry.getKey();
					String[] paramValues = entry.getValue();
					out.println(
						String.format(ptrn, paramName, Arrays.toString(paramValues), "")
					);
				}
			}
		
      out.write("\r\n");
      out.write("	</tbody>\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<hr>\r\n");
      out.write("<table>\r\n");
      out.write("	<thead>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<th>헤더이름</th>\r\n");
      out.write("			<th>헤더값</th>\r\n");
      out.write("		</tr>\r\n");
      out.write("	</thead>\r\n");
      out.write("	<tbody>\r\n");
      out.write("		");

			
			Enumeration<String> headerNames = request.getHeaderNames();
			while(headerNames.hasMoreElements()){
				String name = headerNames.nextElement();
				String value = request.getHeader(name);
				String clzValue = "user-agent".equals(name) ? "red" : "etc";
				out.println(
					String.format(ptrn, name, value, clzValue)		
				);
			}
		
      out.write("\r\n");
      out.write("				\r\n");
      out.write("\r\n");
      out.write("	</tbody>\r\n");
      out.write("</table>\r\n");
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