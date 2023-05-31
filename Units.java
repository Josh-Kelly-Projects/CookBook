/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelly;

/**
 *handles units and unit conversions
 * @author kelly
 */
public class Units
{

    static final String[] UNITS =
    {
        "g", "kg", "l", "ml"
    };

    /**
     * this method converts units of volume and mass
     *
     * @param input the amount that needs a unit convertion
     * @param dir the direction that the unit needs to go eg big to small (true
     * for small)
     * @return the amount as a double
     */
    public static double unitConverterToSmall(String input, boolean dir)
    {
        String[] splitIn = input.split(" ");
        double qty = Double.parseDouble(splitIn[0]);
        String unit = splitIn[1];
        if (dir == true && (unit.equalsIgnoreCase(UNITS[1]) || unit.equalsIgnoreCase(UNITS[2])))
        {
            qty *= 1000;
        } else if (dir == false && (unit.equalsIgnoreCase(UNITS[0]) || unit.equalsIgnoreCase(UNITS[3])))
        {
            qty *= 0.001;
        }
        return qty;
    }
}
