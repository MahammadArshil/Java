//A program to Update record in a table
import java.sql.*;
import SB_Connection.Connection1;
public class Prog_5 {
    public static void main(String[] args) {
        Statement st=null;
        try{
            Connection con=Connection1.connection11();
            st=con.createStatement();
            String qry="UPDATE itsem2 SET name='CVM UNIVERSITY' WHERE id in(3)";
            int result=st.executeUpdate(qry);
            if(result!=0){
                System.out.println("Record is updated in table");
            }
            else{
                System.out.println("Update operation is unsuccessful");
            }
            ResultSet rs=st.executeQuery("select*from itsem2");
            while(rs.next())
            System.out.println(rs.getInt(1)+" "+rs.getString(2));
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
