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
public class ThoiVu extends NhanVien {
    private int ngayCong;
    private double donGia;

    public ThoiVu() {
    }

    public ThoiVu(int ngayCong, double donGia) {
        this.ngayCong = ngayCong;
        this.donGia = donGia;
    }

    public ThoiVu(int ngayCong, double donGia, int ID, String HoTen) {
        super(ID, HoTen);
        this.ngayCong = ngayCong;
        this.donGia = donGia;
    }

    public int getNgayCong() {
        return ngayCong;
    }

    public void setNgayCong(int ngayCong) {
        this.ngayCong = ngayCong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    

    @Override
    public double getLuong() {
        return ngayCong*donGia;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ngay cong: ");
        this.setNgayCong(Integer.parseInt(sc.nextLine()));
        System.out.print("Nhap don gia: ");
        this.setDonGia(Double.parseDouble(sc.nextLine()));
    }
     @Override
    public void xuat() {
        super.xuat();
         System.out.println("Ngay cong: "+getNgayCong());
         System.out.println("Don Gia: "+getDonGia());
         System.out.println("Luong TV: "+getLuong());
        
    }
}
