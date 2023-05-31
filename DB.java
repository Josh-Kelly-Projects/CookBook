/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelly;

/**
 *
 * @author delia
 */
import java.sql.*;

/**
 * DB class to connect to my database
 *
 * @author delia
 */
public class DB
{

    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "nbuser";
    private static final String url = "jdbc:mysql://localhost:3306/kellygr11pat";
    private Connection connection;
    private PreparedStatement statement;
    private ResultSet resultSet;

    /**
     * Db constructor to create and load driver
     */
    public DB()
    {
        try
        {
            Class.forName(driver);
            System.out.println("Driver loaded");
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection Successful");
        } catch (SQLException s)
        {
            System.out.println("Cannot connect to database");

        } catch (ClassNotFoundException c)
        {
            System.out.println("Cannot load driver" + c);
        }
    }

    /**
     * Queries database and returns a result set
     *
     * @param qry String SQL statement
     * @return return the resultset created by qry
     * @throws SQLException
     */
    public ResultSet query(String qry) throws SQLException
    {
        statement = connection.prepareStatement(qry);
        resultSet = statement.executeQuery();
        return resultSet;
    }

    /**
     * Updates the database using the qry String
     *
     * @param qry SQL statement e.g. INSERT, UPDATE and DELETE
     * @throws SQLException
     */
    public void update(String qry) throws SQLException
    {
        statement = connection.prepareStatement(qry);
        statement.executeUpdate();
        statement.close();
    }

    /**
     * method creates a where clause with a very generic structure
     *
     * @param in String that has all the items that need to be added to the
     * where
     * @param aID array of integers that are the IDs of the items that are in
     * the database
     * @param cnt and integer holding the number of items that will appear in
     * the where
     * @return a String with the where clause of a sql query
     */
    public static String buildWhere(String in, int[] aID, int cnt)
    {
        String where = "";
        for (int i = 0; i < cnt; i++)
        {
            where += in + " = " + aID[i] + " OR ";
        }
        where = where.substring(0, where.lastIndexOf("OR"));
        return where;
    }
}
