/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM;

import java.io.Serializable;

/**
 *
 * @author macos
 */
public class datelogin implements Serializable{
    public String userName;
    public String password;

    public datelogin(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public datelogin() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
