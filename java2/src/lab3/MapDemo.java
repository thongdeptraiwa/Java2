/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author macos
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String , dataBai2> map = new HashMap<>();
        dataBai2 sv1 = new dataBai2("Tuan","CNTT",7);
        dataBai2 sv2 = new dataBai2("Thong","WEB",6);
        dataBai2 sv3 = new dataBai2("An","Mobile",9);
        map.put(sv1.getName(), sv1);
        map.put(sv2.getName(), sv2);
        map.put(sv3.getName(), sv3);
        Set<String> keys = map.keySet();
        for(String name:keys){
            dataBai2 sv = map.get(name);
            System.out.println(">Ho Va Ten: "+sv.getName());
            System.out.println(">Hoc Luc: "+sv.getHocLuc());
        }
    }
}
