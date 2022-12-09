/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medev.jeu_dame_medev;

/**
 *
 * @author coco
 */
public class Piece {
    
    private int color;
    
    private Point2D pos;

    public Piece(int color, Point2D pos) {
        this.color = color;
        this.pos = new Point2D(pos);
    }

    public Piece() {
        this.color = 1;
        this.pos = new Point2D(0,0);
    }
    
    public Piece(Piece p) {
        this.color = p.color;
        this.pos = new Point2D(p.pos);
    }

    public int getColor() {
        return color;
    }

    public Point2D getPos() {
        return pos;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setPos(Point2D pos) {
        this.pos = new Point2D(pos);
    }
    
    
    
    
    
    
    
    
}
