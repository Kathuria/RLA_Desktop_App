package rlaproject;
/**
 *
 * @author Avi Kathuria
 */
import java.sql.*;
import static rlaproject.myconnection_class.con_str;

public class myconnection_class {

    public  boolean my_connection_status()
    {
     try
     {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String constr="jdbc:sqlserver://AKDELL:1433;databaseName=rlaproject";
        String user="sa";
        String password="sql@123";
        con_str = DriverManager.getConnection(constr,user,password);
       
        return  true;
     }
     catch(Exception ex)
     {
        err=ex.toString();
        return  false;
     }

    }

    static Connection con_str;
    public Connection get_my_connection()
    {
        return  con_str;
    }

    static  String err;
    public String errmsg()
    {
      return err;
    }
   }


