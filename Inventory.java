/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelly;

/**
 *creates an inventory object
 * @author kelly
 */
public class Inventory
{

    private String ingname, pool, qty, exprDate;
    private boolean shopLis, empt;
    private int ingID;

    /**
     * creates a new inventory object
     * @param ingname ingredient name as a String
     * @param pool the poolID as a String
     * @param shopLis a boolean saying whether the item is on the shopping list
     * @param empt a boolean showing whether the item is empty or not
     * @param exprDate a String that is the items expiry date
     * @param qty the quantity of the item the user has as a String
     * @param ingID the ingredients ID as an integer
     */
    public Inventory(String ingname, String pool, boolean shopLis, boolean empt, String exprDate, String qty, int ingID)
    {
        this.ingname = ingname;
        this.pool = pool;
        this.qty = qty;
        this.exprDate = exprDate;
        this.shopLis = shopLis;
        this.empt = empt;
        this.ingID = ingID;
    }

    /**
     *ingredient accessor
     * @return String 
     */
    public String getIngname()
    {
        return ingname;
    }

    /**
     *pool accessor
     * @return String
     */
    public String getPool()
    {
        return pool;
    }

    /**
     *quantity accessor
     * @return String
     */
    public String getQty()
    {
        return qty;
    }

    /**
     *quantity mutator
     * @param qty new quantity as a String
     */
    public void setQty(String qty)
    {
        this.qty = qty;
    }

    /**
     *expiry date accessor
     * @return String
     */
    public String getExprDate()
    {
        return exprDate;
    }

    /**
     *expiry date mutator
     * @param exprDate new expiry date as a String
     */
    public void setExprDate(String exprDate)
    {
        this.exprDate = exprDate;
    }

    /**
     *shopping list accessor
     * @return boolean
     */
    public boolean isShopLis()
    {
        return shopLis;
    }

    /**
     *shopping list mutator
     * @param shopLis boolean of the new shopping list
     */
    public void setShopLis(boolean shopLis)
    {
        this.shopLis = shopLis;
    }

    /**
     *empty accessor
     * @return boolean
     */
    public boolean isEmpt()
    {
        return empt;
    }

    /**
     *empty mutator
     * @param empt boolean new empty
     */
    public void setEmpt(boolean empt)
    {
        this.empt = empt;
    }

    /**
     *ingredient id accessor
     * @return integer
     */
    public int getIngID()
    {
        return ingID;
    }

    /**
     *ingredient ID mutator
     * @param ingID new ingredient ID
     */
    public void setIngID(int ingID)
    {
        this.ingID = ingID;
    }

    @Override
    public String toString()
    {
        return "Inventory{" + "ingID=" + ingname + ", pool=" + pool + ", qty=" + qty + ", exprDate=" + exprDate + ", shopLis=" + shopLis + ", empt=" + empt + '}';
    }
}
