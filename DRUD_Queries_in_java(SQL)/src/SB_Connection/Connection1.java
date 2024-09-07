/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SB_Connection;
import java.sql.*;
public class Connection1 
{
    public static Connection connection11()
    {
        Connection con=null;
        String url="jdbc:mysql://localhost:3306/istar";
        String driver="com.mysql.cj.jdbc.Driver";
        String user="root";
        String pass="";
        try
        {
            Class.forName(driver);
            con=DriverManager.getConnection(url,user,pass);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return con;
    }
}
