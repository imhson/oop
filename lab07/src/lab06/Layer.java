package lab06;
import java.util.ArrayList;
import java.util.Collection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hoangson
 * @param <Shape>
 */
public class Layer<Shape> extends ArrayList<Shape>{
    boolean visible; 

    public Layer() {
    }

    public Layer(Collection<? extends Shape> c) {
        super(c);
    }

    public Layer(boolean visible) {
        this.visible = visible;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    
    public void deleteTriangleObject (){
        for (int i=0;i<this.size();i++) {
            if (this.get(i) instanceof TriangleObject) {
                this.remove(this.get(i));
            }
        }
    }
    public void deleteSameObject(){
        for (int i=0;i<this.size()-1;i++){
            for (int j=i+1;j<this.size();j++){
                if (this.get(i) instanceof CircleObject){
                    if (this.get(j) instanceof CircleObject){
                        
                    }
                }
            }
        }
    }
}
