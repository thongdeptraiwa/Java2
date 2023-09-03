/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.io.Serializable;

/**
 *
 * @author macos
 */
public class NhanVien_mainJFrame implements Serializable{
    private String ma;
    private String name;
    private String gioiTinh;
    private String vaiTro;

    public NhanVien_mainJFrame(String ma, String name, String gioiTinh, String vaiTro) {
        this.ma = ma;
        this.name = name;
        this.gioiTinh = gioiTinh;
        this.vaiTro = vaiTro;
    }

    public NhanVien_mainJFrame() {
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

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(String vaiTro) {
        this.vaiTro = vaiTro;
    }

    @Override
    public String toString() {
        return "NhanVien_mainJFrame{" + "ma=" + ma + ", name=" + name + ", gioiTinh=" + gioiTinh + ", vaiTro=" + vaiTro + '}';
    }
    
    
    
}
