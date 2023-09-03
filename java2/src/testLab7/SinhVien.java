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
public class SinhVien {
    public String ma;
    public String name;
    public double diem;
    public String nganh;

    public SinhVien() {
    }

    public SinhVien(String ma, String name, double diem, String nganh) {
        this.ma = ma;
        this.name = name;
        this.diem = diem;
        this.nganh = nganh;
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

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    
    
    
}
