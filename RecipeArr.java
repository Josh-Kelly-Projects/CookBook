/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelly;

import java.sql.*;
import java.util.logging.*;

/**
 *creates a recipe array
 * @author Mark
 */
public class RecipeArr
{

    private Recipe[] resArr = new Recipe[2000];
    private int size = 0;
    private DB db = new DB();

    public RecipeArr(IngredientsArr ings, int cnt, String resTp)
    {
        try
        {
            ResultSet rs;
            if (resTp.equalsIgnoreCase("all meal types") && cnt > 0)
            {
                int[] rID = new int[200];

                rs = db.query("SELECT DISTINCT recipeID FROM tbllink WHERE " + DB.buildWhere("ingredientID", ings.getIDs(), cnt));
                int a = 0;
                while (rs.next())
                {
                    rID[a] = rs.getInt("recipeID");
                    a++;
                }

                rs = db.query("SELECT id,recipe FROM tblrecipies WHERE " + DB.buildWhere("id", rID, rID.length));
            } else if (cnt == 0)
            {
                rs = db.query("SELECT id,recipe FROM tblrecipies");
            } else
            {
                rs = db.query("SELECT id FROM tblrecipies WHERE mealtype LIKE '" + resTp + "'");
                int[] resIDs = new int[2000];
                int b = 0;
                while (rs.next())
                {
                    resIDs[b] = rs.getInt("id");
                    b++;
                }

                int[] rID = new int[200];
                rs = db.query("SELECT DISTINCT recipeID FROM tbllink WHERE (" + DB.buildWhere("recipeID", resIDs, b) + ")AND(" + DB.buildWhere("ingredientID", ings.getIDs(), cnt) + ")");
                int a = 0;
                while (rs.next())
                {
                    rID[a] = rs.getInt("recipeID");
                    a++;
                }
                rs = db.query("SELECT id,recipe FROM tblrecipies WHERE " + DB.buildWhere("id", rID, rID.length));
            }
            while (rs.next())
            {
                int id = rs.getInt("id");
                String n = rs.getString("recipe");
                resArr[size] = new Recipe(n, id);
                size++;
            }

        } catch (SQLException ex)
        {
            Logger.getLogger(RecipeArr.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Recipe[] getResArr()
    {
        return resArr;
    }

    public int getSize()
    {
        return size;
    }

}
