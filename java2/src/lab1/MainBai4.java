/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.ArrayList;

/**
 *
 * @author macos
 */
public class MainBai4 {
     public static void main(String[] args) {
        ArrayList<Product>  list = new ArrayList<Product>();
        //nhap
        for(int i=0;i<2;i++){
            System.out.printf("Nhap thong tin Product thu %d:\n",i+1);
            Product sp = new Product();
            sp.nhap();
            list.add(sp);
            list.get(i).insert();
            list.get(i).update();
            list.get(i).delete();
            list.get(i).create();
        }
        //nhap ko thue
        System.out.println("Nhap thong tin Product thu 3:");
            Product sp = new NoTaxProduct();
            sp.nhap();
            list.add(sp);
        //xuat
        System.out.println("Danh sach Product");
        System.out.printf("%-30s\t|\t%10s\t|\t%10s\n","Name","Price","GetImportTax");
        for(Product i: list){           
            i.xuat();
            System.out.println("");
        }
    }
}
