package br.com.model;

/**
 *
 * @author Kauai Guarilha
 */
public class Teacher extends Person {
    
    private int id;
    
    public Teacher(){
        
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
  
    public void getId(Object valueAt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
