/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.io.Serializable;

/**
 *
 * @author macos
 */
public class ProductDAO extends DAO<Product>{
    
    @Override
    public void update(Product entity) {
        for(int i=0;i<list.size();i++){
            if(list.get(i).getName().equals(entity.getName())){
                list.set(i, entity);
                break;
            }
        }
    }

    @Override
    public Product find(Serializable id) {
        for(Product p : list){ 
            if(p.getName().equals(id)){
                return p;
            }
        }
        return null;
    }
    
}
