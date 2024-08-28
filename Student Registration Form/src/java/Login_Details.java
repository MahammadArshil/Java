import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Login_Details extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String N=request.getParameter("user_name");
        String P=request.getParameter("user_pass");
        if(P.equals(N))
        {
            out.println("<center>");
            out.println("<h1>Welcome in My Website</h1>");
            out.println("<h2>Hello! "+N+" Welcome to My Page</h2>");
            //out.println("<h2>To go back <a href='index.html'>Click Here</a> </h2>");
            out.println("<h2>Click Here to Continue</h2>");
            out.println("<h2><a href='index1.html'>Continue</a></h2>");
            out.println("</center>");
        }
        else
        {
            out.println("<center><h2>Sorry! Invalid Username or Password.</h2></center>");
            RequestDispatcher rd1=request.getRequestDispatcher("/index.html"); 
            rd1.include(request, response);
        }
        }
    }