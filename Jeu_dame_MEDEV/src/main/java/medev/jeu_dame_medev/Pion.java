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
    public void deplace(Boolean versDroite, Board b) {
        Point2D pos = this.getPos();
        int vertical = - this.getColor();
        if(versDroite){
            int horizontal = 1;
        }
        else{
            int horizontal = -1;
        }
        Point2D nvllePos = new Point2D(pos.getX()+horizontal, pos.getY()+vertical);
        if(!estDansLePlateau(nvllePos)){
            System.out.println("Coup illégal");
        }
        if(b.manger(pos,versDroite)){
            b.mange();
        }
        else if(b.caseVide(nvllePos)){
            this.setPos(nvllPos);
        }
    }
    
    
    
}
