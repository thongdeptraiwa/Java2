/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.io.Serializable;

/**
 *
 * @author macos
 */
public class student implements Serializable{
    private String name;
    private double mark;

    public student(String name, double mark) {
        this.name = name;
        this.mark = mark;
    }

    public student() {
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
     
    
}
