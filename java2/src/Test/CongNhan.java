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
public class CongNhan extends NhanVien{
    private int luongCB;
    private int hsLuong;
    private int phuCap;

    public CongNhan() {
    }

    public CongNhan(int luongCB, int hsLuong, int phuCap) {
        this.luongCB = luongCB;
        this.hsLuong = hsLuong;
        this.phuCap = phuCap;
    }

    public CongNhan(int luongCB, int hsLuong, int phuCap, int ID, String HoTen) {
        super(ID, HoTen);
        this.luongCB = luongCB;
        this.hsLuong = hsLuong;
        this.phuCap = phuCap;
    }

    public int getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(int luongCB) {
        this.luongCB = luongCB;
    }

    public int getHsLuong() {
        return hsLuong;
    }

    public void setHsLuong(int hsLuong) {
        this.hsLuong = hsLuong;
    }

    public int getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(int phuCap) {
        this.phuCap = phuCap;
    }
    
    @Override
    public double getLuong() {
        return luongCB*hsLuong+phuCap;
    }
     @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap LuongCB: ");
        this.setLuongCB(Integer.parseInt(sc.nextLine()));
        System.out.print("Nhap hsluong: ");
        this.setHsLuong(Integer.parseInt(sc.nextLine()));
        System.out.print("Nhap phucap: ");
        this.setPhuCap(Integer.parseInt(sc.nextLine()));
    }
    @Override
    public void xuat() {
        super.xuat();
        System.out.println("LuongCB: "+getLuongCB());
         System.out.println("hsLuong: "+getHsLuong());
         System.out.println("Phu cap: "+getPhuCap());
         System.out.println("Luong CN: "+getLuong());
        
    }
}
