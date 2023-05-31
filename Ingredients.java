/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelly;

/**
 *creates ingredients object
 * @author Mark
 */
public class Ingredients
{

    private String ingName;
    private int ingID;

    /**
     *creats ingredient object
     * @param ingName name of ingredient as String
     * @param ingID ingredient ID as int
     */
    public Ingredients(String ingName, int ingID)
    {
        this.ingName = ingName;
        this.ingID = ingID;
    }

    /**
     *ingredent name accessor
     * @return String Ingredient name
     */
    public String getIngName()
    {
        return ingName;
    }

    /**
     *ingredient ID accessor
     * @return int ingredientr ID
     */
    public int getIngID()
    {
        return ingID;
    }

    /**
     *ingredient name mutator
     * @param ingName new ingredient name
     */
    public void setIngName(String ingName)
    {
        this.ingName = ingName;
    }

    /**
     *ingredient ID mutator
     * @param ingID new ingredient ID int
     */
    public void setIngID(int ingID)
    {
        this.ingID = ingID;
    }

    @Override
    public String toString()
    {
        return ingName + ingID;
    }
}
