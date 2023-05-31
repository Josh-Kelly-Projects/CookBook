/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelly;

/**
 *handles all operations with users
 * @author Mark
 */
public class User
{

    private String userName, pass;

    public User(String userName, String pass)
    {
        this.userName = userName;
        this.pass = pass;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setPass(String pass)
    {
        this.pass = pass;
    }

    @Override
    public String toString()
    {
        return "User{" + "userName=" + userName + ", pass=" + pass + '}';
    }
}
