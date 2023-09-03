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
public class NhanVien implements Serializable{
    private String Ma;
    private String name;
    private int old;
    private String email;
    private double luong;

    public NhanVien(String Ma, String name, int old, String email, double luong) {
        this.Ma = Ma;
        this.name = name;
        this.old = old;
        this.email = email;
        this.luong = luong;
    }

    public NhanVien() {
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

}
