/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author macos
 */
public class main {
    public static void main(String[] args) {
        ArrayList<NhanVien> list = new ArrayList<NhanVien>();
        Scanner sc = new Scanner(System.in);
        //nhap
        for(int i=0; ;i++){
            System.out.println("Nhap sv thu "+(i+1));
            do{
                System.out.print("Nhap chuc vu: ");
                String nganh = sc.nextLine();
                if(nganh.equalsIgnoreCase("Thoi Vu")){
                    NhanVien tv = new ThoiVu();
                    tv.nhap();
                    list.add(tv);
                    break;
                }else if(nganh.equalsIgnoreCase("Cong Nhan")){
                    NhanVien cn = new CongNhan();
                    cn.nhap();
                    list.add(cn);
                    break;
                }else
                    continue;
            }while(true);
            System.out.print("Ban co muon nhap them khong(Y/N)?");
            String them = sc.nextLine();
            if(them.equalsIgnoreCase("N")||them.equalsIgnoreCase("No"))
                break;
        }
        //xuat
        System.out.println("\tDanh Sach Nhan Vien");
        for(int i=0;i<list.size();i++){
            System.out.println("*Thong Tin Nhan Vien thu "+(i+1));
            list.get(i).xuat();
            System.out.println("");
        }
    
    }
}
