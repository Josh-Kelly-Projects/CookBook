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
 *creates a recipe object
 * @author Mark
 */
public class Recipe
{

    private String resName;
    private int resID;
    private DB db = new DB();

    /**
     *constuctor creates a recipe object
     * @param resName recipe name
     * @param resID recipe ID
     */
    public Recipe(String resName, int resID)
    {
        this.resName = resName;
        this.resID = resID;
    }

    /**
     *accessor of recipe name
     * @return String recipe name
     */
    public String getResName()
    {
        return resName;
    }

    /**
     *recipe ID accessor 
     * @return int recipe ID
     */
    public int getResID()
    {
        return resID;
    }

    /**
     * recipe name mutator
     * @param resName new recipe name
     */
    public void setResName(String resName)
    {
        this.resName = resName;
    }

    /**
     *recipe ID mutator
     * @param resID new recipe ID
     */ 
    public void setResID(int resID)
    {
        this.resID = resID;
    }

    @Override
    public String toString()
    {
        return resName + resID;
    }

    /**
     * method applies a ratio stored in a database to an amount to be displayed
     *
     * @param qty the quantity that appears in the general recipe
     * @param user the user that is logged in
     * @return the new quantity that has been altered by the ratio
     */
    public String applyRatio(String qty, String user)
    {
        String newQty = "";
        String[] tempQty = qty.split(" ");
        double qtyNoU = Double.parseDouble(tempQty[0]);
        try
        {
            ResultSet rs = db.query("SELECT ratio FROM tbluserratios WHERE recipeID = " + resID + " AND userID LIKE '" + user + "'");
            rs.next();
            qtyNoU *= rs.getDouble("ratio");

        } catch (SQLException ex)
        {
            System.out.println("User ratio currently unmaped");
            try
            {
                db.update("INSERT INTO tbluserratios VALUES (" + resID + ", '" + user + "' , 1)");
            } catch (SQLException ex1)
            {
                Logger.getLogger(Recipe.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        newQty = qtyNoU + tempQty[1];
        return newQty;
    }
}
