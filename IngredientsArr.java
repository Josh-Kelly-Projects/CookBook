/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelly;

import java.sql.*;
import java.util.logging.*;

/**
 *creates ingredients arrays
 * @author Mark
 */
public class IngredientsArr
{

    private Ingredients[] ingArr = new Ingredients[2000];
    private int size = 0;
    private DB db = new DB();
    private int[] ingIDs = new int[2000];

    /**
     * constructor that deals with a certain meal type
     *
     * @param q the name of the meal type
     */
    public IngredientsArr(String q)
    {
        try
        {
            int[] rID = new int[200];
            int cnt = 0;
            ResultSet rs;
            q = q.toLowerCase();
            if (q.equalsIgnoreCase("all meal types"))
            {
                rs = db.query("SELECT id,ingredients FROM tblingrediants");
            } else
            {
                rs = db.query("SELECT id FROM tblrecipies WHERE mealType LIKE '" + q + "'");
                while (rs.next())
                {
                    rID[cnt] = rs.getInt("id");
                    cnt++;
                }
                String wheresss = DB.buildWhere("recipeID", rID, cnt);

                rs = db.query("SELECT DISTINCT ingredientID FROM tbllink WHERE " + wheresss);
                cnt = 0;
                while (rs.next())
                {
                    ingIDs[cnt] = rs.getInt("ingredientID");
                    cnt++;
                }
                wheresss = DB.buildWhere("id", ingIDs, cnt);
                rs = db.query("SELECT id,ingredients FROM tblingrediants WHERE " + wheresss);
            }
            while (rs.next())
            {
                int id = rs.getInt("id");
                String n = rs.getString("ingredients");
                ingArr[size] = new Ingredients(n, id);
                size++;
            }

        } catch (SQLException ex)
        {
            Logger.getLogger(IngredientsArr.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param ingsIn
     * @param length
     */
    public IngredientsArr(Ingredients[] ingsIn, int length)
    {
        ingArr = ingsIn;
        size = length;
    }

    /**
     *Default constructor 
     * this creates an array of ingredients straight from the database
     */
    public IngredientsArr()
    {
        try
        {
            ResultSet rs = db.query("SELECT id,ingredients FROM tblingrediants");
            while (rs.next())
            {
                int id = rs.getInt("id");
                String n = rs.getString("ingredients");
                ingArr[size] = new Ingredients(n, id);
                size++;
            }
        } catch (SQLException ex)
        {
            Logger.getLogger(IngredientsArr.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param check
     */
    public IngredientsArr(boolean check)
    {
        size = 0;
    }

    /**
     *
     * @return
     */
    public Ingredients[] getIngArr()
    {
        return ingArr;
    }

    /**
     *
     * @return
     */
    public int getSize()
    {
        return size;
    }

    /**
     *
     * @return
     */
    public int[] getIDs()
    {
        int[] temp = new int[size];

        for (int i = 0; i < size; i++)
        {
            temp[i] = ingArr[i].getIngID();
        }

        return temp;
    }

    @Override
    public String toString()
    {
        String temp = "";
        for (int i = 0; i < size; i++)
        {
            temp += ingArr[i].toString();
        }
        return temp;
    }
}
