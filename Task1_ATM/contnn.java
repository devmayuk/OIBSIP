package TASK1_ATM;

import java.sql.*;
public class conctnn
{
    public Connection c;
    public Statement s;
    public conctnn()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql:///atm","root","manas");
            s=c.createStatement();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
