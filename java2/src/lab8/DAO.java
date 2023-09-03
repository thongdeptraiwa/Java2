/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author macos
 */
abstract public class DAO<Entity> {
    protected List<Entity> list = new ArrayList<Entity>();
    
    public void add(Entity entity){
        list.add(entity);
    }
    
    public void remove(Entity entity){
        list.remove(entity);
    }
    
    abstract public void update(Entity entity);
    abstract public Entity find(Serializable id);
    
    public List<Entity>  getList(){
        return list;
    }
    
    
    public void store(String path) throws FileNotFoundException, IOException, ClassNotFoundException{ 
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))){
            list = (List<Entity> ) ois.readObject();
        }        

    }
    public void load(String path) throws FileNotFoundException, IOException{
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))){
            oos.writeObject(list);
        }        

    }
    
}
