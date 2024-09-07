//A Program To Create The Database
import java.sql.*;
import SB_Connection.Connection1;
public class Prog_2 {
    public static void main(String[] args) {
        Statement st=null;
        try
        {
            Connection con=Connection1.connection11();
            st=con.createStatement();
            String query="create table details(Name varchar(30),Email varchar(30))";
            st.execute(query);
            System.out.println("Margi table is created in the database...");
            con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
