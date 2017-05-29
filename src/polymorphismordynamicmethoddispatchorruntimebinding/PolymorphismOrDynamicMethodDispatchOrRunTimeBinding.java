/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismordynamicmethoddispatchorruntimebinding;

/**
 *
 * @author tiago.lucas
 */
public class PolymorphismOrDynamicMethodDispatchOrRunTimeBinding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shape s = new Shape();
        s.draw();
        
        Rectangle r = new Rectangle();
        s=r;
        s.draw();
        
        Triangle t = new Triangle();
        s=t;
        s.draw();
    }
    
}
