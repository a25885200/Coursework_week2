/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework_week2;

import com.shape.*;

/**
 *
 * @author leung
 */
public class Coursework_week2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MakeShape ms = new MakeShape();
        ms.makeRactangle(10.1, 5.2, new Point(12,7));
        ms.makeCircle(3.9, new Point(3,5));
        ms.makeRactangle(4.4, 8, new Point(-1,7));
        ms.makeCircle(17.7, new Point(9,6));
        ms.makeCircle(2, new Point(3,5));
        ms.makeCircle(55.8, new Point(4,10));
        ms.makeRactangle(14.19, 5.12, new Point(1,99));
    }
    
}
