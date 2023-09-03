/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM;

/**
 *
 * @author macos
 */
public class NhanVienTim extends NhanVien{
    public int index;

    public NhanVienTim(int index, String Ma, String name, int old, String email, double luong) {
        super(Ma, name, old, email, luong);
        this.index = index;
    }

    public NhanVienTim(int index) {
        this.index = index;
    }

    public NhanVienTim() {
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
    
}
