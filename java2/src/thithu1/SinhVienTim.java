/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thithu1;

/**
 *
 * @author macos
 */
public class SinhVienTim extends SinhVien{
    private int index;

    public SinhVienTim(int index, String name, double diem) {
        super(name, diem);
        this.index = index;
    }

    public SinhVienTim(int index) {
        this.index = index;
    }

    public SinhVienTim() {
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
    
}
