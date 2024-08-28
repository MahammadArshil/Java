import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.sql.*;
public class Student_Details extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String lname=request.getParameter("lastName");
        String fname=request.getParameter("firstName");
        String enrollno=request.getParameter("enroll_no");
        String dept=request.getParameter("user_dept");
        String sem=request.getParameter("user_sem");
        String email=request.getParameter("email");
        String contact=request.getParameter("number");
        String gender=request.getParameter("gender");
        //out.println("<center>");
        out.println("<h1><u>WELCOME "+fname+"</u></h1>");
        out.println("<h1><u>Your Details</u></h1>");
        out.println("<h2>Name: "+lname+" "+fname+"</h2>");
        out.println("<h2>Enroll. No.: "+enrollno+"</h2>");
        out.println("<h2>Department: "+dept+"</h2>");
        out.println("<h2>Semester: "+sem+"</h2>");
        out.println("<h2>E-mail: "+email+"</h2>");
        out.println("<h2>Contact No.: "+contact+"</h2>");
        out.println("<h2>Gender: "+gender+"</h2>");
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/arshil","root","");
            out.println("<center><h2 style='color:Tomato;'>*Your Connection is established<h2></center>");
            String sql="INSERT INTO  user_details values(?,?,?,?,?,?,?,?)";
            PreparedStatement st=con.prepareStatement(sql);
            st.setString(1,lname);
            st.setString(2,fname);
            st.setString(3,enrollno);
            st.setString(4,dept);
            st.setString(5,sem);
            st.setString(6,email);
            st.setString(7,contact);
            st.setString(8,gender);
            st.executeUpdate();
            out.println("<script>alert('You are Succesfully registerd..')</script>");
            out.println("<h2>To go back <a href='index1.html'>Click Here</a></h>");
            out.println("<h2>Click Here to See the data <a href='Database_Connection'>Continue</a></h2>");
        }
        catch(Exception e1){
            System.out.println(e1);
        }
    }
}