/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thi;

import java.io.Serializable;

/**
 *
 * @author macos
 */
public class NhanVien implements Serializable{
    public String ma;
    public String name;
    public String sdt;

    public NhanVien(String ma, String name, String sdt) {
        this.ma = ma;
        this.name = name;
        this.sdt = sdt;
    }

    public NhanVien() {
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
    
}
