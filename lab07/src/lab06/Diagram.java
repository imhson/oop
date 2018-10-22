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
 */
public class Diagram<Shape> extends ArrayList<ArrayList<Shape>>{

    public Diagram() {
    }

    public Diagram(Collection<? extends ArrayList<Shape>> c) {
        super(c);
    }
    
    public void deleteCircleObject (){
        for (int j=0;j<this.size();j++) {
            ArrayList<Shape> element = this.get(j);
             for (int i=0;i<element.size();i++){
                 if (element.get(i) instanceof CircleObject){
                     element.remove(i);
                     i--;
                 }
                 
             }
        }
    }

}
