/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author Hoangson
 */
public class Lab06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Diagram diagram = new Diagram();
        Layer layer = new Layer();
        layer.add(new Triagle(12, 12, 3, 4, 5));
        layer.add(new Rectangle(10, 2));
        layer.add(new Triagle(2, 1, 30, 40, 50));
        layer.add(new Circle(2.4));
        System.out.println("Before");
        for (int i=0;i<layer.size();i++){
            System.out.println(layer.elementAt(i).toString());
        }
        System.out.println("After");
        layer.deleteTriagle();
        for (int i=0;i<layer.size();i++){
            System.out.println(layer.elementAt(i).toString());
        }
        System.out.println("Before");
        diagram.add(layer);
        for (int i=0;i<layer.size();i++){
            System.out.println(diagram.elementAt(0).elementAt(i).toString());
        }

        diagram.deleteCircle();
        System.out.println("Aftet");
        for (int i=0;i<layer.size();i++){
            System.out.println(diagram.elementAt(0).elementAt(i).toString());
        }


    }
    
}
