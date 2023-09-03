/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author macos
 */
public class Product implements Dao{
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product() {
    }
    
    public double getImportTax(){
        return this.price * 0.1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap name: ");
        this.setName(sc.nextLine());
        System.out.print("Nhap price: ");
        this.setPrice(Double.parseDouble(sc.nextLine()));
    }
    public void xuat(){
        System.out.printf("%-30s\t|\t%10.0f\t|\t%10.0f",this.name,this.price,this.getImportTax());
    }

    @Override
    public void insert() {
        System.out.println("Insert thanh cong");
    }

    @Override
    public void update() {
        System.out.println("update thanh cong");
    }

    @Override
    public void delete() {
        System.out.println("delete thanh cong");
    }

    @Override
    public void create() {
        System.out.println("create thanh cong");
    }

    
}
