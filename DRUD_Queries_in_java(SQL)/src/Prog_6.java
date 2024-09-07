//A program to delete record from a table
import java.sql.*;
import SB_Connection.Connection1;
public class Prog_6 {
    public static void main(String[] args) {
        Statement st=null;
        try{
            Connection con=Connection1.connection11();
            st=con.createStatement();
            String qry="DELETE from itsem2 WHERE id=3";
            String qry1="select*from itsem2";
            int result=st.executeUpdate(qry);
            if(result!=0){
                System.out.println("Record is deleted in table");
            }
            else{
                System.out.println("Deletion Operation is unsuccessful");
            }
            ResultSet rs=st.executeQuery(qry1);
            while(rs.next())
                System.out.println(rs.getInt(1)+" "+rs.getString(2));
            con.close( );
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
