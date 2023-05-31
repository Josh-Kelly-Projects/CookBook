/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelly;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *creates and inventory array
 * @author kelly
 */
public class InventoryArr
{

    private Inventory[] invenArr = new Inventory[2000];
    private int size = 0;
    private DB db = new DB();

    public InventoryArr(String pooln)
    {
        try
        {
            ResultSet rs = db.query("SELECT * FROM tblfridgeinventory WHERE poolID = " + pooln);
            while (rs.next())
            {
                int ingID = rs.getInt("ingredientID");
                ResultSet rs2 = db.query("SELECT ingredients FROM tblingrediants WHERE id = " + ingID);
                rs2.next();

                String ingname = rs2.getString("ingredients");
                String pool = rs.getString("poolID");
                boolean shopLis = rs.getBoolean("shoppinglistitem");
                boolean empt = rs.getBoolean("emptyitem");
                String exprDate = rs.getDate("expirydate").toString();
                String qty = rs.getString("quantity");
                invenArr[size] = new Inventory(ingname, pool, shopLis, empt, exprDate, qty, ingID);
                size++;
            }
        } catch (SQLException ex)
        {
            Logger.getLogger(InventoryArr.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    public Inventory[] getInvenArr()
    {
        return invenArr;
    }

    public int getSize()
    {
        return size;
    }

}
