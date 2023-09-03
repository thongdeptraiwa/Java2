/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.io.Serializable;
/**
 *
 * @author macos
 */
public class dataBai4 implements Serializable{
    private String UserName;
    private String PassWord;
    private String Role;

    public dataBai4(String UserName, String PassWord, String Role) {
        this.UserName = UserName;
        this.PassWord = PassWord;
        this.Role = Role;
    }

    public dataBai4() {
    }
    
    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }
    
}
