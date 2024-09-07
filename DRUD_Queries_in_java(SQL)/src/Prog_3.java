//A program to insert record in a table
import java.sql.*;
import SB_Connection.Connection1;
public class Prog_3 {
    public static void main(String[] args) {
        Statement st=null;
        try{
            Connection con=Connection1.connection11();
            st=con.createStatement();
            String qry="insert into itsem2 values(3,'CVM')";
            int result=st.executeUpdate(qry);
            if(result!=0){
                System.out.println("Record is inserted in table");
            }
            else{
                System.out.println("Record is failed to insert");
            }
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
