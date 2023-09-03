/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.Scanner;

/**
 *
 * @author macos
 */
public abstract class NhanVien {
    private int ID;
    private String HoTen;

    public NhanVien() {
    }

    public NhanVien(int ID, String HoTen) {
        this.ID = ID;
        this.HoTen = HoTen;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }
    public abstract double getLuong();
        
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID: ");
        this.setID(Integer.parseInt(sc.nextLine()));
        System.out.print("Nhap ho ten: ");
        this.setHoTen(sc.nextLine());
    }
    public void xuat(){
        System.out.println("ID: "+getID());
        System.out.println("Ho ten: "+getHoTen());
        
    }
    
}
