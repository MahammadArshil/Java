//A program to fetch record from a table
import java.sql.*;
import SB_Connection.Connection1;
public class Prog_4 {
    public static void main(String[] args) {
        Statement st=null;
        try{
            Connection con=Connection1.connection11();
            st=con.createStatement();
            ResultSet rs=st.executeQuery("select*from itsem2");
            while(rs.next())
            System.out.println(rs.getString(1)+" "+rs.getString(2));
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
