package TASK1_ATM;

import java.sql.*;
public class Contnn
{
    public Connection c;
    public Statement s;
    public Contnn()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql:///atm","root","MrMJ");
            s=c.createStatement();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
