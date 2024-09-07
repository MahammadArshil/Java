import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Calc extends HttpServlet 
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        PrintWriter out = response.getWriter();
        String n1=request.getParameter("txt1");
        String n2=request.getParameter("txt2");
        String op=request.getParameter("op");
        int a=Integer.parseInt(n1);
        int b=Integer.parseInt(n2);
        switch(op)
        {
            case"Addition":
                out.println("Answer: "+(a+b));
            break;
            case"Substraction":
                out.println("Answer: "+(a-b));
            break;
            case"Multiplication":
                out.println("Answer: "+(a*b));
            break;
            default:
                out.println("Answer: "+(a/b));
            break;
        }
    }
}