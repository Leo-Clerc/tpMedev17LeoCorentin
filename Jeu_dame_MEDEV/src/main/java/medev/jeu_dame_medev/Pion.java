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
    public void deplace(boolean versDroite, Board b) {
        Point2D pos = this.getPos();
        int vertical = - this.getColor();
        int horizontal = 1;
        if(versDroite){
            horizontal = 1;
        }
        else {
            horizontal = -1;
        }
        Point2D nvllePos = new Point2D(pos.getX()+horizontal, pos.getY()+vertical);
        Point2D nvllePos2 = new Point2D(nvllePos.getX()+horizontal, nvllePos.getY()+vertical);
        if(!b.estDansLePlateau(nvllePos)){
            System.out.println("Coup illégal");
        }
        if(b.test_manger(this, nvllePos, nvllePos2)){
        }
        else if(b.case_vide(nvllePos)){
            this.setPos(nvllePos);
        }
    }
    
    
    
}
