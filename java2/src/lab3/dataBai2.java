/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author macos
 */
public class dataBai2 {
    private String name;
    private String nganh;
    private double diem;

    public dataBai2(String name, String nganh, double diem) {
        this.name = name;
        this.nganh = nganh;
        this.diem = diem;
    }

    public dataBai2() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    
    public String getHocLuc(){
        if(this.diem < 3)
            return "Kém";
        if(this.diem < 5)
            return "Yếu";
        if(this.diem < 6.5)
            return "Trung Bình";
        if(this.diem < 7.5)
            return "Khá";
        if(this.diem < 9)
            return "Giỏi";
        return "Xuất sắt";
    }
    public boolean isThuong(){
        return this.diem >= 7.5;
    }
}
