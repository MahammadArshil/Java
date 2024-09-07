//A program to update a record By Prepared Statement
import java.sql.*;
import SB_Connection.Connection1;
public class Prog_8 {
    public static void main(String[] args) {
        PreparedStatement ps=null;
        ResultSet rs=null;
        try{
            Connection con=Connection1.connection11();
            String qry="UPDATE it_sem1 SET name=? WHERE id=?";
            ps=con.prepareStatement(qry);
            ps.setString(1,"Testing");
            ps.setInt(2,6);
            int result=ps.executeUpdate();
            if (result!=0){
                System.out.println("Record is sucessfully updated");
            }
            else{
                System.out.println("Record is faild to update");
            }
                String qry1="select*from it_sem1 ";//where id=?";
                ps=con.prepareStatement(qry1);
                //set value to query parameter
                //ps.setInt(1,1);
                rs=ps.executeQuery();
                while(rs.next()){
                    System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
                }
                rs.close();
                ps.close();
                con.close();
            }
        catch(Exception e){
                e.printStackTrace();
        }
    }
}
