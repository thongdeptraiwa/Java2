/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thithu1;

import java.io.Serializable;

/**
 *
 * @author macos
 */
public class SinhVien implements Serializable{
    private String name;
    private double diem;

    public SinhVien(String name, double diem) {
        this.name = name;
        this.diem = diem;
    }

    public SinhVien() {
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
    
    
}
