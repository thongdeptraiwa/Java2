/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testLab7;

/**
 *
 * @author macos
 */
public enum TaiKhoan {
    
    user1("caodang","123","Thong"),
    user2("daihoc","123","Thien");
    public String user;
    public String pass;
    public String name;

    private TaiKhoan(String user, String pass, String name) {
        this.user = user;
        this.pass = pass;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
}
