//A Program to insert a record & Select records By Prepared Statement
import java.sql.*;
import SB_Connection.Connection1;
public class Prog_7 {
    public static void main(String[] args) {
        PreparedStatement ps=null;
        ResultSet rs=null;
        try{
            Connection con=Connection1.connection11();
            ps=con.prepareStatement("insert into itsem2 values(?,?)");
            ps.setInt(1,8);
            ps.setString(2,"XYZ");
            int result=ps.executeUpdate();
            if (result!=0){
                System.out.println("Record is sucessfully inserted");
            }
            else{
                System.out.println("Inserting record is faild");
            }
//            String qry="select*from it_sem1 where id=?";
//            ps=con.prepareStatement(qry);
//            ps.setInt(1,3);
//            rs=ps.executeQuery();
//            while(rs.next()){
//                System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
//            }
//            rs.close();
            ps.close();
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
