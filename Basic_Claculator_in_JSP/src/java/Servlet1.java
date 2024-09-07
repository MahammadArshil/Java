import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
        {
            response.setContentType("text/html");
            PrintWriter out=response.getWriter();
            out.println("<h1>User Details</h1>");
            String name=request.getParameter("user_name");
            String password=request.getParameter("user_password");
            
            out.println("<h2>Name:"+name+"</h2>");
            out.println("<h2>Password:"+password+"</h2>");
        }
}