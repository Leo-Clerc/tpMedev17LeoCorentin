/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medev.jeu_dame_medev;

/**
 *
 * @author coco
 */
public class Pion extends Piece implements deplace {

    public Pion(int color, Point2D pos) {
        super(color, pos);
    }

    public Pion() {
        super();
    }

    public Pion(Piece p) {
        super(p);
    }
    
    
    @Override
    public boolean deplace(Board b) {
        boolean a = true;
        
        return a;
    }
    
    
    
}
