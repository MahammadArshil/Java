import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet_1 extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String n=request.getParameter("username");
        String p=request.getParameter("userpass");
        if(p.equals("istar"))
        {
            RequestDispatcher rd=request.getRequestDispatcher("WelcomeServlet");
            rd.forward(request, response);
        }
        else
        {
            out.println("Sorry Username or Password Error!");
            RequestDispatcher rd1=request.getRequestDispatcher("/Html1.html");
            rd1.include(request, response);
        }
        }
    }