import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Database_Connection extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Statement st=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/arshil","root","");
            //out.println("Your Connection is established ");
            st=con.createStatement();
            ResultSet rs=st.executeQuery("select*from user_details");
            
            while(rs.next())
                //out.print("<h3>");
                out.print("<h3>"+rs.getString(1)+"   "+rs.getString(2)+"   "+rs.getString(3)+"   "+rs.getString(4)+"   "+rs.getString(5)+"   "+rs.getString(6)+"   "+rs.getString(7)+"   "+rs.getString(8)+"</h3>");
                //out.print("</h3>");
                con.close();
        }
        catch(Exception e1){
            out.println(e1);
        }
        }
    }