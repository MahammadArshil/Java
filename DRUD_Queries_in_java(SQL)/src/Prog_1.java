//A program to Esatblish the Connection
import java.sql.*;
import SB_Connection.Connection1;
public class Prog_1 {
    public static void main(String[] args) {
        
        try
        {
            Connection con=Connection1.connection11();
            if(con!=null)
            {
                System.out.println("Connection is established Succesfully");
            }
            else
            {
                System.out.println("Connection is failed");
            }
            con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
