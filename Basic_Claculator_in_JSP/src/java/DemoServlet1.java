import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class DemoServlet1 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        ServletContext context=getServletContext();
        context.setAttribute("College", "ISTAR");
        out.println("Welcome to first Servlet");
        out.println("<a href='DemoServlet2'>Visit</a>");
        out.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        }
    }